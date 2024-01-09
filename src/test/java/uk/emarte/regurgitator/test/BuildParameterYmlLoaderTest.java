/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.BuildParameterYmlLoader;
import uk.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class BuildParameterYmlLoaderTest extends YmlLoaderTest {
    public BuildParameterYmlLoaderTest() {
        super(new BuildParameterYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/BuildParameter_min.yml", BuildParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/BuildParameter_max.yml", BuildParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/BuildParameter_maxFlat.yml", BuildParameter_maxFlat);
    }

    @Test
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/BuildParameter_multipleProcessors.yml", BuildParameter_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/BuildParameter_multipleProcessorsFlat.yml", BuildParameter_multipleProcessorsFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/BuildParameter_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilder.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlEmptyBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyBuilder.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlEmptyProcessor() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyProcessor.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingBuilderClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilderClass.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingProcessorClass.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonBothProcessorAndProcessorsPresent() throws Exception {
        loadFromFile("classpath:/BuildParameter_processorAndProcessors.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonProcessorContainsArray() throws Exception {
        loadFromFile("classpath:/BuildParameter_processorAsArray.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonProcessorsContainsObject() throws Exception {
        loadFromFile("classpath:/BuildParameter_processorsAsObject.yml");
    }
}
