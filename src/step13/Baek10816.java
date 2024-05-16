package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baek10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Integer> map = new HashMap<>();
		
		int a = Integer.parseInt(br.readLine());
		String[] arr1 = br.readLine().split(" ");
		
		for (int i = 0; i < a; i++) {
			int num = Integer.parseInt(arr1[i]);
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int b = Integer.parseInt(br.readLine());
		String[] arr2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < b; i++) {
			int num = Integer.parseInt(arr2[i]);
			sb.append(map.getOrDefault(num, 0)).append(" ");
		}
		System.out.println(sb.toString().trim());
		br.close();
	}
}
