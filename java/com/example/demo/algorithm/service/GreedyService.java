package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : GreedyService
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public interface GreedyService {
    public int gymClothes(int n, int[] lost, int[] reserve);
    public int joyStick(String name);
    public String bigNumber(String number, int k);
    public int lifeBoat(int[] people, int limit);
    public int island(int n, int[][] costs);
    public int camera(int[][] routes);
}
