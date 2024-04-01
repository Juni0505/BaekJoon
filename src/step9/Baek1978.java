package step9;

import java.util.Scanner;

public class Baek1978 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int count = 0; 
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); 
            if (num < 2) {
                continue; 
            }
            boolean b = true; 
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    b = false; // 
                    break;
                }
            }
            if (b) {
                count++; // 소수이면 개수를 증가
            }
        }
        System.out.println(count); // 소수의 개수 출력
        sc.close();
    }
}
