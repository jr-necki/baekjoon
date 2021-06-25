package com.company.기본수학1;

import java.util.Scanner;

public class 벌집_2292 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int start=2;
        int room=1;
        boolean ok=false;
        int i=1;
        while(!ok){
            if(n<2){
                ok=true;
            }else if(n>=2&&n<8){
                room++;
                ok=true;
            }else{
                if(i*(6+6*i)/2<=n-start&&
                        (i+1)*(6+6*(i+1))/2>n-start){
                    ok=true;
                    room+=i+1;
                }else{
                    i++;
                }
            }

        }
        System.out.println(room);
    }
}
