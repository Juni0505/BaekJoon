package level2;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int[] arr = {n1,n2,n3};
		int a = 1;
		int s = 0;
		Arrays.sort(arr);
		for(int i = 0; i< arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				s = arr[i];
				a +=1;
			}
		}
		if(a == 1) {
			System.out.println(arr[2]*100);
		}else if(a==2) {
			System.out.println(1000+s*100);
		}else if(a==3) {
			System.out.println(10000+s*1000);
		}
		sc.close();
	
	}

}
