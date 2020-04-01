package edu.NTUNHS.luckypig;
import java.util.*;
/**
 * HW3_1
 * 質數判斷
 */
public class HW3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入一個數字:");
        int inputNum;
        try{
            inputNum  = s.nextInt();
        }catch (Exception e) {
            System.out.println("請不要來亂~");
            inputNum = 0;
        }
        s.close();
        boolean prime = true;
        if(inputNum <= 0){
            prime = false;
        }
        for(int i = 2;i < inputNum/2;i++){
            if(inputNum % i == 0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "質數":"非質數" );
        
    }
}