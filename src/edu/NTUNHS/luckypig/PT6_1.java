package edu.NTUNHS.luckypig;

public class PT6_1 {
    public static void main(String[] args) {
        int[]  math  =  {50,  65,  80,  48,  35,  93,  57,  90,  86,  77};
        int pass = 0,failed = 0;
        for (int score : math) {
            if(score >= 60)pass += 1;
            else failed += 1;
        }
        int[] sorted = bubbleSort(math);
        System.out.print("成績由大至小排序:");
        for(int i = math.length-1;i>=0;i--){
            System.out.print(sorted[i] + " ");
        }
        System.out.println("\n通過人數:" + pass + "人\t不及格人數:" + failed +"人");
    }

    private static int[] bubbleSort(int[] input){
        int[] output = input;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length-1;j++){
                int swap = 0;
                if(output[j] > output[j+1]){
                    swap = output[j];
                    output[j] = output[j+1];
                    output[j+1] = swap;
                }
            }
        }
        return output;
    }
}