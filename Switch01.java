package dec11;
// 스위치 switch
/*
 * if와 else if, else를 다르게 표현한 문장.
 * 각 조건은 case의 값과 비교해서 결과가 true일 경우 조건을 수행합니다.
 * 조건의 값은 수치형일 경우 int이하만 가능합니다.
 * 문자열도 비교 가능합니다.
 */
public class Switch01 {

	public static void main(String[] args) {
		
		int key = 5;
		
		switch (key) {
		case 4:
			System.out.println("key는 4입니다.");
			break;
			
		case 5:
			System.out.println("5입니다.");
			break;
			
		case 6:
			System.out.println("6입니다.");
			break;
			
		default:
			System.out.println("4, 5, 6이 아닙니다.");
			break;
		}
	}

}
