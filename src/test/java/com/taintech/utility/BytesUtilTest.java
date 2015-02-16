package com.taintech.utility;

import junit.framework.TestCase;

public class BytesUtilTest extends TestCase {

    public void testToString() throws Exception {
        assertEquals("1101", BytesUtil.toString(new byte[]{1,1,0,1}));
    }
}