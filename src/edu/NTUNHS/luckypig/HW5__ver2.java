package edu.NTUNHS.luckypig;

public class HW5__ver2 {
    public static void main(String[] args) {
        int[][] sc = { { 5, 68, 70, 56, 0 }, { 2, 88, 92, 35, 0 }, { 1, 76, 80, 66, 0 }, { 4, 100, 98, 78, 0 },
                { 3, 90, 94, 95, 0 } };
        float[] avg = new float[5];
        System.out.println("座號\t國文\t英文\t數學\t總分\t平均");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                sc[i][4] += sc[i][j];
            }
            avg[i] = (float) sc[i][4] / 3;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sc[i][j] + "\t");
            }
            System.out.println(avg[i]);
        }
    }
}