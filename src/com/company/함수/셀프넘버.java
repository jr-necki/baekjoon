package com.company.함수;

public class 셀프넘버 {
    public static void main(String[] args) {
        boolean[] check=new boolean[10001];
        for(int i=1;i<10001;i++){
            int number=d(i);
            if (number<10001){
                check[number]=true;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<10001;i++){
            if(!check[i]){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static int d(int n) {
        int sum=n;
        while(n!=0){//각 자리수 더해주기
            sum=sum+n%10;//일의자리!
            n=n/10;
        }
        return sum;

    }
}
