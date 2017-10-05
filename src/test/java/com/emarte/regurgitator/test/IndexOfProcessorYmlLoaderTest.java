package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.IndexOfProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class IndexOfProcessorYmlLoaderTest extends YmlLoaderTest {
    public IndexOfProcessorYmlLoaderTest() {
        super(new IndexOfProcessorYmlLoader());
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_source.yml", "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_value.yml", "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[null,'value'],false]");
    }

    @Test
    public void testSourceAndValue() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_sourceAndValue.yml", "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],false]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/IndexOfProcessor_fullLoad.yml");
    }
}
