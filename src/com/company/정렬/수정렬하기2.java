package com.company.정렬;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);

    }

}
