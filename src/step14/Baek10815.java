package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek10815 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(br.readLine());
	        HashSet<Integer> cards = new HashSet<>();

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < n; i++) {
	            cards.add(Integer.parseInt(st.nextToken()));
	        }

	        int m = Integer.parseInt(br.readLine());

	        st = new StringTokenizer(br.readLine());
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < m; i++) {
	            int num = Integer.parseInt(st.nextToken());
	            if (cards.contains(num)) {
	                sb.append("1 ");
	            } else {
	                sb.append("0 ");
	            }
	        }

	        System.out.println(sb.toString().trim());

	        br.close();
	}

}
