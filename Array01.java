package dec07;

import java.util.Arrays;

/*
 * 배열
 * 무조건 하나만 기억해주세요.
 * 배열은 객체입니다. 그리고 객체는 기본적으로 속성과 메소드가 있습니다.
 * 배열에는 유일하게 속성만 가지고 있습니다.
 * 
 * 배열은 동일한 타입의 데이터를 하나의 묶음으로 관리하는 데이터 타입입니다.
 * 
 * 예)int 타입의 변수가 100개 필요하다면? -> 배열은 변수 하나에 100개 저장
 * 
 * 배열의 속성
 * 		length 배열의 길이를 int로 반환합니다.
 * 		객체의 속성과 메소드 등을 호출할 때는 .을 씁니다.
 * 
 * 		배열명.length
 * 
 * 배열의 특징
 * 		처음 생성할 때 길이를 적어줘야 합니다.
 * 		배열의 길이는 수정불가 입니다.
 * 		배열의 시작은 0부터
 * 		index
 * 
 * 배열 선언
 * 		int arr01[] = new int[5]; -> arr01을 다섯칸으로 나눠서 각각 값 저장
 * 
 * 		캐릭터를 3개 저장할 수 있는 배열을 선언해주세요.
 * 
 * 		Char ch[] = new char[3];
 * 
 */
public class Array01 {

	public static void main(String[] args) {
		// 배열 선언
		int arr1[] = new int[5];
		// int[] arr2 = new int[5];

//		System.out.println(arr1[0]); //index
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]); //마지막 index는 길이 - 1

		// 값 저장
		// 배열(객체) 생성시 기본값으로 초기화 됩니다.
		// 정수는 기본값이 0입니다.
		// 실수는 기본값이 0.0입니다.
		// 캐릭터는 기본값이 입니다.
		// 논리타입은 기본값이 거짓입니다.
		// R타입의 기본값은 null입니다.

		// 실수 기본형 형태의 배열을 만들고 칸은 3칸으로 초기화 해주세요.
		double arr2[] = new double[3];
		// System.out.println(arr2[2]);

		// 길이
		// System.out.println(arr2.length);
		// System.out.println(arr2[arr2.length-1]);
		// System.out.println(arr2[2]);

		// 값 대입
		arr2[0] = 123;
		arr2[1] = 200;
		arr2[2] = 300;
		// arr2[3] = 12;
		// System.out.println(arr2[0]);

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 100;
		}

		for (int i = 0; i < arr2.length; i++) {
			//System.out.println(arr2[i]);
		}
		
		//arr1에 1부터 끝까지 저장해주세요 [1, 2, 3, 4, 5]
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			//System.out.println(arr1[i]);
		}
		
		//forEach
		for (int i : arr1) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
}
