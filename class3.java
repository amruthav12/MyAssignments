package com.assignment.first;
import java.util.Scanner;

public class class3 {
    public static void main(String[] args){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Enter an option to perform the operation.");
        System.out.println("Enter 1 for addition.");
        System.out.println("Enter 2 for Subtraction.");
        System.out.println("Enter 3 for Multiplication.");
        System.out.println("Enter 4 for Division.");
        System.out.println("Enter 5 for Average.");
        int option = sc.nextInt();
        if(option > 5){
            System.out.println("Please enter the right option.");
        }
        if (option == 1){
            int add = x+y;
            if(add<0){
                System.out.println("The result is negative");
            }
            else
            System.out.println("The result of addition is "+add);
        }
        if (option == 2){
            int sub = x-y;
            if(sub<0){
                System.out.println("The result is negative");
            }
            else
                System.out.println("The result of subtraction is "+sub);
        }
        else if (option == 3){
            int mul = x*y;
            if(mul<0){
                System.out.println("The result is negative");
            }
            else
                System.out.println("The result of multiplication is "+mul);
        }
        else if (option == 4){
            int div = x/y;
            if(div<0){
                System.out.println("The result is negative");
            }
            else
                System.out.println("The result of division is "+div);
        }
        if (option == 5){
            System.out.println("Enter 2 more numbers to get average");
            int a =sc.nextInt();
            int b = sc.nextInt();
            int total = x+y+a+b;
            double avg = total/4;
            if(avg<0){
                System.out.println("The result is negative");
            }
            else
                System.out.println("The result of average is "+avg);
        }
    }
}
