package com.company.기본수학1;
import java.util.Scanner;

public class ACM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();	// 테스트 케이스


        for(int i = 0; i < T; i++) {

            int H = scanner.nextInt();
            int W = scanner.nextInt(); 	// 쓸모없는 변수다.
            int N = scanner.nextInt();

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));

            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}
