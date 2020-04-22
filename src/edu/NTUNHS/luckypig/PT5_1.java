package edu.NTUNHS.luckypig;

public class PT5_1 {
    public static void main(String[] args) {
        int[] num = {13, 25, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349};
        int sum=0,max=0,min=10000;
        for (int element : num) {
            sum += element;
            if(element > max)max = element;
            if(element < min)min = element;
        }
        System.out.println("Sum:" + sum);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}