package edu.NTUNHS.luckypig;

public class stringCombine {
    public static void main(String[] args) {

        String str = " 枯藤，老樹，昏鴉， "; // 宣告String物件，並指定內容

        String strResult;

        System.out.println("str字串的內容是：" + str);
        // 將 str 前後的空白刪除
        strResult = str.trim();
        System.out.println("====將字串的前後空白清除=======");
        System.out.println("新字串的內容是：" + strResult + "\n");

        String strAdd = "小橋，流水，人家，古道，西風，瘦馬";
        System.out.println("====將原字串再連接新的字串=======");
        // 將 strAdd 連接在 strResult 的後面
        strResult = strResult.concat(strAdd);
        System.out.println("連接後，字串的內容是：" + strResult + "\n");

        System.out.println("====取出原字串第4個字開始的內容=======");
        // 取出第4個字(含)之後的所有內容
        String strTemp = strResult.substring(3);
        System.out.println("取出後，新字串的內容是：" + strTemp + "\n");

        System.out.println("====取出原字串第4，5個字的內容=======");
        // 取出第4~5位置個字(含)之後的所有內容
        strTemp = strResult.substring(3, 5);

        System.out.println("取出後，新字串的內容是：" + strTemp + "\n");

        System.out.println("====將字串中的「，」取代為「。」=======");
        // 將 strResult 中的「，」取代為「。」
        strTemp = strResult.replace("，", "。");
        System.out.println("取代後，新字串的內容是：" + strTemp + "\n");

        System.out.println("====在原字串中的「。」位置，分成 字串陣列=======");
        String[] splitStr = strTemp.split("。");
        for (int i = 0; i < splitStr.length; i++) {
            System.out.println(i + ":" + splitStr[i]);
        }

        System.out.println("====將字串中的「昏鴉」取代為「烏鴉」=======");
        strTemp = strResult.replace("昏鴉", "烏鴉");
        System.out.println("取代後，新字串的內容是：" + strTemp + "\n");
        System.out.println("西風在第7個");
    }
}