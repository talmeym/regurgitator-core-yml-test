/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.SubstituteProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SubstituteProcessorYmlLoaderTest extends YmlLoaderTest {
    public SubstituteProcessorYmlLoaderTest() {
        super(new SubstituteProcessorYmlLoader());
    }

    @Test
    public void testMinimumYml() throws Exception {
        assertExpectation("classpath:/SubstituteProcessor_min.yml", "com.emarte.regurgitator.core.SubstituteProcessor:['this','that']");
    }

    @Test
    public void testFullLoadYml() throws RegurgitatorException {
        loadFile("classpath:/SubstituteProcessor_fullLoad.yml");
    }
}
