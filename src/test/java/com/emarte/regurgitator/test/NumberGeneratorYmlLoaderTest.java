package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.NumberGeneratorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class NumberGeneratorYmlLoaderTest extends YmlLoaderTest {
    public NumberGeneratorYmlLoaderTest() {
        super(new NumberGeneratorYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/NumberGenerator.yml", "com.emarte.regurgitator.core.NumberGenerator:[null]");
    }

    @Test
    public void testMax() throws Exception {
        assertExpectation("classpath:/NumberGenerator_max.yml", "com.emarte.regurgitator.core.NumberGenerator:[1234]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/NumberGenerator_fullLoad.yml");
    }
}
