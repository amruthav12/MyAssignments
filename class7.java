package com.assignment.first;
import java.util.Scanner;

public class class7 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number.");
        num = sc.nextInt();
        if (num %2 !=0)
            System.out.println("NEW");
        else if((num %2 ==0)&& (num >=2 && num <=5))
            System.out.println("OLD");
        else if((num %2 ==0)&& (num >=6 && num <=30))
            System.out.println("NEW");
        else if ((num %2==0) && (num >30))
            System.out.println("OLD");

    }

}
