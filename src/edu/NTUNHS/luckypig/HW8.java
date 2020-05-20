package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        // TODO ask user to encrypt or decrypt
        /*
         * 寫一個程式，讓使用者選擇要加密還解密 分別用兩個副程式來做 選擇完後讓使用者輸入字串後執行
         * 
         * 加密功能：轉換大小寫，移到下一個字元，反轉
         * 
         */
        System.out.println("請選擇功能(1.加密 2.解密 3.加解密都來):");
        Scanner sc = new Scanner(System.in);
        String input;
        switch (sc.nextLine()) {
            case "1":
                System.out.println("請輸入要加密的文字:");
                input = sc.nextLine();
                System.out.println("加密後的字串為:");
                System.out.println(encrypt(input, 1));
                break;
            case "2":
                System.out.println("請輸入要解密的文字:");
                input = sc.nextLine();
                System.out.println("解密後的字串為:");
                System.out.println(encrypt(input, -1));
                break;
            case "3":
                System.out.println("請輸入要加解密的文字:");
                input = sc.nextLine();
                System.out.println("加密後的字串為:");
                System.out.println(encrypt(input, 1));
                System.out.println("解密後的字串為:");
                System.out.println(encrypt(encrypt(input, 1), -1));
                break;
            default:
                System.out.println("輸入有誤喔!請檢查(小提示:不用輸入.喔!)");
                break;
        }
        sc.close();
    }

    public static String encrypt(String input, int i_encrypt) {
        // i_encrypt是指要位移幾個位元，感謝鑫哥提供此想法!
        char[] chArray = input.toCharArray();
        String encryptedString = "";
        for (int i = 0; i < chArray.length; i++) {
            // 位移位元
            if ((int) chArray[i] == 90)// Z
                chArray[i] = (char) (65 + i_encrypt - 1);// 修正使用者自訂位移位元
            else if ((int) chArray[i] == 122)// z
                chArray[i] = (char) (97 + i_encrypt - 1);// 修正使用者自訂位移位元
            else if ((int) chArray[i] == 32)
                chArray[i] = chArray[i];// 空白字元不轉換
            else
                chArray[i] = (char) ((int) chArray[i] + i_encrypt);
            // 大小寫轉換
            if ((int) chArray[i] >= 65 && (int) chArray[i] <= 90) {
                chArray[i] = Character.toLowerCase(chArray[i]);
            } else if ((int) chArray[i] >= 97 && (int) chArray[i] <= 122) {
                chArray[i] = Character.toUpperCase(chArray[i]);
            }
            encryptedString += chArray[i];
            // https://stackoverflow.com/questions/17984975/convert-int-to-char-in-java
        }
        return encryptedString;
    }
}