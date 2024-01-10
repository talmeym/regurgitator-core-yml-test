/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import com.esotericsoftware.yamlbeans.YamlReader;
import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.Yaml;
import uk.emarte.regurgitator.core.YmlLoader;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.core.FileUtil.getInputStreamForFile;
import static uk.emarte.regurgitator.core.FileUtil.streamToString;

public class YmlLoaderTest {
    private final YmlLoader toTest;

    public YmlLoaderTest(YmlLoader toTest) {
        this.toTest = toTest;
    }

    String loadFromFile(String filePath) throws RegurgitatorException, IOException {
        return toTest.load(getYaml(filePath), new HashSet<Object>()).toString();
    }

    private Yaml getYaml(String filePath) throws IOException {
        String yaml = streamToString(getInputStreamForFile(filePath));
        return new Yaml((Map) new YamlReader(yaml).read());
    }

    protected final void assertExpectation(String filePath, String expected) throws RegurgitatorException, IOException {
        assertEquals(expected, loadFromFile(filePath));
    }

    protected final void assertExpectationFullLoad(String filePath, String expected) throws RegurgitatorException {
        assertEquals(expected, loadFile(filePath).toString());
    }
}
