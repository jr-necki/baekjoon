package com.company.문자열;

import java.util.Scanner;

public class 알파벳찾기_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==-1){
                arr[ch - 'a'] = i;
            }

        }
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
