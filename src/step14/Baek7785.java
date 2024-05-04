package step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		HashSet<String> records = new HashSet<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String act = st.nextToken();

			if (act.equals("enter")) {
				records.add(name);
			} else {
				records.remove(name);
			}
		}

		ArrayList<String> sL = new ArrayList<>(records);
		Collections.sort(sL, Collections.reverseOrder());
		for (String p : sL) {
			bw.write(p + "\n");
		}

		br.close();
		bw.close();
	}

}
