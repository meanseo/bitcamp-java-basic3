package com.example.demo.quiz.sevrice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.sevrice
 * fileName   : Feb10ServiceImpl
 * author     : 최민서
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10     최민서        최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {

    @Override
    public void bubbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }
    /**
     * author : 최민서
     * des : quick sort
     * pivot 이라는 기준 값을 세운 후, pivot보다 작은 element는 왼쪽, 큰 것은 오른쪽으로 정렬 반복
     * 반복이 끝나면 나누어 진 각 부분 안에서 다시 정렬 반복(엘리먼트가 하나씩 남을때 까지)
     * pivot은 자유롭게 잡을 수 있지만 해당 해설에서는 중간 인덱스 값으로 설정
     * 참고: https://javaoop.tistory.com/8
     * https://www.youtube.com/watch?v=KiIpDEFIjDk
     */
    @Override
    public void quickSort(int[] arr, int start, int end) {
        if(start<=end){
            int pivot = partition(arr, start, end); // partition 메소드에서 리턴 받은 값을 pivot으로 사용

            quickSort(arr, start, pivot-1); // 나누어진 왼쪽 배열 정렬
            quickSort(arr,pivot+1,end); // 나누어진 오른쪽 배열 정렬

        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2]; // pivot 값 중앙 인덱스로 설정
        int temp; // 엘리먼트들을 바꾸어 줄때 임시 저장할 variable
        while (start < end) {
            while (arr[start] < pivot) {
                start++; // pivot보다 작을 경우 무시하고 다음 인덱스로 넘어감
            }
            while (arr[end] >= pivot) {
                end--; // pivot 보다 클 경우 무시하고 앞 인덱스로 넘어감
            }
            if (start <= end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp; // start 값과 end 값 교환하여 pivot 보다 작은 수는 왼쪽
                // 큰 수는 오른쪽으로 정렬
            }
        }
        return start;
    }

    @Override
    public void res(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " "); // 출력 부분
        }
    }/** 연결방법 모르겠음. 출력안됨 */

    /**
     * author : 최민서
     * des : merge sort
     * 배열을 반으로 나누기 - 각 length가 1일때 까지 반복
     * 인접한 부분끼리 비교후 정렬
     * 합치기
     *
     * 참고 : https://st-lab.tistory.com/233
     */
    private static int[] sorted; // 정렬된 배열을 임시 저장할 메소드
    @Override
    public void mergeSort(int[] a) {

        sorted = new int[a.length];
        mergeSort(a, 0, a.length - 1);
        sorted = null;
    }

    private void mergeSort(int[] a, int left, int right) {
        if(left == right) return; // element가 하나일 경우 return

        int mid = (left + right) / 2; // 배열을 나눌 중간 부분

        mergeSort(a, left, mid); // 나눈 후 왼쪽 부분 다시 merge 정렬
        mergeSort(a, mid + 1, right); // 나눈 후 오른쪽 부분 merge 정렬

        merge(a, left, mid, right); // 병합
    }
    private static void merge(int[] a, int left, int mid, int right) {
        int l = left; // 왼쪽 부분 시작점
        int r = mid + 1; // 오른쪽 부분 시작점
        int idx = left;


        while(l <= mid && r <= right) {//  각부분의 시작점이 끝점보다 작거나 같을때까지 반복

            if(a[l] <= a[r]) {
                sorted[idx] = a[l];
                idx++;
                l++; //왼쪽 원소와 오른쪽 원소 비교 후 왼쪽이 더 작을 경우,
                     // 왼쪽 원소를 새 배열에 넣고 idx++
            }
            else {
                sorted[idx] = a[r];
                idx++;
                r++; //왼쪽 원소와 오른쪽 원소 비교 후 오른쪽이 더 작을 경우,
                // 오른쪽 원소를 새 배열에 넣고 idx++
            }
        }

        if(l > mid) { // l > mid 일 경우, 왼쪽 배열의 element가 새 배열에 다 채워짐
            while(r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        else {
            while(l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++; // 오른쪽 부분도 위와 같이 새 배열에 채우기
            }
        }

        for(int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }  // 새로 채운 배열을 원래 배열에 넣기
    } /** 출력 부분 어떻게 연결해야할지 막힘
     */

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }

}
