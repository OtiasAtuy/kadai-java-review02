
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // int型10をint型0で除算 => double型に変更
        double a = 10.0 / 0.0; // ここで、例外が発生！ =>　例外が発生しない！

        // この下の出力は実行されない！！ => 実行されるように！
        System.out.println(a);
    }
}
