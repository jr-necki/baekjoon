package com.company.문자열;
import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 팰린드롬수_1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true){
            s=br.readLine();
            if(s.equals("0")){
                break;
            }
            char []arr=s.toCharArray();
            boolean pelin=true;
            for(int i=0;i<arr.length-1-i;i++){
                if(arr[i]!=arr[arr.length-1-i]){
                    pelin=false;
                    break;
                }
            }
            if(pelin){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

}