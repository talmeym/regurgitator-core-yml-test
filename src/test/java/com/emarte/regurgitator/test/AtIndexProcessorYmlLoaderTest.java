/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.AtIndexProcessorYmlLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class AtIndexProcessorYmlLoaderTest extends YmlLoaderTest {
    public AtIndexProcessorYmlLoaderTest() {
        super(new AtIndexProcessorYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/AtIndexProcessor_value.yml", AtIndexProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/AtIndexProcessor_source.yml", AtIndexProcessor_source);
    }

    @Test
    public void testSourceAndValue() throws Exception {
        assertExpectation("classpath:/AtIndexProcessor_sourceAndValue.yml", AtIndexProcessor_sourceAndValue);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/AtIndexProcessor_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingSourceAndValue() throws Exception {
        loadFile("classpath:/AtIndexProcessor_missingSourceAndValue.yml");
    }
}
