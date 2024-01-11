package step3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FastAplusB {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			arr[i] = n1+n2;
		}
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			bw.write(sb.toString());
			bw.newLine();
			sb.setLength(0);
		}
		bw.flush();
		bw.close();
		sc.close();
	}

}
