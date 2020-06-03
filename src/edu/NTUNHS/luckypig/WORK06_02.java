package edu.NTUNHS.luckypig;

public class WORK06_02
{   // 主程式
    public static void main(String[] args)
    {   // 宣告Birthday類別型態的變數
        Birthday andy,michael;
        andy = new Birthday();  // 建立物件
        michael = new Birthday();
        andy.year = 62;
        andy.month =7;
        andy.day = 23;
        michael.year = 89;
        michael.month =9;
        michael.day = 10;
        // 呼叫物件的實例方法
        System.out.print("Andy的出生年月日= ");
        andy.printBirthday();
        System.out.print("Michael的出生年月日= ");
        michael.printBirthday();
    }
}