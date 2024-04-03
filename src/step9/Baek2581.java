package step9;

import java.util.Scanner;

public class Baek2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt(); 

        int sum = 0; 
        int min = -1;
        
        for (int i = m; i <= n; i++) {
            if (i == 1) continue; 
            boolean p = true; 
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { 
                    p = false;
                    break;
                }
            }
            if (p) { 
                if (min == -1) {
                	min = i;
                }
                sum += i; 
            }
        }

        if (min == -1) {
            System.out.println(-1); 
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}
