package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++) {

            String str = br.readLine();

            for (int i = 1; i <= str.length(); i++) {
                    String A = str.substring(0, i);
                    String B = str.substring(i, i + i);

                    if (A.equals(B)) {
                        System.out.println("#" + tc + " " + B.length());

                        break;
                    }

                }
            }
        }
    }

