package Baekjoon.For_While;

import java.util.Scanner;

public class B_10951 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println( A + B );
        }
    }
}

/*
*     주의할 점 : 입력의 종료는 더이상 읽을 수 있는 데이터(End Of File)가 없을 때 종료한다
*
*     -> 이 문제에서 가장 중요한 점이 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것
*     즉, 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것
*
*
*     # Scanner
*       : Scanner의 메소드들의 경우 더이상 읽을 데이터가 없으면 NoSuchElementException을 던지게 된다.
*         Scanner에 읽을 데이터가 없으면 예외를 던져버린다.
*
*     던져진 예외의 경우 두 가지 방법!
*     1. try-catch 문으로 예외 발생시 반복문을 종료해주도록 처리함
*     2. Scanner의 메소드인 hasNext()를 통해 처리함
*
*     # 주의할 점
*       백준 알고리즘에서는 데이터를 주는 과정에서 더이상의 데이터를 보내지 않음으로 NoSuchElementException 을 발생시킬 수 있다.
*       그러나 평상시 입력받는 방법인 System.in 즉, 키보드로 입력받을 경우 Scanner 는 우리가 흔히 쓰는 Enter, Space 도
*       입력 예외를 발생시키지 않는다. 쉽게 말하면 데이터로 무언가를 받아들인다는 소리다.
*
*       평상시에 입력받는 방식으로 예외처리를 하려면 \n 을 입력받거나 ""(공백)을 입력받을 경우의 조건문을 걸어 예외를 발생시켜 종료시켜야하지만,
*       백준 문제처럼 파일 입력의 경우는 종료시점에서 더이상 데이터를 보낼 수가 없기 때문에 예외가 발생된다.
*
*       특히, hasNext(), hasNextInt() 등 이런 메소드들로 처리해도 백준에서는 문제가 해결되는 이유가 더이상 데이터를 읽을 것이 없는 경우
*       당연히 nextInt() 에서 받는 입력이 존재하지 않아 예외를 던져준다.
*
*
*
*
* */
