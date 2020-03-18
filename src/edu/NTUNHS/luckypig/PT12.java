package edu.NTUNHS.luckypig;

/* @Author:LuckyPig
 * 2020/03/11
 * the usage of ${string_prompt} in Run Configuration Arguments
 * P12練習題使用多個args[]陣列參數
 */

public class PT12 {
	public static void main(String[] args) {
		System.out.println("請分別輸入您的年齡、居住城市與區域");
		System.out.println("您今年"+args[0]+"歲");
		System.out.println("您居住在"+args[1]+"的"+args[2]);
	}
}
