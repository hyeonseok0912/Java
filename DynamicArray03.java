package dec11;
//동적 가변 배열 = 톱니바퀴 배열이라고도 부릅니다.
public class DynamicArray03 {

	public static void main(String[] args) {
		char da[][] = new char[10][];
		//랜덤을 사용하여 내부측 길이를 만들고 그 속을 '*'로
		//2~15 사이의 숫자로 정해주세요.
		//그후 출력해주세요.
		
		for (int i = 0; i < da.length; i++) {
			da[i] = new char[(int)(Math.random()*13 + 2)];
			for (int j = 0; j < da[i].length; j++) {
				da[i][j] = '*';
				System.out.printf("%c", da[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
