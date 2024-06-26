package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek14425 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        int M = Integer.parseInt(st.nextToken());

	        HashSet<String> setS = new HashSet<>();
	        for (int i = 0; i < N; i++) {
	            setS.add(br.readLine());
	        }

	        int count = 0;
	        for (int i = 0; i < M; i++) {
	            String str = br.readLine();
	            if (setS.contains(str)) {
	                count++;
	            }
	        }

	        System.out.println(count);

	        br.close();
	}

}
