package com.example.demo.quiz.sevrice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.sevrice
 * fileName   : Feb08ServiceImpl
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service {
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }
    /**
     * author : 최민서
     * des : 각 단이 세로로 출력 되어야 하므로 2*1 2*2 2*3 순서가 아닌
     *        2*1 3*1 4*1 5*1 순서로 출력이 되도록 생각하고 코드 짜기
     */
    @Override
    public void gugudan(Scanner scanner) {
        for (int dan = 2; dan < 10; dan += 4){ //구구단은 2단부터 시작.
            for (int i = 1; i <= 9; i++){ // 1 ~ 9 까지 곱이 나오도록 조건잡기
                for (int j = dan; j < dan+4; j++){
                    System.out.print(j + "*" + i + "="+(j * i)+"\t");
                }
                System.out.print("\n"); // 4개씩 출력 되어야 하므로 j*i 값 4개가 출력된 후 엔터
            }
            System.out.println("\n"); //4개의 단(2단~5단)이 모두 출력 된 후, 엔터
        }
    }
}
