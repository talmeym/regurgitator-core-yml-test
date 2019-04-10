/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SequenceRefYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

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
