package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("1+2+3+.....n= "+sum);
    }
}
