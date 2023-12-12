package dec12;

import java.util.Arrays;

public class ArrayCopy02 {

	public static void main(String[] args) {
		int arr1[] = new int[] {10, 20, 30, 40, 50 ,60 };
		int arr2[] = new int[6];
		
		System.arraycopy(arr1, 1, arr2, 0, arr1.length-1);
		/*
		 * arraycopy(Object src, int srcPos, Object dest, int destPos, int lnegth)
		 * src 원본
		 * srcPos 어느 위치부터 복사?
		 * dest 값을 담을 배열
		 * destPos 어느 위치에 담을지
		 * length 어느 길이 만큼 복사
		 */
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int arr3[] = new int[arr2.length];
		arr3 = arr2.clone();
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
