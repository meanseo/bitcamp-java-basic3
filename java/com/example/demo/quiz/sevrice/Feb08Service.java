package com.example.demo.quiz.sevrice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.sevrice
 * fileName   : Feb08Service
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public interface Feb08Service {
    void lotto(Scanner scanner); // 로또
    void baseball(Scanner scanner); // 야구
    void booking(Scanner scanner); // 좌석예약
    void bank(Scanner scanner); // 은행 입출금
    void gugudan(Scanner scanner); // 구구단
}

