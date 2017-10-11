/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;

import java.util.Set;

public class TestValueBuilderYmlLoader implements YmlLoader<ValueBuilder> {
    @Override
    public ValueBuilder load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
        return new TestValueBuilder();
    }
}
