package step11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek24313 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a1 = Integer.parseInt(arr[0]), a0 = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int result = (a1 * n0 + a0 <= c * n0) && (c >= a1)?1:0;
        System.out.println(result);
    }
}
