/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.ValueBuilder;
import uk.emarte.regurgitator.core.Yaml;
import uk.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestValueBuilderYmlLoader implements YmlLoader<ValueBuilder> {
    @Override
    public ValueBuilder load(Yaml yaml, Set<Object> allIds) {
        return new TestValueBuilder();
    }
}
