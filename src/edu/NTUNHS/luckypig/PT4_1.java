package edu.NTUNHS.luckypig;
import java.util.*;

/**
 * PT4_1
 */
public class PT4_1 {//計算最大公因數的function
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("請輸入兩個整數用來計算最大公因數:");
        System.out.println(GCD(sc1.nextInt(),sc1.nextInt()));
        sc1.close();
    }
    public static int GCD(int x,int y){

        return x+y;
    }
}