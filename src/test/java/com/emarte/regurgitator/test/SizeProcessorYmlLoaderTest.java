package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SizeProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SizeProcessorYmlLoaderTest extends YmlLoaderTest {
	public SizeProcessorYmlLoaderTest() {
		super(new SizeProcessorYmlLoader());
	}

	@Test
	public void testYml() throws Exception {
		assertExpectation("classpath:/SizeProcessor.yml", "com.emarte.regurgitator.core.SizeProcessor:[false]");
	}

	@Test
	public void testLastIndex() throws Exception {
		assertExpectation("classpath:/SizeProcessor_asIndex.yml", "com.emarte.regurgitator.core.SizeProcessor:[true]");
	}

	@Test
	public void testFullLoad() throws Exception {
		loadFile("classpath:/SizeProcessor_fullLoad.yml");
	}
}
