package com.assignment.two;
public class twoClass7 {
    //using StringBuffer.
    static void convertOpp(StringBuffer str){
        int ln = str.length();
        for(int  i  = 0; i<ln; i++){
            Character c  = str.charAt(i);
            if(Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");
        }
    }

    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("HeLlO wOrLD");
        convertOpp(str1);
        System.out.println(str1);
    }
}