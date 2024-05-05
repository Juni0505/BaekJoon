package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int[] sortN = nums.clone();
		Arrays.sort(sortN);
		HashMap<Integer, Integer> comp = new HashMap<>();
		int index = 0;
		for (int num : sortN) {
			if (!comp.containsKey(num)) {
				comp.put(num, index++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int num : nums) {
			sb.append(comp.get(num)).append(" ");
		}
		System.out.println(sb);

		br.close();
	}
}
