package com.company.기본수학1;

import java.util.Scanner;

public class FlyMeTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {

            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int distance = Y - X;

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1);
            }
            else if(distance <= max * max + max) {
                System.out.println(max * 2);
            }
            else {
                System.out.println(max * 2 + 1);
            }

        }
    }
}