package com.assignment.two;

public class twoClass3 {
    static int removeSpace(char []str){
    int count = 0;
    for(int  i =0; i<str.length; i++){
        if(str[i] != ' '){
            str[count++] = str[i];
        }
    }
    return count;
    }

    public static void main(String[] args) {
        char[] str = "Java    not    funny".toCharArray();
        //removeSpace  rm = new removeSpacec();
        int x =removeSpace(str);
        System.out.println(String.valueOf(str).subSequence(0,x));
    }
}
