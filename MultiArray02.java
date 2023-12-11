package dec08;

import java.util.Arrays;

//3x3 배열을 만들어주시고 1~9까지 데이터를 입력해주세요.
public class MultiArray02 {

	public static void main(String[] args) {
		//int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}}; //처럼
		int arr[][] = new int[3][3];
		int number = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = number;
				number++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
