package com.company.문자열;

import java.util.Scanner;

public class 그룹단어 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int group=0;
        int[]arr=new int[26];

        int cases=scanner.nextInt();
        for(int i=0;i<cases;i++){
            for(int k=0;k<arr.length;k++){
                arr[k]=0;
            }
            String s=scanner.next();
            boolean ok=true;

            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(arr[ch-'a']==0){
                    arr[ch-'a']=1;
                }else{
                    if(j>0){
                        if(ch!=s.charAt(j-1)){
                            System.out.println(ch+" "+s.charAt(j-1));
                            ok=false;
                        }
                    }

                }


            }
            if(ok){
                group++;
            }

        }
        System.out.println(group);

    }
}
