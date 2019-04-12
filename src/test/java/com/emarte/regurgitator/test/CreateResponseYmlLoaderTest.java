/* * Copyright (C) 2017 Miles Talmey. * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT). */package com.emarte.regurgitator.test;import com.emarte.regurgitator.core.CreateResponseYmlLoader;import com.emarte.regurgitator.core.RegurgitatorException;import org.junit.Test;import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;public class CreateResponseYmlLoaderTest extends YmlLoaderTest {    public CreateResponseYmlLoaderTest() {        super(new CreateResponseYmlLoader());    }    @Test    public void testValue() throws Exception {        assertExpectation("classpath:/CreateResponse_value.yml", CreateResponse_value);    }    @Test    public void testFile() throws Exception {        assertExpectation("classpath:/CreateResponse_file.yml", CreateResponse_file);    }    @Test    public void testSource() throws Exception {        assertExpectation("classpath:/CreateResponse_source.yml", CreateResponse_source);    }    @Test    public void testSourceAndValue() throws Exception {        assertExpectation("classpath:/CreateResponse_sourceAndValue.yml", CreateResponse_sourceAndValue);    }    @Test    public void testSourceAndFile() throws Exception {        assertExpectation("classpath:/CreateResponse_sourceAndFile.yml", CreateResponse_sourceAndFile);    }    @Test    public void testProcessor() throws Exception {        assertExpectation("classpath:/CreateResponse_processorFlat.yml", CreateResponse_processor);    }    @Test    public void testProcessorFlat() throws Exception {        assertExpectation("classpath:/CreateResponse_processorFlat.yml", CreateResponse_processorFlat);    }    @Test    public void testMultipleProcessors() throws Exception {        assertExpectation("classpath:/CreateResponse_multipleProcessors.Yml", CreateResponse_multipleProcessors);    }    @Test    public void testMultipleProcessorsFlat() throws Exception {        assertExpectation("classpath:/CreateResponse_multipleProcessorsFlat.Yml", CreateResponse_multipleProcessorsFlat);    }    @Test    public void testFullLoad() throws Exception {        loadFile("classpath:/CreateResponse_fullLoad.yml");    }    @Test(expected = RegurgitatorException.class)    public void testValueAndFileException() throws Exception {        loadFromFile("classpath:/CreateResponse_valueAndFile.yml");    }    @Test(expected = RegurgitatorException.class)    public void testNothingException() throws Exception {        loadFromFile("classpath:/CreateResponse_nothing.yml");    }    @Test(expected = RegurgitatorException.class)    public void testMissingFileException() throws Exception {        loadFromFile("classpath:/CreateResponse_missingFile.yml");    }}