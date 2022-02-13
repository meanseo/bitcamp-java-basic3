package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : GraphService
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public interface GraphService {
    public int farthestNode(int n, int[][] edge);
    public int rank(int n, int[][] results);
    public int rooms(int[] arrows);
}
