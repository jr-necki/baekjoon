package com.company.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 나이순정렬 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        Person[] p=new Person[size];
        for(int i=0;i<size;i++){
            int age=scanner.nextInt();
            String name=scanner.next();
            Person person=new Person(age,name);
            p[i]=person;
        }
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        });
        for (int i=0;i<size;i++){
            System.out.println(p[i].age+" "+p[i].name);
        }
    }
    public static  class  Person{
        int age;
        String name;
        public Person(int age, String name){
            this.age=age;
            this.name=name;
        }
    }
}
