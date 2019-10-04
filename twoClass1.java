package com.assignment.two;
import java.util.*;
import java.util.Scanner;

public class twoClass1 {
    public String smallest (String S[]){
        String first = S[0];
        for(int i=0 ; i<S.length; i++){
            if(S[i].length()<first.length()){
                first = S[i];
            }
        }
        return first;
    }

}
