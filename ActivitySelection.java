// package GreedyApproach;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int arr[][] = new int[end.length][3];
        for(int i=0; i<end.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));
        // end time based sorted
        int maxAct = 0;
        ArrayList<Integer> al = new ArrayList<>();

        // 1st Activity
        // maxAct = 1;
        maxAct = 1;
        al.add(arr[0][0]);
        int lastEnd = arr[0][2];
        for(int i=1; i<end.length; i++) {
            if(arr[i][1] >= lastEnd) {
                maxAct++;
                al.add(arr[i][0]);
                lastEnd = arr[i][2];
            }
        }

        System.out.println(maxAct);
        for(int i : al) {
            System.out.print("A" + i + " ");
        }
    }
}
