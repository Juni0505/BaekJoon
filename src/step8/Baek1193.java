package step8;

import java.util.Scanner;

public class Baek1193 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int n = 1;
        while (x > n) {
            x -= n;
            n++;
        }

        if (n % 2 == 1) {
            System.out.println((n - x + 1) + "/" + x);
        } else {
            System.out.println(x + "/" + (n - x + 1));
        }
    }

}
