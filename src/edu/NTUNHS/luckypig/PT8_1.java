package edu.NTUNHS.luckypig;

import java.util.Scanner;

/**
 * PT8_1
 */
public class PT8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入英文字串:");
        String input = "",output = "";
        input = sc.nextLine();
        sc.close();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {// 大小寫轉換
            if (charArray[i] >= 65 && charArray[i] <= 90) {// 原字元為大寫字母
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {// 原字元為小寫字母
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
            output += charArray[i];
        }
        System.out.println("大小寫轉換過後:" + output);
        System.out.print("字元順序反轉後:");
        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}