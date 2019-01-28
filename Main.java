import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner as = new Scanner(System.in);
        System.out.println("Введите число");

        int x = rand.nextInt(10);
        getm(x);

        while (true) {
            System.out.println("Повторить игру? 1- да, 0- нет");
            int h = as.nextInt();
            if (h == 1) {
                System.out.println("Введите число");
                x = rand.nextInt(10);
                getm(x);
            } else if (h == 0) {
                break;
            }
        }
    }

    static void getm(int x) {
        boolean gr = false;
        Scanner as = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int b = as.nextInt();
            if (b > x) {
                System.out.println("Ваше число больше моего");
            }
            if (b < x) {
                System.out.println("Ваше число меньше моего");
            }
            if (b == x) {
                System.out.println("Вы победили");
                gr = true;
                break;
            }
        }
        if (gr == false) {
            System.out.println("Вы проиграли");
        }
    }
}
