package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek24265 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(br.readLine());

	        int count = 0; 

	        for(int i = 1; i <= n-1; i++){
	            for(int j = i+1;  j <= n; j++){
	                count++;
	            }
	        }

	        System.out.println(count);

	    }
}
