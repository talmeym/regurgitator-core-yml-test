/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.GenerateParameterYmlLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class GenerateParameterYmlLoaderTest extends YmlLoaderTest {
    public GenerateParameterYmlLoaderTest() {
        super(new GenerateParameterYmlLoader());
    }

    @Test
    public void testMinimumYml() throws Exception {
        assertExpectation("classpath:/GenerateParameter_min.yml", "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.UuidGenerator:[],null]");
    }

    @Test
    public void testMaximumYml() throws Exception {
        assertExpectation("classpath:/GenerateParameter_max.yml", "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
    }

    @Test
    public void testMaximumFlatYml() throws Exception {
        assertExpectation("classpath:/GenerateParameter_maxFlat.yml", "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
    }

    @Test
    public void testFullLoadYml() throws Exception {
        loadFile("classpath:/GenerateParameter_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlEmptyProcessor() throws Exception {
        loadFromFile("classpath:/GenerateParameter_emptyProcessor.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/GenerateParameter_missingProcessorClass.yml");
    }
}
