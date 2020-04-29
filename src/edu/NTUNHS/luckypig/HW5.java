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
        float[] sortedAV = average.clone();//java陣列複製必須用.clone()方法,否則直接sortedAV = average只會把記憶體位址指派過去
        Arrays.sort(sortedAV);
        int[][] sortedScore = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(sortedAV[i] == average[j]){
                    sortedScore[i][0] = score[j][0];
                    sortedScore[i][1] = score[j][1];
                    sortedScore[i][2] = score[j][2];
                    sortedScore[i][3] = score[j][3];
                    sortedScore[i][4] = score[j][4];
                }
            }
        }
        System.out.println("座號\t國文\t英文\t數學\t總分\t平均");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sortedScore[i][j] + "\t");
            }
            System.out.println(sortedAV[i] + "\t");
        }
        System.out.println("average的記憶以位置為：" + average);
    }
}