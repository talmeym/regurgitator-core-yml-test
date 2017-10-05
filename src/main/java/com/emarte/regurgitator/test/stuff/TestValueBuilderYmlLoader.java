package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.ValueBuilder;
import com.emarte.regurgitator.core.Yaml;
import com.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

public class TestValueBuilderYmlLoader implements YmlLoader<ValueBuilder> {
    @Override
    public ValueBuilder load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
        return new TestValueBuilder();
    }
}
