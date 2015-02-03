package com.taintech.timus;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class StonesSumEasy {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    //fails test 5
    public static void solve(InputStream input, PrintStream output) throws Exception {
        Scanner in = new Scanner(input);
        PrintWriter out = new PrintWriter(output);

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(n, Collections.reverseOrder());
        for (Integer i: ar) {
            heap.add(i);
        }

        while(heap.size()>1) {
            int a = heap.poll();
            int b = heap.poll();
            heap.add(a-b);
        }
        out.println(heap.poll());
        out.flush();
    }
}
