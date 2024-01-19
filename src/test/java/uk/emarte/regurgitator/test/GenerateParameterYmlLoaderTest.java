/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.GenerateParameterYmlLoader;
import uk.emarte.regurgitator.core.RegurgitatorException;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class GenerateParameterYmlLoaderTest extends YmlLoaderTest {
    public GenerateParameterYmlLoaderTest() {
        super(new GenerateParameterYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/GenerateParameter_min.yml", GenerateParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/GenerateParameter_max.yml", GenerateParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/GenerateParameter_maxFlat.yml", GenerateParameter_maxFlat);
    }

    @Test
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/GenerateParameter_multipleProcessors.yml", GenerateParameter_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/GenerateParameter_multipleProcessorsFlat.yml", GenerateParameter_multipleProcessorsFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/GenerateParameter_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidYmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/GenerateParameter_missingProcessorClass.yml");
    }
}
