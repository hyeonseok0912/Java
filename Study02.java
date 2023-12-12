package dec12;

import java.util.Arrays;

public class Study02 {

	public static void main(String[] args) {
		//배열의 형태변환 char, int
		
		int number = 92;
		char chArray[] = new char[10];
		
		for (int i = 0; i < chArray.length; i++) {
			chArray[i] = (char) number++;
		}
		for (char c : chArray) {
			System.out.printf("%2c", c);
		}
		
		//String에서 char 추출하고 배열에 집어넣기
		String name = "홍길동";
		//문자열 : 문자의 집합
		//문자 : 하나의 글자
		
		chArray[0] = name.charAt(0);
		chArray[1] = name.charAt(0);
		chArray[2] = name.charAt(0);
		
		System.out.println(Arrays.toString(chArray));
		
		String temp = String.valueOf(chArray);
		temp = new String(chArray);
		System.out.println(temp);
		
		String str = "홍길동";
		str += "?";
		
		System.out.println(str.getBytes());
	}
}
