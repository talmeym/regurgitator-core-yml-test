/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.ExtractProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class ExtractProcessorYmlLoaderTest extends YmlLoaderTest {
    public ExtractProcessorYmlLoaderTest() {
        super(new ExtractProcessorYmlLoader());
    }

    @Test
    public void testMinimumYml() throws Exception {
        assertExpectation("classpath:/ExtractProcessor_min.yml", "com.emarte.regurgitator.core.ExtractProcessor:['this is {0} test',0]");
    }

    @Test
    public void testFullLoadYml() throws Exception {
        loadFile("classpath:/ExtractProcessor_fullLoad.yml");
    }
}
