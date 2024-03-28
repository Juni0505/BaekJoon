package step9;

import java.util.Scanner;

public class Baek2501 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int count = 0;
	        int result = 0;
	        
	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                count++; 
	                
	                if (count == k) {
	                    result = i;
	                    break;
	                }
	            }
	        }
	        
	        if (count < k) {
	            result = 0;
	        }
	        
	        System.out.println(result);
	        
	        sc.close();
	    }
}
