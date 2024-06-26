package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] cArr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		Arrays.sort(cArr);
		
		for(int i = 0; i < cArr.length; i++) {
			sb.append(cArr[i]);
		}
		
		sb.reverse();
		System.out.println(sb);
		
		br.close();
	}

}
