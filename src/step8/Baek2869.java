package step8;

import java.util.Scanner;

public class Baek2869 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int v = scanner.nextInt(); 
        scanner.close();

        int days = (v - b - 1) / (a - b) + 1;
        System.out.println(days);
	}

}
