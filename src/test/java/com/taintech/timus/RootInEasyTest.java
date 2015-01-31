package com.taintech.timus;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class RootInEasyTest {

    @Test
    public void test() throws Exception {
        String actual = solve(" 1427  0   \n \n    876652098643267843 \n 5276538");
        String expected = "2297.0716\n936297014.1164\n0.0000\n37.7757";
        assertTrue(expected.equals(actual));
    }

    String solve(String input) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        RootInEasy.solve(IOUtils.toInputStream(input, "UTF-8"), ps);
        return os.toString("UTF8").trim();
    }

}
