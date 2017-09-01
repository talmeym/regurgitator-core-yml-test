package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestConditionBehaviourYmlLoader implements YmlLoader<TestConditionBehaviour> {
	@Override
	public TestConditionBehaviour load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
		return new TestConditionBehaviour();
	}
}
