package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SequenceRefYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SequenceRefYmlLoaderTest extends YmlLoaderTest {
    public SequenceRefYmlLoaderTest() {
        super(new SequenceRefYmlLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/SequenceRef_min.yml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],null]],null]");
    }

    @Test
    public void testFullLoadJson() throws Exception {
        loadFile("classpath:/SequenceRef_fullLoad.yml");
    }
}
