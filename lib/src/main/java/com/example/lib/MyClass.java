package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[])
    {
        int min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five number:");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int n4=scanner.nextInt();
        int n5=scanner.nextInt();
        min=n1;
        int arr[]={n1,n2,n3,n4,n5} ;
        min=arr[0];
        for(int i=0;i<=4;i++){
            if( arr[i]<=min){
                min= arr[i];
            }
        }  System.out.println("The min number:" +min);
    }
}
