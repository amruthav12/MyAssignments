package com.assignment.first;

import java.util.Scanner;

public class class11 {
    public static void main(String[] args) {
        int num;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (num = 0; num <= 10; num++) {
            num = sc.nextInt();
            sum = sum+num;
        }
        System.out.println("The total sum is "+sum);
        double avg = sum / 10;
        System.out.println("The total average  is "+avg);

    }
}
