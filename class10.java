package com.assignment.first;

import java.util.Scanner;

public class class10 {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number for the multiplication table");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i =1;i <= 10 ;i++){
            System.out.println(num +" * "+ i +" = " +num * i);
        }
    }
}
