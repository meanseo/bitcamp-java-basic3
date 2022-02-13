package com.example.demo.quiz.sevrice;


import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07Service
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public interface Feb07Service {
    void getDice(Scanner scanner);
    void getRps(Scanner scanner);
    void getPrime(Scanner scanner);
    void getLeapYear(Scanner scanner);
    void getGuessNumber(Scanner scanner);
}
