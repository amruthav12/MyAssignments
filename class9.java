package com.assignment.first;

import java.util.Scanner;

public class class9 {
    public static void main(String[] args){
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        x = sc.next().charAt(0);
        if((x == 'r')||(x == 'R'))
        System.out.println("FOUND");
        else if((x == 'a')||(x == 'A'))
            System.out.println("FOUND");
        else if((x == 'n')||(x == 'N'))
            System.out.println("FOUND");
        else if((x == 'd')||(x == 'D'))
            System.out.println("FOUND");
        else if((x == 'o')||(x == 'O'))
            System.out.println("FOUND");
        else if((x == 'm')||(x == 'M'))
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");

    }
}
