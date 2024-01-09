/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.ExtractProcessorYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class ExtractProcessorYmlLoaderTest extends YmlLoaderTest {
    public ExtractProcessorYmlLoaderTest() {
        super(new ExtractProcessorYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ExtractProcessor_min.yml", ExtractProcessor_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/ExtractProcessor_fullLoad.yml");
    }
}
