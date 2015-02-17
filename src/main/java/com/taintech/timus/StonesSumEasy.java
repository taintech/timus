package com.taintech.timus;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class StonesSumEasy {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    public static void solve(InputStream input, PrintStream output) throws Exception {
        Scanner in = new Scanner(input);
        PrintWriter out = new PrintWriter(output);

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        byte[] bytes = new byte[n];
        bytes[0] = 1;
        int limit = (int) Math.pow(2, n);
        int min = Integer.MAX_VALUE;
        int temp;
        for (int i = 1; i < limit; i++) {
            temp = difference(bytes, ar);
            if (min > temp) min = temp;
            increment(bytes);
        }
        out.println(min);
        out.flush();
    }

    private static void increment(byte[] bytes) {
        for (int i = bytes.length - 1; i >= 0; i--) {
            byte b = bytes[i];
            if (b == 0) {
                bytes[i] = 1;
                break;
            } else bytes[i] = 0;
        }
    }

    private static int difference(byte[] bytes, int[] ints) {
        int diff = 0;
        for (int i = 0; i < bytes.length; i++)
            diff += (bytes[i] == 0 ? -1 : 1) * ints[i];
        return Math.abs(diff);
    }
}
