package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.RulesBehaviour;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestRulesBehaviourYmlLoader implements YmlLoader<RulesBehaviour> {
	@Override
	public RulesBehaviour load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
		return new TestRulesBehaviour();
	}
}
