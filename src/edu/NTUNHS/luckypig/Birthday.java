package edu.NTUNHS.luckypig;

//Birthday類別實作
class Birthday // Birthday類別宣告
{ // 成員資料
    public int day;
    public int month;
    public int year;

    Birthday(){
        
    }

    Birthday(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 成員方法: 輸出成員資料的出生年月日
    public void printBirthday() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    public void setBirthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}