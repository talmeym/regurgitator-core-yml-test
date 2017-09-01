package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.ValueGenerator;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestValueGeneratorYmlLoader implements YmlLoader<ValueGenerator> {
	@Override
	public ValueGenerator load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
		return new TestValueGenerator();
	}
}
