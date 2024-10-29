
public class Clock {

    public static void main(String[] args) {
        // 3つのint型引数を渡しつつ、getSecondメソッドを呼び出す
        int seconds = getSeconds(18, 32, 47);
        //　演算結果表示する
        System.out.println("1日の経過秒数は… ：" + seconds + "秒");
    }

    // int型引数を3つ受け取るgetSecondメソッドの定義（戻り値あり）
    public static int getSeconds(int hh, int mm, int ss){
        //　時・分を秒の単位に揃えつつ加算し、mainメソッドに戻す
        int result = hh * 60 * 60 + mm * 60 + ss;
        return result;
    }

}
