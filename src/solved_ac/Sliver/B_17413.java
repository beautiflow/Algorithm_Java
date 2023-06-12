package solved_ac.Sliver;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_17413{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        boolean in = false;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '<'){
                in = true;

                while (!stack.isEmpty()){
                    System.out.print(stack.pop()+"1");
                }
                System.out.print(str.charAt(i)+"2");
            }
            else if(str.charAt(i) == '>'){
                in = false;
                System.out.print(str.charAt(i)+"3");
            }

            else if(in){
                System.out.print(str.charAt(i)+"4");
            }
            else if(!in){
                if(str.charAt(i) == ' '){
                    while (!stack.isEmpty()){
                        System.out.print(stack.pop()+"5");
                    }
                    System.out.print(str.charAt(i)+"6");
                }
                else {
                    stack.push(str.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+"7");
        }

    }
}
