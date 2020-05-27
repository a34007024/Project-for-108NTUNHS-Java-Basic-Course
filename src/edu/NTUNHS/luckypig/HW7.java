package edu.NTUNHS.luckypig;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        int[] diceNumbers = new int[6];
        int[] bigPrice = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < diceNumbers.length; i++) {
            diceNumbers[i] = getPoint();
        }
        Arrays.sort(diceNumbers);
        System.out.print("DiceNumbers:");
        for (int i = 0; i < diceNumbers.length; i++) {
            System.out.print(diceNumbers[i] + " ");
        }
        System.out.println("");
        if (Arrays.equals(diceNumbers, bigPrice))
            System.out.println("恭喜中大獎!!");
        else if (price2(diceNumbers) == true) {
            System.out.println("恭喜中二獎!");
        } else if (price3(diceNumbers) == true) {
            System.out.println("恭喜中三獎!");
        } else
            System.out.println("別氣餒，再接再厲");
    }

    public static int getPoint() {
        int diceNumber = (int) (Math.floor(Math.random() * 6) + 1);
        return diceNumber;
    }

    public static boolean price2(int[] input) {
        int[] price2condition1 = { 1, 1, 1, 1, 1, 1 };
        int[] price2condition2 = { 2, 2, 2, 2, 2, 2 };
        int[] price2condition3 = { 3, 3, 3, 3, 3, 3 };
        int[] price2condition4 = { 4, 4, 4, 4, 4, 4 };
        int[] price2condition5 = { 5, 5, 5, 5, 5, 5 };
        int[] price2condition6 = { 6, 6, 6, 6, 6, 6 };
        if (Arrays.equals(input, price2condition1))
            return true;
        else if (Arrays.equals(input, price2condition2))
            return true;
        else if (Arrays.equals(input, price2condition3))
            return true;
        else if (Arrays.equals(input, price2condition4))
            return true;
        else if (Arrays.equals(input, price2condition5))
            return true;
        else if (Arrays.equals(input, price2condition6))
            return true;
        else
            return false;
    }

    public static boolean price3(int[] input) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1)
                c1 += 1;
            else if (input[i] == 2)
                c2 += 1;
            else if (input[i] == 3)
                c3 += 1;
            else if (input[i] == 4)
                c4 += 1;
            else if (input[i] == 5)
                c5 += 1;
            else if (input[i] == 6)
                c6 += 1;
        }
        if(c1 == 3 && (c2>=2||c3>=2||c4>=2||c5>=2||c6>=2))return true;
        else if(c2 == 3 && (c1>=2||c3>=2||c4>=2||c5>=2||c6>=2))return true;
        else if(c3 == 3 && (c1>=2||c2>=2||c4>=2||c5>=2||c6>=2))return true;
        else if(c4 == 3 && (c1>=2||c2>=2||c3>=2||c5>=2||c6>=2))return true;
        else if(c5 == 3 && (c1>=1||c2>=2||c3>=2||c4>=2||c6>=2))return true;
        else if(c6 == 3 && (c1>=1||c2>=2||c3>=2||c4>=2||c5>=2))return true;
        else return false;
    }

}