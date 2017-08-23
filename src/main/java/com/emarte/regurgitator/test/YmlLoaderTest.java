package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.FileUtil;
import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;
import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.core.FileUtil.streamToString;
import static org.junit.Assert.assertEquals;

public class YmlLoaderTest {
	private final YmlLoader toTest;

	public YmlLoaderTest(YmlLoader toTest) {
		this.toTest = toTest;
	}

	protected Yaml getYaml(String filePath) throws IOException {
		YamlReader reader = new YamlReader(streamToString(FileUtil.getInputStreamForFile(filePath)));
		Map map = (Map) reader.read();
		String type = (String) map.keySet().iterator().next();
		return new Yaml(type, (Map) map.get(type));
	}

	protected String loadFromFile(String filePath) throws RegurgitatorException, IOException {
		return toTest.load(getYaml(filePath), new HashSet<Object>()).toString();
	}

	protected final void assertExpectation(String filePath, String expected) throws RegurgitatorException, IOException {
		assertEquals(expected, loadFromFile(filePath));
	}

	protected final void assertExpectationFullLoad(String filePath, String expected) throws RegurgitatorException {
		assertEquals(expected, loadFile(filePath).toString());
	}
}
