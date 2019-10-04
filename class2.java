package com.assignment.first;

import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int x = sc.nextInt();
        String s1 = "Consultadd";
        String s2 = "Python Training";
        String s3 = s1+s2;
        if (x % 3 == 0)
            System.out.println(s1);
        if (x % 5 == 0)
            System.out.println(s2);
        if ((x % 3 == 0) && (x % 5 == 0))
            System.out.print(s3);

    }

}
