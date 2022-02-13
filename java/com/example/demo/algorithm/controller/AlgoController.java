package com.example.demo.algorithm.controller;

import com.example.demo.algorithm.domain.Stack;
import com.example.demo.algorithm.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : 최민서
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     최민서        최초 생성
 */
public class AlgoController {
    public void execute(Scanner scanner) {
        HashService hashService = new HashServiceImpl();
        GreedyService greedyService = new GreedyServiceImpl();
        GraphService graphService = new GraphServiceImpl();
        while (true) {
            System.out.println("[담당] 0.종료 1.김승현 2.김윤섭 3.최민서 4.한성수");
            switch (scanner.next()) {
                case "0":
                    System.out.println("EXIT");
                    return;
                case "1":
                    System.out.println("0.EXIT 1.sort 2.Binary Search 3.BruteForce");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");
                            return;
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                    }
                    break;
                case "2":
                    System.out.println("0.EXIT 1.stack 2.queue 3.DP");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");
                            return;
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                    }
                    break;
                case "3":
                    System.out.println("0.EXIT 1.hash 2.greedy 3.graph");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");
                            return;
                        case "1":
                            System.out.println("0.EIXT 1.failed player 2.phonebook " +
                                    "3.spy 4.best album");
                            switch (scanner.next()){
                                case "0":
                                    System.out.println("EIXT");
                                case "1":
                                    String[] participant = new String[10];
                                    String[] completion = new String[10];
                                    hashService.failedPlayer(participant, completion);
                                case "2":
                                    String[] phone_book = new String[10];
                                    hashService.phoneBook(phone_book);
                                case "3":
                                    String[][] clothes = new String[10][10];
                                    hashService.spy(clothes);
                                case "4":
                                    String[] genres = new String[10];
                                    int[] plays = new int[10];
                                default:
                                    System.out.println("Wrong Number");
                            }
                            break;
                        case "2":
                            System.out.println("0.EXIT 1.gymClothes 2.joyStick " +
                                    "3.bigNumber 4.lifeBoat 5.island 6.camera");
                            switch (scanner.next()){
                                case "0":
                                    System.out.println("EIXT");return;
                                case "1":break;
                                case "2":break;
                                case "3":break;
                                case "4":break;
                                case "5":break;
                                case "6":break;

                            }
                            break;
                        case "3":
                            break;
                    }
                    break;
                case "4":
                    System.out.println("0.EXIT 1.heap 2.DFS 3.BFS");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("EXIT");
                            return;
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                    }
                    break;
            }
        }
    }
}
