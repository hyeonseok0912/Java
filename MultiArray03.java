package dec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MultiArray03 {

	public static void main(String[] args) {

//3x3배열을 만들어주시고 1~9까지 데이터를 랜덤하게 입력해주세요.
		int sam[][] = new int[3][3];

		for (int i = 0; i < sam.length; i++) {
			B: for (int j = 0; j < sam[i].length; j++) {
				int temp = (int) (Math.random() * 9 + 1);
				// 중복 검사
				for (int k = 0; k < sam.length; k++) {
					for (int k2 = 0; k2 < sam[i].length; k2++) {
						if (sam[k][k2] == temp) {
							j--;
							continue B;
						}
					}
				}
				sam[i][j] = temp;
			}
		}
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}

		System.out.println("==========================");
		// 바꿔서 해보기
		// 1~9를 랜덤하게 뽑아서 배열에 저장

		int random[] = new int[9];
		sam = new int[3][3];

		// 1~9 숫자 랜덤하게 만들기
		A: for (int i = 0; i < random.length; i++) {

			int temp2 = (int) (Math.random() * 9 + 1);
			// 중복검사
			for (int j = 0; j < random.length; j++) {
				if (random[j] == temp2) {
					i--;
					continue A;// 숫자 랜덤으로 다시 뽑기 위해서 A로 돌아감
				}
			}
			random[i] = temp2;
		}
		System.out.println(Arrays.toString(random));

		System.out.println("=========================");

		System.out.println("========================");

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);// {1, 2, 3, 4}

		list.remove(0);
		list.add(1);
		System.out.println(list);// {2, 3, 4, 1}

		list.add(0, 0);
		System.out.println(list);// {0, 2, 3, 4, 1}

		list.get(0); // 해당 위치의 값을 가져옵니다.
		list.size(); // 해당 집합의 크기를 가져옵니다.

		list.set(0, 100); // set은 변경, add는 추가
		System.out.println(list);

		System.out.println("=====================");
		sam = new int[3][3];
		int r1, r2;// index 번호
		for (int i = 1; i < 10; i++) {
			r1 = (int) (Math.random() * 3);
			r2 = (int) (Math.random() * 3);
			if (sam[r1][r2] == 0) { // sam[0][2] = 2;
				sam[r1][r2] = i;
				System.out.println(r1 + ":" + r2 + "=" + i);
			} else {
				i--;
				System.out.println("중복 발생으로 다시 뽑아!");
			}
		}

		// 출력
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}

		System.out.println("=====================");
		
		 int[][] a = new int[3][5];
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 5; j++) {
	            a[i][j] = j * 3 + (i + 1);
	            System.out.print(a[i][j] + " ");
	         }
	         System.out.println();
	      }

	}

}
