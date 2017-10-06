/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.AbstractYmlPackageMap;

import java.util.Arrays;
import java.util.List;

public class TestYmlPackageMap extends AbstractYmlPackageMap {
    private static final List<String> kinds = Arrays.asList("test-value-generator", "test-value-builder", "test-value-validator", "test-value-processor", "test-step", "test-condition-behaviour", "test-rules-behaviour");

    public TestYmlPackageMap() {
        addPackageMapping(kinds, "com.emarte.regurgitator.test.stuff");
    }
}
