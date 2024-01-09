/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.SubstituteProcessorYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SubstituteProcessor_min;

public class SubstituteProcessorYmlLoaderTest extends YmlLoaderTest {
    public SubstituteProcessorYmlLoaderTest() {
        super(new SubstituteProcessorYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/SubstituteProcessor_min.yml", SubstituteProcessor_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SubstituteProcessor_fullLoad.yml");
    }
}
