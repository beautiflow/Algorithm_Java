package CNUSW2.cnusw_practice;
//import java.util.Stack;
//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main{
//    public static void main(String[] args) throws IOException {
//        Main m = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(m.correct(str));
//    }
//
//    public String correct(String str){
//
//        String answer = "YES";
//
//        Stack<Character> stack = new Stack<>();
//
//        for(int i = 0; i < str.length(); i++){
//            switch(str.charAt(i)){
//                case ')':
//                    if(stack.peek() == '('){
//                        stack.pop();
//                        break;
//                    }
//                case '}':
//                    if(stack.peek() == '{'){
//                        stack.pop();
//                        break;
//                    }
//                case '[':
//                    if(stack.peek() == '['){
//                        stack.pop();
//                        break;
//                    }
//                default :
//                    stack.push(str.charAt(i));
//                    break;
//            }
//            if(!stack.isEmpty()){
//                return "NO";
//            }
//        }
//        return answer;
//    }
//}

import java.util.Stack;
import java.util.Scanner;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Main2 m = new Main2();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N;i++ ) {
            String str = sc.next();

            if(m.correct(str)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }

    public boolean correct(String str) {

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            switch (x) {
                case ')':
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                case '}':
                    if (stack.peek() == '{') {
                        stack.pop();
                        break;
                    }
                case ']':
                    if (stack.peek() == '[') {
                        stack.pop();
                        break;
                    }
                default:
                    stack.push(x);
                    break;
            }
            }
        return stack.empty();
        }


}

