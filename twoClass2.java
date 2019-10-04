package com.assignment.two;

import java.util.Arrays;
import java.util.Scanner;

public class twoClass2 {
    public int sumofarr(int array[]){
        Arrays.sort(array);
        int sum = 0;
        System.out.println("The sorted array ");
        for(int j =0;j<array.length;j++)
            System.out.print(array[j]+ " ");
        for(int i = 1; i<array.length-1; i++)
            sum += array[i];
        return sum;
    }

    public static void main(String[] args){
        twoClass2 tc2 = new twoClass2();
        int res;
        int[] x = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
                for(int i =0;i<5; i++) {
                    x[i] = sc.nextInt();
                }
                res =tc2.sumofarr(x);
                System.out.println("The sum is "+res);
    }
}
