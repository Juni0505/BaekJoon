package step11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek24267 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine()) - 2;

        System.out.println(((n * n * n) + (3 * n * n) + (2 * n) ) / 6);
        System.out.println(3);
    }
}
