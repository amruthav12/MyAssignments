package com.assignment.first;
import java.util.Scanner;

public class class1 {

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int x,y,z;
            System.out.println("Enter two numbers from 1 to 10");
            x= s.nextInt();
            y=s.nextInt();
            z = x+y;
            int result = z+30;
            System.out.println("The final result is "+result);
        }

    }



