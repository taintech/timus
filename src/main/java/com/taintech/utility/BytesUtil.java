package com.taintech.utility;

/**
 * Author: Rinat Tainov
 * Email: rinat@tainov.com
 * Date: 2/16/15
 * Time: 23:42
 */
public class BytesUtil {

    public static String toString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(b);
        }
        return sb.toString();
    }
}
