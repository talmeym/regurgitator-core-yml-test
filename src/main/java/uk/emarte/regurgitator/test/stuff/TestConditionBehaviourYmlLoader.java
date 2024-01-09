/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.Yaml;
import uk.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestConditionBehaviourYmlLoader implements YmlLoader<TestConditionBehaviour> {
    @Override
    public TestConditionBehaviour load(Yaml yaml, Set<Object> allIds) {
        return new TestConditionBehaviour();
    }
}
