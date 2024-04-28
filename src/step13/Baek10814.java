package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baek10814 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(br.readLine());

	        String[][] members = new String[n][2];

	        for (int i = 0; i < n; i++) {
	            String[] input = br.readLine().split(" ");
	            members[i][0] = input[0]; // 나이
	            members[i][1] = input[1]; // 이름
	        }

	        Arrays.sort(members, new Comparator<String[]>() {
	            @Override
	            public int compare(String[] m1, String[] m2) {
	                int age1 = Integer.parseInt(m1[0]);
	                int age2 = Integer.parseInt(m2[0]);
	                if (age1 == age2) {
	                    return 0;
	                } else {
	                    return Integer.compare(age1, age2);
	                }
	            }
	        });

	        StringBuilder sb = new StringBuilder();
	        for (String[] member : members) {
	            sb.append(member[0]).append(" ").append(member[1]).append("\n");
	        }
	        System.out.print(sb.toString());

	        br.close();
	    }
	}

