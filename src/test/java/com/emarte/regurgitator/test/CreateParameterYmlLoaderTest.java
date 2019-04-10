/* * Copyright (C) 2017 Miles Talmey. * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT). */package com.emarte.regurgitator.test;import com.emarte.regurgitator.core.CreateParameterYmlLoader;import com.emarte.regurgitator.core.RegurgitatorException;import org.junit.Test;import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;public class CreateParameterYmlLoaderTest extends YmlLoaderTest {    public CreateParameterYmlLoaderTest() {        super(new CreateParameterYmlLoader());    }    @Test    public void testValue() throws Exception {        assertExpectation("classpath:/CreateParameter_value.yml", CreateParameter_value);    }    @Test    public void testFile() throws Exception {        assertExpectation("classpath:/CreateParameter_file.yml", CreateParameter_file);    }    @Test    public void testSource() throws Exception {        assertExpectation("classpath:/CreateParameter_source.yml", CreateParameter_source);    }    @Test    public void testSourceAndValue() throws Exception {        assertExpectation("classpath:/CreateParameter_sourceAndValue.yml", CreateParameter_sourceAndValue);    }    @Test    public void testSourceAndFile() throws Exception {        assertExpectation("classpath:/CreateParameter_sourceAndFile.yml", CreateParameter_sourceAndFile);    }    @Test    public void testProcessor() throws Exception {        assertExpectation("classpath:/CreateParameter_processor.yml", CreateParameter_processor);    }    @Test    public void testProcessorConfig() throws Exception {        assertExpectation("classpath:/CreateParameter_processorConfig.yml", CreateParameter_processorConfig);    }    @Test    public void testFullLoad() throws Exception {        loadFile("classpath:/CreateParameter_fullLoad.yml");    }    @Test(expected = RegurgitatorException.class)    public void testNothingException() throws Exception {        loadFromFile("classpath:/CreateParameter_nothing.yml");    }    @Test(expected = RegurgitatorException.class)    public void testMissingFileException() throws Exception {        loadFromFile("classpath:/CreateParameter_missingFile.yml");    }}