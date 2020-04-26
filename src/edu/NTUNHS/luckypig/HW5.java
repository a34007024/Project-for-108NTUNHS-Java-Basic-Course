package edu.NTUNHS.luckypig;

public class HW5 {
    public static void main(String[] args) {
        // int[][] score = new int[3][5];
        int[][] score = { { 76, 80, 66, }, { 88, 92, 35 }, { 90, 94, 95 }, { 100, 98, 78 }, { 68, 70, 56 } };
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "位同學的國文成績為:" + score[i][0] + "分\t英文成績為:" + score[i][1] + "分\t數學成績為:"
                    + score[i][2] + "分");
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += score[i][j];
            }
            System.out.print("總成績為:" + sum + "分");
            System.out.println("\t平均分數為:" + (float) sum / 3 + "分");
            System.out.println("=================================================");
        }
    }
}