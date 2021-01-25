package com.company.브루트포스;

import java.util.Scanner;

public class 체스판다시칠하기 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new boolean[n][m];
        scanner.nextLine();

        // arr
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine().trim();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }}


        int N =n-7;
        int M =m-7;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }


    public static void find(int x, int y) {
        int endx = x+8;
        int endy = y+8;
        int count = 0;

        boolean TF = arr[x][y];

        for (int i =x; i < endx; i++) {
            for (int j = y; j < endy; j++) {
                if (arr[i][j] != TF) {
                    count++;
                }
                TF = (!TF);
            }

            TF = !TF;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
