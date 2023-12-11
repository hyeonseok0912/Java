package dec07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//배열
/*
 * 같은 타입의 값을 하나의 변수에 넣어서 관리합니다.
 * 
 * 같은 타입, 동일 관리, 주소 호출
 * 
 * int타입, 10칸, arr01
 * int arr01[] = new int[10];
 */
public class Array08 {

	public static void main(String[] args) {
		int arr01[] = new int[10];
		//System.out.println(arr01);//주소값 호출 [I@3d012ddd
		int num = 100;
		//System.out.println(num);
		
		//값 출력해보기
		//System.out.println(arr01[0]); //index에 위치한 값 출력
		//System.out.println(arr01.length);//배열의 길이 출력
		
		//길이 1 2 3 4 5 6 7 8 9 10 선언시 사용 = arr01.length
		//index 0 1 2 3 4 5 6 7 8 9 길이-1
		
		//값 입력
		arr01[0] = 10; //index에 값 저장
		
		int num2 = 111;
		arr01[1] = num; //타입이 맞다면 대입 가능합니다.
		
		for(int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
		System.out.println(Arrays.toString(arr01));
		
		for(int i : arr01) {
			System.out.println(i);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(55);
		list.add(85);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
