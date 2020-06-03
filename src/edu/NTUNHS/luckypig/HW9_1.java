package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class HW9_1 {
    public static void main(String[] args) {
        Guess guessNumGame = new Guess();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("來玩猜數字~~請輸入0~100的數字(輸入-1可以直接顯示答案):");
        int guessNumber = sc1.nextInt();
        int guessCount = 1;
        while (guessNumber != -1) {
            if (guessNumGame.judge(guessNumber) == -1)
                System.out.println("再猜大一點");
            else if (guessNumGame.judge(guessNumber) == 1)
                System.out.println("再猜小一點");
            else {
                System.out.println("ヾ(≧▽≦*) 恭喜猜對~!");
                break;
            }
            guessNumber = sc1.nextInt();
            guessCount += 1;
        }
        sc1.close();
        if (guessNumber == -1)
            System.out.println("答案為:" + guessNumGame.getBingoNumber());
        else
            System.out.println("總共猜了" + guessCount + "次");
    }
}