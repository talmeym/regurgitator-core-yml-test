/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SequenceYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SequenceYmlLoaderTest extends YmlLoaderTest {
    public SequenceYmlLoaderTest() {
        super(new SequenceYmlLoader());
    }

    @Test
    public void testMinimumYml() throws Exception {
        assertExpectation("classpath:/Sequence_min.yml", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],null]");
    }

    @Test
    public void testMaximumYml() throws Exception {
        assertExpectation("classpath:/Sequence_max.yml", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[true,true]]");
    }

    @Test
    public void testIsolateYml() throws Exception {
        assertExpectation("classpath:/Sequence_isolate.yml", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[false,false]]");
    }

    @Test
    public void testIsolateWithParamsYml() throws Exception {
        assertExpectation("classpath:/Sequence_isolateParams.yml", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[false,true]]");
    }

    @Test
    public void testIsolateWithSessionYml() throws Exception {
        assertExpectation("classpath:/Sequence_isolateSession.yml", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[true,false]]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/Sequence_fullLoad.yml");
    }
}
