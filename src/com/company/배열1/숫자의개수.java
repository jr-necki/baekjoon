package com.company.배열1;

import java.util.Scanner;

public class 숫자의개수 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int x=a*b*c;
        String s=x+"";
        String[]arr=s.split("");
        int[]number=new int[10];

        int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;

        for(int i=0;i< s.length();i++){
            if (arr[i].equals("0")){
                n0++;
                number[0]=n0;
            }else if(arr[i].equals("1")){
                n1++;
                number[1]=n1;
            }else if(arr[i].equals("2")){
                n2++;
                number[2]=n2;
            }else if(arr[i].equals("3")){
                n3++;
                number[3]=n3;
            }else if(arr[i].equals("4")){
                n4++;
                number[4]=n4;
            }else if(arr[i].equals("5")){
                n5++;
                number[5]=n5;
            }else if(arr[i].equals("6")){
                n6++;
                number[6]=n6;
            }else if(arr[i].equals("7")){
                n7++;
                number[7]=n7;
            }else if(arr[i].equals("8")){
                n8++;
                number[8]=n8;
            }else if(arr[i].equals("9")){
                n9++;
                number[9]=n9;
            }
        }
        for(int i=0;i< number.length;i++){
            System.out.println(number[i]);
        }
    }
}
