/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SequenceYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class SequenceYmlLoaderTest extends YmlLoaderTest {
    public SequenceYmlLoaderTest() {
        super(new SequenceYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/Sequence_min.yml", Sequence_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/Sequence_max.yml", Sequence_max);
    }

    @Test
    public void testIsolate() throws Exception {
        assertExpectation("classpath:/Sequence_isolate.yml", Sequence_isolate);
    }

    @Test
    public void testIsolateWithParams() throws Exception {
        assertExpectation("classpath:/Sequence_isolateParams.yml", Sequence_isolateParams);
    }

    @Test
    public void testIsolateWithSession() throws Exception {
        assertExpectation("classpath:/Sequence_isolateSession.yml", Sequence_isolateSession);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/Sequence_fullLoad.yml");
    }
}
