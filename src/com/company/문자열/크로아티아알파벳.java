package com.company.문자열;

import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String []arr=s.split("");
        int croa=0;
        for(int j=0;j<arr.length-2;j++){
            if(arr[j].equals("d")){
                if (arr[j+1].equals("z")){
                    if(arr[j+2].equals("=")){
                        arr[j]="0";arr[j+1]="0";arr[j+2]="0";
                        croa++;
                    }
                }
        }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].equals("c")){
                if(arr[i+1].equals("=")||arr[i+1].equals("-")){
                    arr[i]="0";arr[i+1]="0";
                    croa++;
                }
            }else if(arr[i].equals("d")){
                if(arr[i+1].equals("-")){
                    arr[i]="0";arr[i+1]="0";
                    croa++;
                }
            }else if(arr[i].equals("l")||arr[i].equals("n")){
                if(arr[i+1].equals("j")){
                    arr[i]="0";arr[i+1]="0";
                    croa++;
                }
            }else if(arr[i].equals("s")||arr[i].equals("z")){
                if(arr[i+1].equals("=")){
                    arr[i]="0";arr[i+1]="0";
                    croa++;
                }
            }
        }
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!="0"){
                n++;
            }
        }
        System.out.println(croa+n);
}}

