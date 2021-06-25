package com.company.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class 큰수AB_10757 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        String ab=scan.nextLine();
        String strab[]=ab.split(" ");
        BigInteger A=new BigInteger(strab[0]);
        BigInteger B=new BigInteger(strab[1]);
        System.out.println(A.add(B));


    }
}
