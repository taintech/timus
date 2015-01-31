package com.taintech.timus;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumABEasy {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    public static void solve(InputStream input, PrintStream output) throws Exception {
        Scanner in = new Scanner(input);
        PrintWriter out = new PrintWriter(output);

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);

        out.flush();
    }
}