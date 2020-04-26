package edu.NTUNHS.luckypig;

import java.util.Arrays;

public class PT6_2 {
    public static void main(String[] args) {
        int[][] score = { { 76, 80, 66, }, { 88, 92, 35 }, { 90, 94, 95 }, { 100, 98, 78 }, { 68, 70, 56 } };
        int[] sum = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "位同學的國文成績為:" + score[i][0] + "分\t英文成績為:" + score[i][1] + "分\t數學成績為:"
                    + score[i][2] + "分");
            
            for (int j = 0; j < 3; j++) {
                sum[i] += score[i][j];
            }
            System.out.print("總成績為:" + sum + "分");
            System.out.println("\t平均分數為:" + (float) sum[i] / 3 + "分");
            System.out.println("=================================================");
        }
        Arrays.sort(sum);
        System.out.print("總成績由小至大排序:");
        for(int i : sum)System.out.print(i + " ");
    }
}