package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        System.out.println("請輸入由PT8_2加密過的文字:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println("解密過後的字串為:");
        System.out.println(caeserDecrypt(input));
    }
    public static String caeserDecrypt(String input){
        char[] chArray = input.toCharArray();
        String decryptTextStr = "";
        for (int i = 0; i < chArray.length; i++) {
            if ((int) chArray[i] == 65)//A
                chArray[i] = (char)90;//Z
            else if ((int) chArray[i] == 97)//a
                chArray[i] = (char)122;//z
            else
                chArray[i] = (char) ((int) chArray[i] - 1);
            // https://stackoverflow.com/questions/17984975/convert-int-to-char-in-java
            decryptTextStr += chArray[i];
        }
        return decryptTextStr;
    }
}