package dec12;

import java.util.Arrays;

//배열복사 : 배열의 값을 다른 배열에 복사하기
public class ArrayCopy01 {

	public static void main(String[] args) {
		int arr1[] = new int[] {10, 20, 30, 40, 50 ,60 };
		int arr2[] = new int[arr1.length];
		
		//깊은 복사 = 실제 값을 새로운 메모리 공간에 복사
		//얕은 복사 = 주소 값을 복사합니다.
		
		arr2 = arr1;//얕은 복사
		arr1[0] = 100;
		arr1[2] = 999;
		
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("=========================");
		
		//깊은 복사
		arr2 = new int[6];
		
		arr2[0] = arr1[0];
		arr2[1] = arr1[1];
		arr2[2] = arr1[2];
		arr2[3] = arr1[3];
		arr2[4] = arr1[4];
		arr2[5] = arr1[5];
		
		arr1[0] = 1000;
		arr2[5] = 6;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1);
		System.out.println(arr2);
	}
}
