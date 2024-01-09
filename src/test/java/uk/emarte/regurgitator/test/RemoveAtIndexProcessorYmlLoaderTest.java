/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.RemoveAtIndexProcessorYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

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
