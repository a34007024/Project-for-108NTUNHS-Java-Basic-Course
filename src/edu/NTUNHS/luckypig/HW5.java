package edu.NTUNHS.luckypig;

import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
        // int[][] score = new int[3][5];
        int[][] score = { { 1, 76, 80, 66, 0 }, { 2, 88, 92, 35, 0 }, { 3, 90, 94, 95, 0 }, { 4, 100, 98, 78, 0 },
                { 5, 68, 70, 56, 0 } };
        float[] average = new float[5];
        System.out.println("座號\t國文\t英文\t數學\t總分\t平均");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                score[i][4] += score[i][j];
            }
            average[i] = (float)score[i][4]/3;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println(average[i]);
        }
        System.out.println("======以上為預設排序======");
        float[] sortedAV = average;
        Arrays.sort(sortedAV);
        int[][] sortedScore = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(average[i] == sortedAV[j]){
                    sortedScore[j][0] = score[i][0];
                    sortedScore[j][1] = score[i][1];
                    sortedScore[j][2] = score[i][2];
                    sortedScore[j][3] = score[i][3];
                    sortedScore[j][4] = score[i][4];
                }
            }
        }
        System.out.println("座號\t國文\t英文\t數學\t總分\t平均");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sortedScore[i][j] + "\t");
            }
            System.out.println(sortedAV[i]);
        }
    }
}