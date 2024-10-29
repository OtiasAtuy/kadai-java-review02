
public class Review01 {

    public static void main(String[] args) {
        // 商品本体価格を入力
        int price = 1500;
        //　消費税額を計算するtaxメソッドを呼び出し
        int salesTax = tax(price);
        // 課題「税込価格 = 商品価格 + 消費税額 となるように計算してください」の部分
        int taxIncluded = price + salesTax;
        // 計算結果の数値を文言と混ぜながら出力
        System.out.println(price + "円の商品の税込価格は" + taxIncluded + "円（消費税は" + salesTax + "円）です。");
    }

    // 消費税額が戻り値となるtaxメソッド
    public static int tax(int price) {
        // 税率を変えられるよう、変数taxRateに格納
        int taxRate = 10;
        int salesTax = price / taxRate;
        return salesTax;
    }

}
