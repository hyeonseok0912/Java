package dec07;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		int numbers[] = new int[10];
		numbers[0] = 1;
		numbers[1]= 2;
		//앞숫자 더하기 뒷수자 다음 칸에 저장
		//[1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
		
		for (int i = 0; i < numbers.length-2; i++) {
			numbers[i+2] = numbers[i] + numbers[i+1];
		}
		System.out.println(Arrays.toString(numbers));
	}

}

