package edu.NTUNHS.luckypig;

import java.util.Random;

public class Guess {
    private int bingoNumber;

    Guess() {
        Random rnd = new Random();
        bingoNumber = rnd.nextInt(101);// return number between 0~100
    }

    Guess(int minNumber, int MaxNumber) {
        Random rnd = new Random();
        bingoNumber = minNumber + rnd.nextInt(MaxNumber + 1 - minNumber);
    }

    public int judge(int guessNumber) {
        if (guessNumber == bingoNumber)
            return 0;
        else if (guessNumber > bingoNumber)
            return 1;
        else
            return -1;
    }

    public int getBingoNumber(){
        return bingoNumber;
    }
}