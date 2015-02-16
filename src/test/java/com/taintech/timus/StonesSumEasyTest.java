package com.taintech.timus;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class StonesSumEasyTest {

    @Test(timeout = 1000)
    public void testSolution() throws Exception {
        assertTrue(3 == solve("5\n 5 8 13 27 14"));
        assertTrue(96 == solve("5\n 100 1 1 1 1"));
    }

    @Test(timeout = 1000)
    public void testSolutionWithMaxIterations() throws Exception {
        assertTrue(0 == solve("20\n 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0"));
    }

    int solve(String input) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        StonesSumEasy.solve(IOUtils.toInputStream(input, "UTF-8"), ps);
        return Integer.parseInt(os.toString("UTF8").trim());
    }

}
