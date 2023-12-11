package dec06;

public class For05 {

	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			if (i == 5) {
//				continue;
//			}
//			// System.out.print(i);
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print("_");
//			}
//			for (int j = 0; j < i*2+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i < 10; i+=2) {
//			for(int j = 9; j > i; j-=2) {
//				System.out.print("-");
//			}
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}System.out.println();
//			}
		//ForEach문 : 자바 1.5이후에 추가된 for문, 향상 for문
		//배열선언
		int number[] = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < number.length; i++) {//string은 length뒤에 괄호붙음
			System.out.println(number[i]);
		}
		System.out.println("============================");
		
		for(int i : number) {// 데이터 : 자료형
			System.out.println(i);
		}
	}
}
