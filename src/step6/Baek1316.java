package step6;

import java.util.Scanner;

public class Baek1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = num;
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			String s = sc.nextLine();
			boolean [] arr = new boolean[26];	// 알파벳 갯수 26개를 boolean 배열 생성 boolean 초기값은 false
			for(int j = 0; j < s.length(); j++) { // 해당 입력받은 문자열의 길이만큼 반복
				if(arr[s.charAt(j)-'a'] == false) { // 입력받은 문자열의 단어는 모두 소문자이기 때문에 'a'값을 빼게되면 해당 알파벳의 값으로 사용된값으로 true로 변
					arr[s.charAt(j)-'a'] = true;
				}else if(j > 0 && s.charAt(j) != s.charAt(j-1)) { // 해당 값이 j가 0 이면 첫번째 문자이기때문에 제외하고 연결된 문자인지 확인유무
					count--;	// 전 문자랑 일치하지않을경우 연결된 문자가 아니기때문에 count값에서 뺀 후 break
					break;
				}
			}
		}
		System.out.println(count);
		
		
		sc.close();
	}

}
