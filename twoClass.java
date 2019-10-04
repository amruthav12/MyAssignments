package com.assignment.two;

import javax.xml.bind.annotation.XmlInlineBinaryData;

public class twoClass {
    static void removeOdd(int a[]){
        //traverse through the array
        //find who is odd
        for(int i =0; i<a.length;i++){
            if(a[i] % 2 ==0)
                continue;
            else
                System.out.println(a[i]+ " is odd element in the array.");
        }
    }

    static void removeEven(int a[]){
        for(int i =0; i<a.length;i++){
            if(a[i] % 2 != 0)
                continue;
            else
                System.out.println(a[i]+ " is even element in the array.");
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 16, 18, 20, 22, 13};
        removeOdd(a);
        int b[] = {17,15,16,19,21,13};
        removeEven(b);
    }
}
