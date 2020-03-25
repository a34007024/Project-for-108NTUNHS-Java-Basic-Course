package edu.NTUNHS.luckypig;
import java.util.*;
/**
 * printStarPyramid
 */
public class printStarTriangle {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("請輸入要幾層三角形:");
        drawTriangle(sc1.nextInt());
        sc1.close();
    }

    private static void drawTriangle(int count) {
        int i, j;
        for ( i = 1; i <= count; i++ ) {
           for ( j = 1; j <= i; j++ )
              System.out.print("*");
           System.out.print("\n");
        }
    }
}