package com.assignment.first;

public class class4 {
    public static void main(String[] args){
        int a =10, b = 20, c =30;
        double avg = (a+b+c)/3;
        System.out.println("The average is "+avg);
        if((avg>a) || (avg>b) || (avg>c))
            System.out.println("The average is greater than a, b & c");
        else if ((avg>a)||(avg>b)){
            System.out.println("The average is greater than a & b");
        }
        else if ((avg>a)||(avg>c)){
            System.out.println("The average is greater than a & c");
        }
        else if ((avg>b)||(avg>c)){
            System.out.println("The average is greater than b & c");
        }
        else if (avg>a){
            System.out.println("The average is greater than a");
        }
        else if (avg>b){
            System.out.println("The average is greater than b");
        }
        else {
            System.out.println("The average is greater than c");
        }
    }
}
