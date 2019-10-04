package com.assignment.two;

public class ExceClass {
    public static void main(String[] args){
        twoClass1 tc = new twoClass1();
        String [] S = {"Learn", "Java", "Easy", "and" ,"or"};
        String small = tc.smallest(S);
        System.out.println("The smallest is "+small +" the length of the string is "+small.length());
    }
}
