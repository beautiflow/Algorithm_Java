package solved_ac.class2;

import java.util.Scanner;

public class B_1259_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            boolean isPalin = true;

            String N = sc.nextLine();
            if(N.equals("0")) {
                break;
            }

            String[] arr = N.split("");

            for (int i = 0; i < arr.length / 2; i++) {
                if (!arr[i].equals(arr[arr.length - i - 1])) {
                    isPalin = false;
                    break;
                }
            }
            if (isPalin == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}


//    Scanner sc = new Scanner(System.in);
//        System.out.println("두 개의 숫자를 입력하세요.");
//                String inputValue = sc.nextLine();
//
//                String[] splitValue = inputValue.split(",");
//
//                int first = Integer.parseInt(splitValue[0]);
//                int second = Integer.parseInt(splitValue[1]);
