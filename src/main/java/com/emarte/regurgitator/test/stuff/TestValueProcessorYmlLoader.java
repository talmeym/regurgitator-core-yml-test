/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestValueProcessorYmlLoader implements YmlLoader<ValueProcessor> {
    @Override
    public ValueProcessor load(Yaml yaml, Set<Object> allIds) {
        return new TestValueProcessor();
    }
}
