package step8;

import java.util.Scanner;

public class Baek2903 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int r = 3;
        for (int i = 1; i < n; i++) {
            r = (r * 2) - 1;
        }
        int points = r * r;
        System.out.println(points);
    }
}
