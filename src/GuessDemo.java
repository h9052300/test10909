import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        int number = 6; //答案
        int guess;
        System.out.println("猜一個介於1~10之間的數字");
        do {
            System.out.println("請輸入您猜測的數字");
            Scanner scn = new Scanner(System.in);
            guess = scn.nextInt();
            if (guess > number) {
                System.out.println("太大!");
            } else if (guess < number) {
                System.out.println("太小!");
            }
        } while (guess == number);
        System.out.println("猜中嚕!答案為" + number);
    }
}
