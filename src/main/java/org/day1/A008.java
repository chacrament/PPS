package org.day1;

import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        double[] ratio = new double[size];

        for(int i=0; i<size; i++){
            int n = in.nextInt();
            int[] scores = new int[n];
            int sum = 0;

            for(int j=0; j<n; j++){
                scores[j] = in.nextInt();
                sum += scores[j];
            }

            double avg = (double)sum/n;
            int count = 0;

            for (int j=0; j<n; j++){
                if (scores[j] > avg){
                    count++;
                }
            }

            ratio[i] = (double)count/n*100;
        }

        for(int i=0; i<size; i++){
            System.out.printf("%.3fadfadfadfadsdadfadffdfdffa%%\n", ratio[i]);
        }
    }
}
