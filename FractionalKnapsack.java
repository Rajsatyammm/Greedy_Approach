
 package GreedyApproach;
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = { 10, 20, 30 };
        int[] value = { 60, 100, 120 };
        int W = 50;

        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        } 

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int Capacity = W;
        int totalProfit = 0;
        for (int i = value.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (Capacity >= weight[idx]) {
                // include full
                Capacity -= weight[idx];
                totalProfit += value[idx];
            } else {
                // include some part
                totalProfit += ratio[i][1] * Capacity;
                Capacity = 0;
                break;
            }
        }
        System.out.println(totalProfit);
    }
}
