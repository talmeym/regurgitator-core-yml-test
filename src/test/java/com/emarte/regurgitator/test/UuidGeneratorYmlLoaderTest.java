/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.UuidGeneratorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class UuidGeneratorYmlLoaderTest extends YmlLoaderTest {
    public UuidGeneratorYmlLoaderTest() {
        super(new UuidGeneratorYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/UuidGenerator.yml", "com.emarte.regurgitator.core.UuidGenerator:[]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/UuidGenerator_fullLoad.yml");
    }
}
