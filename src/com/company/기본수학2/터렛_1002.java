package com.company.기본수학2;

import java.util.Scanner;

public class 터렛_1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();
            int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if (d > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            } else if (d < Math.pow(r2 - r1, 2)) {
                System.out.println(0);
            } else if (d == Math.pow(r2 - r1, 2)) {
                System.out.println(1);
            } else if (d == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}