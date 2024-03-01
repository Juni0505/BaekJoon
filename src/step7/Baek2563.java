package step7;

import java.util.Scanner;

public class Baek2563 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        boolean[][] board = new boolean[101][101];
	        for (int i = 0; i < n; i++) {
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            for (int j = a; j < a + 10; j++) {
	                for (int k = b; k < b + 10; k++) {
	                    board[j][k] = true;
	                }
	            }
	        }
	        int area = 0;
	        for (int i = 1; i <= 100; i++) {
	            for (int j = 1; j <= 100; j++) {
	                if (board[i][j]) {
	                    area++;
	                }
	            }
	        }
	        System.out.println(area);
	        
	        scanner.close();
	}

}
