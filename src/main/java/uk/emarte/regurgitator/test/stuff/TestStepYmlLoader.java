/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.Step;
import uk.emarte.regurgitator.core.Yaml;
import uk.emarte.regurgitator.core.YmlLoader;

import java.util.Set;

import static uk.emarte.regurgitator.core.YmlConfigUtil.loadId;

public class TestStepYmlLoader implements YmlLoader<Step> {
    @Override
    public Step load(Yaml yaml, Set<Object> allIds) throws RegurgitatorException {
        return new TestStep(loadId(yaml, allIds));
    }
}
