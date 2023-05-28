 package GreedyApproach;

import java.util.*;

public class MaxLengthPairOfChain {
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int maxm = 1;
        int lastEnd = pairs[0][1];

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                maxm++;
                lastEnd = pairs[i][1];
            }
        }
        System.out.println(maxm);
    }
}
