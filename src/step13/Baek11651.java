package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int n = Integer.parseInt(br.readLine());
		
		int [][] coordi = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			coordi[i][0] = Integer.parseInt(input[0]);
			coordi[i][1] = Integer.parseInt(input[1]);
		}
		
		Arrays.sort(coordi, (a,b) -> {
			if(a[1] == b[1]) {
				return Integer.compare(a[0], b[0]);
			}
			
			return Integer.compare(a[1], b[1]);
		});
		
		for(int i = 0 ; i < n; i++) {
			System.out.println(coordi[i][0] + " " + coordi[i][1]);
		}
		
		
		br.close();
	}
}
