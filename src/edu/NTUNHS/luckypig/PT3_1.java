package edu.NTUNHS.luckypig;

import java.util.Scanner;

/**
 * PT3_1
 */
public class PT3_1 {
    public static void main(String[] args) {
        int mode = 0;
        String grade = "";
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇模式(1為輸入分數判斷等第區間，2為輸入等第判斷分數區間):");
        mode = sc.nextInt();
        if(mode == 1){ 
            System.out.print("請輸入分數:");
            score = sc.nextInt();
            scoreToGrade(score);
        }
        else if(mode == 2){
            System.out.print("請輸入等第:");
            grade = sc.next();
            gradeToScore(grade);
        }
        else{
            System.out.println("您沒有選擇模式喔~");
        }
        sc.close();
    }
    public static void scoreToGrade(int scoreInput){
        if(scoreInput >= 0 && scoreInput <= 39) System.out.println("此分數介於F等地");
        else if(scoreInput >= 40 && scoreInput <= 49) System.out.println("此分數介於E等地");
        else if(scoreInput >= 50 && scoreInput <= 59) System.out.println("此分數介於D等地");
        else if(scoreInput >= 60 && scoreInput <= 62) System.out.println("此分數介於C-等地");
        else if(scoreInput >= 63 && scoreInput <= 66) System.out.println("此分數介於C等地");
        else if(scoreInput >= 67 && scoreInput <= 69) System.out.println("此分數介於C+等地");
        else if(scoreInput >= 70 && scoreInput <= 72) System.out.println("此分數介於B-等地");
        else if(scoreInput >= 73 && scoreInput <= 76) System.out.println("此分數介於B等地");
        else if(scoreInput >= 77 && scoreInput <= 79) System.out.println("此分數介於B+等地");
        else if(scoreInput >= 80 && scoreInput <= 84) System.out.println("此分數介於A-等地");
        else if(scoreInput >= 85 && scoreInput <= 89) System.out.println("此分數介於A等地");
        else if(scoreInput >= 90 && scoreInput <= 100) System.out.println("此分數介於A+等地");
    }
    public static void gradeToScore(String gradeInput){
        switch(gradeInput){
            case "A+":
                System.out.println("您的分數介於90~100之間");
                break;
            case "A":
                System.out.println("您的分數介於85~89之間");
                break;
            case "A-":
                System.out.println("您的分數介於80~84之間");
                break;
            case "B+":
                System.out.println("您的分數介於77~79之間");
                break;
            case "B":
                System.out.println("您的分數介於73~76之間");
                break;
            case "B-":
                System.out.println("您的分數介於70~72之間");
                break;
            case "C+":
                System.out.println("您的分數介於67~69之間");
                break;
            case "C":
                System.out.println("您的分數介於63~66之間");
                break;
            case "C-":
                System.out.println("您的分數介於60~62之間");
                break;
            case "D":
                System.out.println("您的分數介於50~59之間");
                break;
            case "E":
                System.out.println("您的分數介於40~49之間");
                break;
            case "F":
                System.out.println("您的分數介於0~39之間");
                break;
            default:
                System.out.println("您輸入的等地有誤喔(字母記得大寫!)");
                break;
        }
    }
}