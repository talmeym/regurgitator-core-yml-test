/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

public class BuildParameterYmlLoaderTest extends YmlLoaderTest {
    public BuildParameterYmlLoaderTest() {
        super(new BuildParameterYmlLoader());
    }

    @Test
    public void testMinimumYml() throws Exception {
        assertExpectation("classpath:/BuildParameter_min.yml", "com.emarte.regurgitator.core.BuildParameter:['build-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],null]");
    }

    @Test
    public void testMaximumYml() throws Exception {
        assertExpectation("classpath:/BuildParameter_max.yml", "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
    }

    @Test
    public void testMaximumFlatYml() throws Exception {
        assertExpectation("classpath:/BuildParameter_maxFlat.yml", "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
    }

    @Test
    public void testFullLoad() throws Exception {
        ConfigurationFile.loadFile("classpath:/BuildParameter_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilder.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlEmptyBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyBuilder.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlEmptyProcessor() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyProcessor.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingBuilderClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilderClass.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingProcessorClass.yml");
    }
}
