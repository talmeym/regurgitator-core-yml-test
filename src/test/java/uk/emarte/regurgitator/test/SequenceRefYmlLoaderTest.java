/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.SequenceRefYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SequenceRef_min;

public class SequenceRefYmlLoaderTest extends YmlLoaderTest {
    public SequenceRefYmlLoaderTest() {
        super(new SequenceRefYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/SequenceRef_min.yml", SequenceRef_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SequenceRef_fullLoad.yml");
    }
}
