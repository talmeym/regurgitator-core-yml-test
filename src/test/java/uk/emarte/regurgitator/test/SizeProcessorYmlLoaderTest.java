/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.SizeProcessorYmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SizeProcessor;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SizeProcessor_asIndex;

public class SizeProcessorYmlLoaderTest extends YmlLoaderTest {
    public SizeProcessorYmlLoaderTest() {
        super(new SizeProcessorYmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/SizeProcessor.yml", SizeProcessor);
    }

    @Test
    public void testLastIndex() throws Exception {
        assertExpectation("classpath:/SizeProcessor_asIndex.yml", SizeProcessor_asIndex);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SizeProcessor_fullLoad.yml");
    }
}
