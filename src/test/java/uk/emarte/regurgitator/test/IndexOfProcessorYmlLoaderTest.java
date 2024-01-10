/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.IndexOfProcessorYmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class IndexOfProcessorYmlLoaderTest extends YmlLoaderTest {
    public IndexOfProcessorYmlLoaderTest() {
        super(new IndexOfProcessorYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_value.yml", IndexOfProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_source.yml", IndexOfProcessor_source);
    }

    @Test
    public void testSourceAndValue() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_sourceAndValue.yml", IndexOfProcessor_sourceAndValue);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/IndexOfProcessor_fullLoad.yml");
    }
}
