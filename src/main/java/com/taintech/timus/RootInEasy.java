package com.taintech.timus;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ListIterator;

public class RootInEasy {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    public static void solve(InputStream input, PrintStream output) throws Exception {
        StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(input)));
        ArrayList<Double> list = new ArrayList<Double>();
        boolean eof = false;
        do {
            int token = tokenizer.nextToken();
            switch (token) {
                case StreamTokenizer.TT_EOF:
                    eof = true;
                    break;
                case StreamTokenizer.TT_EOL:
                    break;
                case StreamTokenizer.TT_WORD:
                    break;
                case StreamTokenizer.TT_NUMBER:
                    list.add(tokenizer.nval);
                    break;
                default:
                    if (token == '!') {
                        eof = true;
                    }
            }
        } while (!eof);

        PrintWriter out = new PrintWriter(output);

        DecimalFormat df = new DecimalFormat("#.####");
        int n = list.size();
        ListIterator<Double> it = list.listIterator(n);
        while (it.hasPrevious()) {
            String temp = String.format("%.4f", Double.parseDouble(df.format(Math.pow(it.previous(), 0.5))));
            out.println(temp);
        }
        out.flush();
    }
}