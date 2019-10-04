package com.assignment.first;

import java.util.Scanner;

public class class5 {
    public static void main(String[] args){
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = sc.nextInt();
      while(num < 0){
          System.out.println("Its over.");
          break;
       }
      System.out.println("Good going");


    }
}
