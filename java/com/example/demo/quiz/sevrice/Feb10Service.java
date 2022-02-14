package com.example.demo.quiz.sevrice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.sevrice
 * fileName   : Feb10Service
 * author     : 최민서
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10     최민서        최초 생성
 */
public interface Feb10Service {
    void bubbleSort();
    void insertionSort();
    void selectionSort();
    // 1인
    void quickSort(int[] arr, int start, int end);
    void res(int arr[]);
    void mergeSort(int[] a);
    // 1인
    void magicSquare();
    // 1인
    void zigzag();
    // 1인
    // 좌측90도 직각삼각형 별찍기
    void rectangleStarPrint(Scanner scanner);
    // 정삼각형 별찍기
    void triangleStarPrint(Scanner scanner);
}
