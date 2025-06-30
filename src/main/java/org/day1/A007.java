package org.day1;

import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[8];

        for(int i = 0; i < 8; i++){
            numbers[i] = in.nextInt();
        }

        int temp = numbers[0];
        boolean isAsc = true;
        boolean isDec = true;

        for(int i = 1 ; i < numbers.length ; i++) {
            if (numbers[i] < temp) {
                isAsc = false;
                temp = numbers[0];
                break;
            }
            temp = numbers[i];
        }

        if(isAsc){
            System.out.println("ascending");
        } else {
            for(int i = 1 ; i < numbers.length ; i++) {
                if (numbers[i] > temp) {
                    isDec = false;
                    break;
                }
                temp = numbers[i];
            }
            if(isDec){
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        }
    }
}
