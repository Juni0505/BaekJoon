package step10;

import java.util.Scanner;

public class Baek1085 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        int w = sc.nextInt(); 
        int h = sc.nextInt(); 
        sc.close();

        int minX = Math.min(x, w - x); 
        int minY = Math.min(y, h - y); 
        int min = Math.min(minX, minY); 

        System.out.println(min); // 
    }
}
