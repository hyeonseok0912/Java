package dec06;

import java.util.Scanner;

public class Ceaser {

	public static void main(String[] args) {
		//1. 사용자가 평문을 입력합니다.
		Scanner sc = new Scanner(System.in);
		String input; //평문
		String encrypted = ""; //암호문
		
		//2. 저장
		System.out.println("암호화 할 문장을 입력하세요.(모두 대문자)");
		input = sc.nextLine();
		System.out.println(input);
		
		//3. 3자리 밀기
		for (int i = 0; i < input.length(); i++) {
			char ch = (char)(input.charAt(i)+3);
			//4. 저장
			encrypted += ch;
			
			}	
		//5. 출력
		System.out.println(encrypted);
	}

}
