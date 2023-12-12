package dec12;

import java.util.ArrayList;
import java.util.Arrays;

public class Study {

	public static void main(String[] args) {

		int arr1[][] = new int[3][]; // 미완성 -> 추상화 -> 인터페이스

		System.out.println(arr1); // [[I@626b2d4a
		System.out.println(arr1.length); // 3
		System.out.println(arr1[0]);// null
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = new int[(int)(Math.random() * 5 + 3)];
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = i * j + 1;
			}
		}
		
		for (int[] is : arr1) {
			System.out.println(Arrays.toString(is));
		}
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> ele = new ArrayList<Integer>();
		ele.add(1);
		ele.add(2);
		ele.add(3);//내부
		
		list.add(ele);//외부
		
		ele = new ArrayList<Integer>();
		ele.add(4);
		ele.add(5);
		ele.add(6);//내부
		list.add(ele);//외부
		
		System.out.println(list);
		
		int arr2[][] = new int[][]{{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(arr2));
	}
}
