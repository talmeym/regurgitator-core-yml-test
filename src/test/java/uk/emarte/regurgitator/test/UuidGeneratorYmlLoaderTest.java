/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.UuidGeneratorYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.UuidGenerator;

public class UuidGeneratorYmlLoaderTest extends YmlLoaderTest {
    public UuidGeneratorYmlLoaderTest() {
        super(new UuidGeneratorYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/UuidGenerator.yml", UuidGenerator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/UuidGenerator_fullLoad.yml");
    }
}
