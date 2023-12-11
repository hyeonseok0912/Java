package dec08;

import java.util.Arrays;

// 다차원 배열 p190
// 2차원 배열 멀티어레이 = 배열 속에 배열이 있습니다.
// index, length 개념 중요
public class MultiArray01 {

	public static void main(String[] args) {

		int num = 10; // 값이 하나 들어감
		int numbers[] = new int[5]; // 값이 5개 들어감
		int numbers2[] = new int[] { 10, 20, 30, 40, 50 };
		int numbers3[] = { 10, 20, 30, 40, 50 };

		int numbers4[][] = new int[5][5]; // 25

		int numbers5[][] = new int[2][3]; // 6

		// 값대입
		numbers4[0][0] = 15;
		numbers4[0][1] = 25;
		numbers4[0][2] = 30;
		numbers4[0][3] = 35;
		numbers4[0][4] = 40;

		numbers4[1][0] = 17;
		numbers4[1][1] = 27;
		numbers4[1][2] = 37;
		numbers4[1][3] = 47;
		numbers4[1][4] = 57;

		// numbers4의 모든 값을 출력하는 for문을 만들어주세요.

		for (int i = 0; i < numbers4.length; i++) {
			for (int j = 0; j < numbers4.length; j++) {
				System.out.print(numbers4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 0; i < numbers5.length; i++) {
			for (int j = 0; j < numbers5[i].length; j++) {
				System.out.print(numbers5[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
		int numbers6[][] = new int[4][2];
		for (int i = 0; i < numbers6.length; i++) {
			for (int j = 0; j < numbers6[i].length; j++) {
				System.out.print(numbers6[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("==========================");
		int scores[][] = new int[2][3];
		//1~6까지 저장해주세요.
		
		int count = 1;
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = count++;
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int[] is : scores) {
			System.out.println(Arrays.toString(is));
		}
		
		System.out.println(Arrays.deepToString(scores));
		
		int arr01[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int arr02[][] = {{10, 20, 30},{40, 50, 60}}; //arr02[2][3]
		
		System.out.println("==========================");
		
		//중첩 for문으로 찍어주세요.
		
		for (int i = 0; i < arr02.length; i++) {
			for (int j = 0; j < arr02[i].length; j++) {
				System.out.print(arr02[i][j] + " ");
			}
			System.out.println();
		}
	}

}
