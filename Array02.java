package dec07;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		//문자열즐 저장하는 arr1 배열을 만들어주세요. 칸은 3칸
		
		//String arr1[] = new String[3];
		//String arr1[] = {"홍길동", "김길동", "이길동", "최길동"};
		String arr1[] = new String[]{"홍길동", "김길동", "이길동", "최길동"};
		
		//System.out.println(Arrays.toString(arr1));
		
		String name1 = arr1[0];
		//System.out.println(name1);
		//System.out.println(Arrays.toString(arr1));
		
		char chArray[] = name1.toCharArray();
		//System.out.println(Arrays.toString(chArray));
		
		//System.out.println(name1.length()); // 3
		//System.out.println(chArray.length); // 3
		//System.out.println(arr1[0].length()); // 3
		
		System.out.println("===========================");
		
		//로도.... 1~45의 숫자 중 6개 뽑기
		//정수를 저장하는 lotto배열 6칸짜리 만들어주세요.
		//거기에 랜덤한 수 뽑아서 저장해주세요.
		//for, random(), 중복검사는 x
		
		int lotto[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
		}
		System.out.println(Arrays.toString(lotto));
	}

}
