package edu.NTUNHS.luckypig;
import java.util.Scanner;

/**
 * HW3_2
 * 費式數列
 */
public class HW3_2 {
    public static void main(String[] args) {
        int[] f = {0,1,1,2,3,5,8,13,21,34};
        System.out.println("請輸入一個數");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n < 0)System.out.println("請輸入大於0的整數");
        else if(n <= 10){
            System.out.println(f[n-1]);
        }
        else{
            
        }
    }
}