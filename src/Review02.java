
public class Review02 {

    public static void main(String[] args) {
        for (int i =1; i <= 100; i++) {
            // iが3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // iが3で割り切れる数なら "Fizz" と表示する
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // iが5で割り切れる数なら "Buzz" と表示する
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            // それ以外の数は、その数をそのまま表示する
            } else {
                System.out.println(i);
            }
        }
    }
}
