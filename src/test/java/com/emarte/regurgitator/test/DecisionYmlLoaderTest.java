/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.ConfigurationFile;
import com.emarte.regurgitator.core.DecisionYmlLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class DecisionYmlLoaderTest extends YmlLoaderTest {
    public DecisionYmlLoaderTest() {
        super(new DecisionYmlLoader());
    }

    @Test
    public void testMimimum() throws Exception {
        assertExpectation("classpath:/Decision_min.yml", Decision_min);
    }

    @Test
    public void testMinimumMinimum() throws Exception {
        assertExpectation("classpath:/Decision_minMin.yml", Decision_minMin);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/Decision_max.yml", Decision_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        ConfigurationFile.loadFile("classpath:/Decision_fullLoad.yml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingStep() throws Exception {
        loadFromFile("classpath:/Decision_missingStep.yml");
    }
}
