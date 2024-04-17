package step10;

import java.util.Scanner;

public class Baek9063 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MIN_VALUE;
        int d = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            a = Math.min(a, x);
            b = Math.min(b, y);
            c = Math.max(c, x);
            d = Math.max(d, y);
        }
        
        sc.close();
        
        int width = c - a;
        int height = d - b;
        
        int area = Math.max(0, width * height);
        
        System.out.println(area);
    }
}
