package Programmers.Lv1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}
