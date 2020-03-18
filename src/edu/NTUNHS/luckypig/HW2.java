package edu.NTUNHS.luckypig;
import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入三角形的底與高:");
		double base = sc1.nextDouble();
		double height = sc1.nextDouble();
		System.out.println("三角形的面積是:"+base*height/2);
	}
}
