package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] board = new char[n][m];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = line.charAt(j);
			}
		}

		int minCount = Integer.MAX_VALUE;

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int count = 0;

				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if ((k + l) % 2 == 0) {
							if (board[k][l] != 'B')
								count++;
						} else {
							if (board[k][l] != 'W')
								count++;
						}
					}
				}
				minCount = Math.min(minCount, Math.min(count, 64 - count));
			}
		}

		System.out.println(minCount);

		br.close();
	}
}
