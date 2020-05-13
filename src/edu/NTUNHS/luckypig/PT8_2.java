package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class PT8_2 {
    public static void main(String[] args) {
        System.out.println("請輸入一串英文字:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chArray = input.toCharArray();
        String cyptoStr = "";
        sc.close();
        for (int i = 0; i < chArray.length; i++) {
            if ((int) chArray[i] == 90)//Z
                chArray[i] = (char)65;
            else if ((int) chArray[i] == 122)//z
                chArray[i] = (char)97;
            else
                chArray[i] = (char) ((int) chArray[i] + 1);
            // https://stackoverflow.com/questions/17984975/convert-int-to-char-in-java
            cyptoStr += chArray[i];
        }
        System.out.println("加密過後的字串為:");
        System.out.println(cyptoStr);
    }
}