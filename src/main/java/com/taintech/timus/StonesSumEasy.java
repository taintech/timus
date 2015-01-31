package com.taintech.timus;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class StonesSumEasy {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    //TODO fails at test 5
    public static void solve(InputStream input, PrintStream output) throws Exception {
        Scanner in = new Scanner(input);
        PrintWriter out = new PrintWriter(output);

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        Arrays.sort(ar);
        long sum1 = 0L;
        long sum2 = 0L;
        for (int i = n-1; i >= 0; i--) {
            int e = ar[i];
            long a = sum1 + e;
            long b = sum2 + e;
            if (Math.abs(a - sum2) <= Math.abs(b - sum1))
                sum1 += e;
            else sum2 += e;
        }
        out.println(Math.abs(sum1-sum2));
        out.flush();
    }
}
