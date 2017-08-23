package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.Step;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;

import java.util.Map;
import java.util.Set;

import static com.emarte.regurgitator.core.YmlConfigUtil.loadId;

public class TestStepYmlLoader implements YmlLoader<Step> {
	@Override
	public Step load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
		return new TestStep(loadId(yaml, allIds));
	}
}
