 package GreedyApproach;
import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());
        List<Integer> al = new ArrayList<>();
        int val = 590;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= val) {
                while (coins[i] <= val) {
                    al.add(coins[i]);
                    val -= coins[i];
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}
