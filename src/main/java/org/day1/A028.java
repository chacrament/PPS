package org.day1;

import java.math.BigInteger;
import java.util.Scanner;

public class A028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger a, b, result;
        a = in.nextBigInteger();
        b = in.nextBigInteger();
        result = a.add(b);

        System.out.println(result);
    }
}
