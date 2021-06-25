package com.company.정렬;

import java.util.Scanner;

public class 통계학 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        //입력값 범위는 -4000~4000
        int []arr=new int[8001];
        int sum=0;
        int max=-4001;
        int min=4001;
        //범위 밖의 수로 초기화
        int center=5000;
        int many=5000;

        for(int i=0;i<n;i++){
            int value=scanner.nextInt();
            sum+=value;
            arr[value+4000]++; //해당숫자만큼의 순서에 1씩 더함

            if(max<value){
                max=value;
            }
            if(min>value){
                min=value;
            }
        }
        //스캔
        int cnt=0;//중앙값빈도
        int manymax=0;//최빈값의 최대값

        boolean flag=false;
        for(int i=min+4000;i<=max+4000;i++){
            //1번이라도 나온애들
            if(arr[i]>0){
                //중앙값찾기

                //전체 카운트가 전체 수의 절반보다 작을경우에
                if(cnt<(n+1)/2){
                    cnt+=arr[i];//빈도수 합침
                    center=i-4000;
                }

                //최빈값
                if(manymax<arr[i]){
                    manymax=arr[i];
                    many=i-4000;
                    flag=true;
                }
                //이전 최빈값최댓값과 같을때
                else if(manymax==arr[i]&&flag==true){
                    many=i-4000;
                    flag=false;
                }
            }
        }
        System.out.println((int)Math.round((double) sum/n));
        System.out.println(center);
        System.out.println(many);
        System.out.println(max-min);
    }
}
