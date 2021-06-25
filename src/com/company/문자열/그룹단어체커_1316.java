package com.company.문자열;

import java.util.Scanner;

public class 그룹단어체커_1316 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]arr=new int[26];

        int cases=scanner.nextInt();
        int group=0;
        for(int j=0;j<cases;j++){
            for(int i=0;i<26;i++){
                arr[i]=0;
            }
            String s=scanner.next();
            boolean isGroup=true;
            for(int k=0;k<s.length();k++){
                char ch = s.charAt(k);
                if(arr[ch-'a']==0){
                    arr[ch-'a']=1;
                }else{
                    if(s.charAt(k-1)!=s.charAt(k)){
                        isGroup=false;
                        break;
                    }
                }
            }
            if(isGroup){
                group++;
            }

        }
        System.out.println(group);

    }
}
