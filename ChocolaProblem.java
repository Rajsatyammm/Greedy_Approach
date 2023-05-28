
 package GreedyApproach;
import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer[] verCost = { 2, 1, 3, 1, 4 };
        Integer[] horCost = { 4, 1, 2 };
        int V = verCost.length;
        int H = horCost.length;
        Arrays.sort(verCost, (a, b) -> b - a);
        Arrays.sort(horCost, (a, b) -> b - a);

        int hp = 1, vp = 1; // vp-> vertical parts hp-> horizontal parts
        int i = 0, j = 0;
        int totalCost = 0;

        while (i < V && j < H) { // horizontal cut
            if (verCost[i] <= horCost[j]) {
                totalCost += (horCost[j] * vp);
                hp++;
                j++;
            } else { // vertical cut 
                totalCost += (verCost[i] * hp);
                vp++;
                i++;
            }
        }
        while (i < V) {
            totalCost += (verCost[i] * hp);
            vp++;
            i++;
        }
        while (j < H) {
            totalCost += (horCost[j] * vp);
            hp++;
            j++;
        }
        System.out.println(totalCost);
    }
}
