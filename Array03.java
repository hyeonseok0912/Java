package dec07;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		
		//1~20까지 저장하는 배열 arr01을 만들어주세요.
		
		int[] array01 = new int[20];
		
		for (int i = 0; i < array01.length; i++) {
			if (i % 2 == 1) {
				array01[i] = (i + 1) * 10;
			} else {
				array01[i] = i + 1;
			}
		}
		System.out.println(Arrays.toString(array01));
	}

}
