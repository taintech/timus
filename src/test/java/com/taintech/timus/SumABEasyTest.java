package com.taintech.timus;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class SumABEasyTest {

    @Test
    public void test() throws Exception {
        assertTrue(5 == solve("2 3"));
        assertTrue(23 == solve("20 3"));
        assertTrue(12 == solve("6 6"));
    }

    int solve(String input) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        SumABEasy.solve(IOUtils.toInputStream(input, "UTF-8"), ps);
        return Integer.parseInt(os.toString("UTF8").trim());
    }

}
