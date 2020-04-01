package edu.NTUNHS.luckypig;

/**
 * iplusplus_and_plusplusj
 */
public class iplusplus_and_plusplusj {
    public static void main(String[] args) {
        int i = 10;
        int j = i++;

        if( (i > ++j) && (i++ == j) ){
            i += j;
        }

        System.out.println("執行後:i=" + i + "，j=" + j);
    }
}