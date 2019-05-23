/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.ListProcessorYmlLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.ListProcessor;

public class ListProcessorYmlLoaderTest extends YmlLoaderTest {
    public ListProcessorYmlLoaderTest() {
        super(new ListProcessorYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/ListProcessor.yml", ListProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/ListProcessor_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingProcessors() throws Exception {
        loadFile("classpath:/ListProcessor_missingProcessors.yml");
    }
}
