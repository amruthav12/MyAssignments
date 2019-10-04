package com.assignment.two;
import java.io.*;
public class teoClass5 {
    static void reverseStr(String str){
        String [] words = str.split(" ");
        String revString = "";
        String word = null;
        String revWord = "";
        for(int i =0; i <words.length; i++){
            word = words[i];
            for(int  j = word.length()-1; j>=0 ; j--){
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(str);
        System.out.println(revString);
    }

    public static void main(String[] args) {
        String str = "do programming";
        teoClass5 rev = new teoClass5();
        rev.reverseStr(str);
        StringBuffer sb = new StringBuffer("Do programming");
        sb.reverse();
        System.out.println(sb);

    }

}
