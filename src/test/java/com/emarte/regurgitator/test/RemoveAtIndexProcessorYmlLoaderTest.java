/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.RemoveAtIndexProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.RemoveAtIndexProcessor_source;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.RemoveAtIndexProcessor_value;

public class RemoveAtIndexProcessorYmlLoaderTest extends YmlLoaderTest {
    public RemoveAtIndexProcessorYmlLoaderTest() {
        super(new RemoveAtIndexProcessorYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/RemoveAtIndexProcessor_value.yml", RemoveAtIndexProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/RemoveAtIndexProcessor_source.yml", RemoveAtIndexProcessor_source);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/RemoveAtIndexProcessor_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingIndexSource() throws Exception {
        loadFile("classpath:/RemoveAtIndexProcessor_missingIndexSource.yml");
    }
}
