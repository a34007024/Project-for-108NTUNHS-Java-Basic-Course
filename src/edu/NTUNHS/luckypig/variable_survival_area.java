package edu.NTUNHS.luckypig;

/**
 * variable_survival_area
 */
public class variable_survival_area {
    static int a = 1;
    public static void main(String[] args) {
        int b = 5;
        System.out.println("10:before call fun,a="+a+"b="+b+"c="+c);
        System.out.println("**************");
        fun(b);
        System.out.println("**************");

        System.out.println("15:before while,a="+a+"b="+b+"c="+c);
        while (c==1) {
            int a=3;
            c=a;
            System.out.println("19:in while,a="+a+"b="+b+"c="+c);
        }
        System.out.println("21:after while,a="+a+"b="+b+"c="+c);
    }
    private static void fun(int c){

        System.out.println("25:just after local variable input to fun,c="+c);
        c=2;
        System.out.println("27:after local variable has been modified,c="+c);

        System.out.println("29:before declare local variable a, a="+a);
        int a=2;
        System.out.println("31:after declare local variable a, a="+a);
    }
    
    static int c = a;
}