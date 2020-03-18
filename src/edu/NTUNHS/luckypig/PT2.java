package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class PT2 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請分別輸入國英數成績:");
		double chScore = sc1.nextDouble();
		double enScore = sc1.nextDouble();
		double mathScore = sc1.nextDouble();
		sc1.close();
		double total = chScore + enScore + mathScore;
		System.out.println("Total:"+ total + "Average:"+ total/3);
	}

}
