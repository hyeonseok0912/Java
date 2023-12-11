package dec08;

import java.util.Arrays;
import java.util.Random;

/*
 * 시리얼 키 만들기
 * 키 패턴 MH37W-N47XK-V7XM9-C7227-GCQG9
 * 		   AADDA-ADDAA-ADAAD-ADDDD-AAAAD
 * A영문자, D숫자
 * 영문자는 A~X, 숫자는 1~9
 * 위 패턴을 준수하는 시리얼 키 10개 만들어서 화면에 출력하세요.
 */
//System.out.pritnln(text.toUpperCase());

public class Test03 {

	public static void main(String[] args) {
		String pattern = "AADDA-ADDAA-ADAAD-ADDDD-AAAAD";
		String key[] = new String[29];
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < pattern.length(); j++) {
		
			if (pattern.charAt(i) == 'A')	{
				System.out.println("영문자 위치입니다.");
				char randomAlphabet = (char)(random.nextInt(24) + 65);
				key[i] += randomAlphabet;
			}
			else if(pattern.charAt(i) == 'D')	{
				System.out.println("숫자 위치입니다.");
				int randomInt = (int)(random.nextInt(9)) + 1;
			} else {
				System.out.println("-위치입니다.");
				key[i] = "-";
			}
		}
			System.out.println(Arrays.toString(key));
	}
	}
}
