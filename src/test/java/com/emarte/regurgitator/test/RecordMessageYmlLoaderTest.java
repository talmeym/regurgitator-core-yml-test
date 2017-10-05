package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RecordMessageYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class RecordMessageYmlLoaderTest extends YmlLoaderTest {
    public RecordMessageYmlLoaderTest() {
        super(new RecordMessageYmlLoader());
    }

    @Test
    public void testMin() throws Exception {
        assertExpectation("classpath:/RecordMessage_min.yml", "com.emarte.regurgitator.core.RecordMessage:['record-message-1',null]");
    }

    @Test
    public void testFolder() throws Exception {
        assertExpectation("classpath:/RecordMessage_folder.yml", "com.emarte.regurgitator.core.RecordMessage:['record-message-1','/folder/folder']");
    }

    @Test
    public void testFullLoadJson() throws Exception {
        loadFile("classpath:/RecordMessage_fullLoad.yml");
    }
}
