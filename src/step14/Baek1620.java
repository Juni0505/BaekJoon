package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		
		for(int i = 1; i <= n; i++) {
			String s = br.readLine();
			hm1.put(i, s);
			hm2.put(s, i);
		}
		
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(49 <= s.charAt(0) && s.charAt(0) <= 57) {
				sb.append(hm1.get(Integer.parseInt(s))).append("\n");
			}else {
				sb.append(hm2.get(s)).append("\n");
			}
		}
		System.out.println(sb);
	}
}
