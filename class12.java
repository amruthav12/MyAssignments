package com.assignment.first;

import java.util.Scanner;

public class class12 {
    public static void main(String[] args){
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month between 1 to 12");
        month = sc.nextInt();
        if ((month == 1) ||(month == 3) ||(month == 5) ||(month == 7) ||(month == 8) ||(month == 10) ||(month == 12))
            System.out.println("The number of days in a month is 31");
        else if ((month == 4) ||(month == 6) ||(month == 9) ||(month == 11))
            System.out.println("The number of days in a month is 30");
        else if ((month == 2))
            System.out.println("The number of days in a month is 28");
        else
            System.out.println("The month entered is not valid");

    }
}
