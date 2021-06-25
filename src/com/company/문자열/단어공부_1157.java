package com.company.문자열;

import java.util.Scanner;

public class 단어공부_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] arr = new int[26];


        for (int i = 0; i < s.length(); i++){

            if ('A' <= s.charAt(i) &&
                    s.charAt(i) <= 'Z') { // 대문자 범위
                arr[s.charAt(i) - 'A']++;
            }

            else {	// 소문자 범위
                arr[s.charAt(i) - 'a']++;
            }
        }


        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
