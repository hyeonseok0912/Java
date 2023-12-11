package dec06;
//반복문 2023-12-06
/*
 * 자바에서는 필요에 따라서 특정 문장을 반복적으로 실행해야 할 때가 있습니다.
 * 이때 사용되는 구문이 loop문입니다.
 * 자바는 3가지를 제공해줍니다. for(forEach), while, do~while
 * 
 * for(변수초기화식; 변수조건문; 변수증감식){
 * 		변수 조건문이 참이 된다면 반복 실행할 문장;
 * }
 */
public class For01 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			//System.out.print("*");
		}
		
	// 1~10까지 출력하는 for문
	// 1, 2, 3, 4,... 9, 10 까지 출력
		for (int i = 1; i <=10; i++) {
			if(i == 10) {
				//System.out.println("10");
				break;
			}
			//System.out.print(i+", ");
		}
		
		for (int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
				System.out.println(i + ", ");
			} else {
				System.out.print(i + ", ");
			}
		}
	}

}
