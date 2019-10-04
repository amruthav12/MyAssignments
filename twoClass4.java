package com.assignment.two;

import java.util.Arrays;

public class twoClass4 {
    static boolean uniqueStr(String str){
        //first convert the string to lowercase
        str = str.toLowerCase();
        int len = str.length();

        //second convert string to character array
        char arr[] = str.toCharArray();

        //sort the array
        Arrays.sort(arr);
        for(int i = 0 ;i<len-1;i++) {
            if(arr[i] == arr[i+1])
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String x = "Teach";
        System.out.println(uniqueStr(x));

        String y = "Root";
        System.out.println(uniqueStr(y));
    }
}
