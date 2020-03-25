package edu.NTUNHS.luckypig;
//import java.util.*;

/**
 * Global_Variable_VS_Local_Variable
 */
public class Global_Variable_VS_Local_Variable {
    static int v1 = 0;
    static void method(){
        int v2 = 0;
        v2 = 10;
    }
    static void method2(){
        int v3 = 0;
        for(int i=0;i<10;i++){
            v3 += 1;
            System.out.println("v3=" + v3);
        }
    }
    public static void main(String[] args) {
        v1 += 1;
        System.out.println("v1=" + v1);
        method2();
    }
}
