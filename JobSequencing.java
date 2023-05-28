
 package GreedyApproach;
import java.util.*;

public class JobSequencingProblem {
    static class Job {
        int deadline;
        int profit;
        int i;

        Job(int i, int d, int p) {
            this.i = i;
            deadline = d;
            profit = p;
        }

        // @Override
        // public int compareTo(Job j) {
        // return j.profit - this.profit;
        // }
    }

    public static void main(String[] args) {

        int[][] jobInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        ArrayList<Integer> al = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                time++;
                al.add(curr.profit);
            }
        }
        System.out.println(al.size());
        for (int i : al) {
            System.out.print(i + " ");
        }
    }

}
