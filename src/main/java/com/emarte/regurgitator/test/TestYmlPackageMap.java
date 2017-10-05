package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.AbstractYmlPackageMap;

import java.util.Arrays;
import java.util.List;

public class TestYmlPackageMap extends AbstractYmlPackageMap {
    private static List<String> kinds = Arrays.asList("test-value-generator", "test-value-builder", "test-value-validator", "test-value-processor", "test-step", "test-condition-behaviour", "test-rules-behaviour");

    public TestYmlPackageMap() {
        addPackageMapping(kinds, "com.emarte.regurgitator.test.stuff");
    }
}
