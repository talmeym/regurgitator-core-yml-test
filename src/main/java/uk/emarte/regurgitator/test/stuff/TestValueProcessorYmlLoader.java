/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.ValueProcessor;
import uk.emarte.regurgitator.core.Yaml;
import uk.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestValueProcessorYmlLoader implements YmlLoader<ValueProcessor> {
    @Override
    public ValueProcessor load(Yaml yaml, Set<Object> allIds) {
        return new TestValueProcessor();
    }
}
