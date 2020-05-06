package edu.NTUNHS.luckypig;
import java.util.Scanner;

/**
 * cooperative_auto_vendor_machine
 */
public class Midterm_Cooperative_auto_vendor_machine {
    static String[] items = { "Apple", "Orange", "Banana", "Grape", "Guava" };
    static int[] price = { 30, 33, 60, 66, 90 };
    static int[] inventory = { 10, 10, 10, 10, 10 };
    static int[] purchaseCount = { 0, 0, 0, 0, 0 };
    static int itemCount = 1;

    public static void main(String[] args) {
        // System.out.println("歡迎來到合作社，您可以在此盡情的選購商品\n要結帳時請輸入字母c\n祝您購物愉快~");
        System.out.println(
                "Welcome~ You can shop as much as you like\nPlease enter the letters c To checkout\nWish you a happy shopping ~!");
        printInventory();
        Scanner sc = new Scanner(System.in);
        String inputStringCache;
        int inputIntCache1, inputIntCache2;
        while (true) {
            System.out.print("Please input the item" + itemCount + " you want to purchase(1 to 5):");
            inputStringCache = sc.next();
            if (inputStringCache.equals("c") || inputStringCache.equals("C"))
                break;
            else {
                inputIntCache1 = Integer.parseInt(inputStringCache);
                if (inputIntCache1 >= 1 && inputIntCache1 <= 5) {
                    inputIntCache1 -= 1;// 等會在陣列存取時直接用

                    System.out.print("Please input the number of item" + itemCount + " you want to purchase:");
                    inputStringCache = sc.next();
                    if (inputStringCache.equals("c") || inputStringCache.equals("C"))
                        break;
                    else
                        inputIntCache2 = Integer.parseInt(inputStringCache);

                    if (inventory[inputIntCache1] >= inputIntCache2) {
                        inventory[inputIntCache1] -= inputIntCache2;
                        purchaseCount[inputIntCache1] += inputIntCache2;
                        itemCount += 1;// 成功交易地該品項，進入下一項
                    } else
                        System.out.println("The number of item is not enough, this deal will be cancel automatic");
                } else
                    System.out.println("Incorret number of item, please input again");
            }

            // System.out.println("inputStringCache:"+inputStringCache);//debug
        }
        sc.close();
        printBill();
    }

    public static void printInventory() {
        System.out.print("Items:\t");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + "\t");
        }
        System.out.println("");
        System.out.print("Price:\t");
        for (int i : price) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.print("Stock:\t");
        for (int i : inventory) {
            System.out.print(i + "\t");
        }
        System.out.println("");
    }

    public static void printBill() {
        System.out.println("Thanks for your purchasing~ Here's your Bill:");
        System.out.println("**********************************************");
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "\t*" + purchaseCount[i] + "\t*unit price:" + price[i] + "\t="
                    + price[i] * purchaseCount[i]);
            sum += price[i] * purchaseCount[i];
        }
        System.out.println("**********************************************");
        System.out.println("Thanks for your purchasing~ Total price is:" + sum);
    }

    public static int getSumPrice(){
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += price[i] * purchaseCount[i];
        }
        return sum;
    }
}