package solved_ac.Sliver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class B_11723 {

    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        while(N-- > 0){
            String[] operators = br.readLine().split(" ");

            String str = operators[0];

            if(operators.length != 1){
                int num = Integer.parseInt(operators[1]);
                    switch (str){
                        case "add" :
                            add(num);
                            break;
                        case "remove" :
                            remove(num);
                            break;
                        case "check" :
                            bw.write(check(num) + "\n");
                            break;
                        case "toggle" :
                            toggle(num);
                            break;
                        default:
                            break;
                    }
            }
            else {
                switch (str){
                    case "all" :
                        all();
                        break;
                    case "empty" :
                        empty();
                        break;
                    default:
                        break;
                }
            }
        }
        bw.flush();
        bw.close();
    }

     static void add(int value){
        set.add(value);
    }

     static void remove(int value){
        if(set.contains(value)){
            set.remove(value);
        }
    }

     static int check(int value) {
        if (set.contains(value)) {
            return 1;
        }
        else {
            return 0;
        }
    }

     static void toggle(int value){
        if(set.contains(value)){
            remove(value);
        }
        else {
            add(value);
        }
    }

     static void all(){
        IntStream.range(1, 21).forEach( i -> add(i));
    }

     static void empty(){
        set.clear();
    }
}
















