package com.assignment.two;
import java.util.Scanner;
import java.util.Stack;
public class twoClass8 {
    public static boolean balancedParenthesis(String ex){
        if((ex.length() %  2) == 1)
            return false;
        else {
            Stack<Character> s = new Stack<>();
            for (char braces : ex.toCharArray()) {
                switch (braces) {
                    case '{':
                        s.push('}');
                        break;
                    case '(':
                        s.push(')');
                        break;
                    case '[':
                        s.push(']');
                        break;
                    default:
                        if (s.isEmpty() || braces != s.peek()) {
                            return false;
                        }
                        s.pop();
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string.");
        String exp = sc.nextLine();
        boolean res = balancedParenthesis(exp);
        System.out.println(res);
    }
}
