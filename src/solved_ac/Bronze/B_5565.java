package solved_ac.Bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5565 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int total = Integer.parseInt(br.readLine());  //총 가격

            // 9개의 물건들의 값을 총 가격에서 빼준다
            for (int i = 1; i <= 9; i++) {
                total -= Integer.parseInt(br.readLine());
            }
            System.out.print(total);
        }
    }
