package com.example.demo.algorithm.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : HashService
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public interface HashService {
    public String failedPlayer(String[] participant, String[] completion);
    public boolean phoneBook(String[] phone_book);
    public int spy(String[][] clothes);
    public int[] bestAlbum(String[] genres, int[] plays);

}
