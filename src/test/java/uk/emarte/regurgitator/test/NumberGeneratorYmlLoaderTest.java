/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.NumberGeneratorYmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.NumberGenerator;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.NumberGenerator_max;

public class NumberGeneratorYmlLoaderTest extends YmlLoaderTest {
    public NumberGeneratorYmlLoaderTest() {
        super(new NumberGeneratorYmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/NumberGenerator.yml", NumberGenerator);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/NumberGenerator_max.yml", NumberGenerator_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/NumberGenerator_fullLoad.yml");
    }
}
