package level4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baek3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			s.add(a%42);
		}
		System.out.println(s.size());
		sc.close();
	}

}
