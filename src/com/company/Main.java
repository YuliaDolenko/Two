package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        chessBoard();
    }

    public static void chessBoard() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Выберите цифру, на позицию которой вы хотите походить: вы стоите на d4," +
                "\n        c2 = 1;\n" +
                "        int e2 = 2;\n" +
                "        int c6 = 3;\n" +
                "        int e6= 4;\n" +
                "        int b3 = 5;\n" +
                "        int b5 = 6;\n" +
                "        int f5 = 7;\n" +
                "        int f3 = 8;  ");
        int currentPositionD4 = enter.nextInt();
        int c2 = 1;
        int e2 = 2;
        int c6 = 3;
        int e6 = 4;
        int b3 = 5;
        int b5 = 6;
        int f5 = 7;
        int f3 = 8;
        String step;
        switch (currentPositionD4) {
            case 1:
                step = "Ход возможен, вы походили на c2";
                break;
            case 2:
                step = "Ход возможен, вы походили на e2";
                break;
            case 3:
                step = "Ход возможен, вы походили на c6";
                break;
            case 4:
                step = "Ход возможен, вы походили на e6";
                break;
            case 5:
                step = "Ход возможен, вы походили на b3";
                break;
            case 6:
                step = "Ход возможен, вы походили на b5";
                break;
            case 7:
                step = "Ход возможен, вы походили на f5";
                break;
            case 8:
                step = "Ход возможен, вы походили на f3";
                break;

            default:
                step = "Ход невозможен, данная фигура не может так ходить";
                break;
        }
        System.out.println(step);
    }
}
