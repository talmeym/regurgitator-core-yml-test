package com.emarte.regurgitator.test;import com.emarte.regurgitator.core.CreateParameterYmlLoader;import com.emarte.regurgitator.core.RegurgitatorException;import org.junit.Test;import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;public class CreateParameterYmlLoaderTest extends YmlLoaderTest {	public CreateParameterYmlLoaderTest() {		super(new CreateParameterYmlLoader());	}	@Test	public void testValueYml() throws Exception {		assertExpectation("classpath:/CreateParameter_value.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[null,'value'],null]");	}	@Test	public void testFileYml() throws Exception {		assertExpectation("classpath:/CreateParameter_file.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[null,'file-value'],null]");	}	@Test	public void testSourceYml() throws Exception {		assertExpectation("classpath:/CreateParameter_source.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],null]");	}	@Test	public void testSourceAndValueYml() throws Exception {		assertExpectation("classpath:/CreateParameter_sourceAndValue.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],null]");	}	@Test	public void testSourceAndFileYml() throws Exception {		assertExpectation("classpath:/CreateParameter_sourceAndFile.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'file-value'],null]");	}	@Test	public void testProcessorYml() throws Exception {		assertExpectation("classpath:/CreateParameter_processor.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");	}	@Test	public void testProcessorConfigYml() throws Exception {		assertExpectation("classpath:/CreateParameter_processorConfig.yml", "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");	}	@Test	public void testFullLoadYml() throws Exception {		loadFile("classpath:/CreateParameter_fullLoad.yml");	}	@Test(expected = RegurgitatorException.class)	public void testNothingExceptionYml() throws Exception {		loadFromFile("classpath:/CreateParameter_nothing.yml");	}	@Test(expected = RegurgitatorException.class)	public void testMissingFileExceptionYml() throws Exception {		loadFromFile("classpath:/CreateParameter_missingFile.yml");	}}