package step5;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Baek11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			for(int i = 0; i < 101; i++) {
				if(sc.hasNextLine() == true) {
					System.out.println(sc.nextLine());
				}else {
					break;
				}
			}
		} catch (NoSuchElementException e) {
			sc.close();
		}
		sc.close();
	}

}
