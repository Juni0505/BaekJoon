package step8;

import java.util.Scanner;

public class Baek2292 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int c = 1; 
        int a = 1; 

        while (c < n) {
            c += 6 * a; 
            a++; 
        }

        System.out.println(a);
        sc.close();
    }
}
