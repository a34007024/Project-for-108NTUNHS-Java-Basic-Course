package edu.NTUNHS.luckypig;
import java.util.Scanner;

/**
 * HW3_2
 * 費式數列
 */
public class HW3_2 {
    public static void main(String[] args) {
        long[] f = new long[100];
        f[0] = 0;f[1] = 1;
        System.out.println("請輸入一個數");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n < 0)System.out.println("請輸入大於0的整數");
        else if(n <= 92){
            for(int i=2;i<=n;i++){
                f[i] = f[i-1] + f[i-2];
            }
            System.out.println(f[n]);
        }
        else{
            System.out.println("超過Long能儲存的範圍囉~ 數字請輸入小一點的謝謝!");
        }
    }
}