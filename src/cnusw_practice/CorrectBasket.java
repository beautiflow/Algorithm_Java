package cnusw_practice;

import java.util.Scanner;
import java.util.Stack;


public class CorrectBasket{
    public static void main(String[] args){
        CorrectBasket T = new CorrectBasket();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }
}