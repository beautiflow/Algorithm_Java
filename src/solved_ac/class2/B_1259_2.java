package solved_ac.class2;

import java.util.Scanner;

public class B_1259_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            boolean palin = true;
            String N = sc.nextLine();
            if(N.equals("0")){
            break;}

            String[] arr = N.split("");
            String[] reverseArr = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String temp = arr[i];
                reverseArr[i] = arr[arr.length - i - 1];
                arr[i] = temp;
                if (!arr[i].equals(reverseArr[i])) {
                    palin = false;
                    break;
                }
            }
            if(palin == true){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
