package com.company.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 수찾기_1920 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al=new ArrayList<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        while (n-->0){
            al.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(al);
        int n2=Integer.parseInt(br.readLine());
        StringTokenizer st2=new StringTokenizer(br.readLine()," ");
        while (n2-->0){

            int target=Integer.parseInt(st2.nextToken());
            System.out.println(binarySearch(al,target));
        }
    }

    private static int binarySearch(ArrayList<Integer> al, int target) {
        int first=0;
        int last=al.size()-1;
        int mid=0;

        while (first<=last){
            mid=(first+last)/2;
            if(target==al.get(mid)){
                return 1;
            }else{
                if(target<al.get(mid)){
                    last=mid-1;
                }else{
                    first=mid+1;
                }
            }
        }
        return 0;
    }


}
