package dec12;
// import 정리 : 안쓰는 것은 삭제, 없는 것은 넣어줍니다.

//ctrl + shift + o
//ctrl + shift + L 모든 명령어

public class Study4 {

	public static void main(String[] args) {
		int arr1[][] = new int[10][5];
		// 배열 속에 배열이 들어가 있습니다.
		// 왜 배열 씀?
		// 같은 타입의 여러 값을 한 변수에 저장합니다.

		System.out.println(arr1);// 주소가 나와요.
		System.out.println(arr1[0]);// 주소가 나와요.
		System.out.println(arr1[0][0]);// 값이 나와요
		System.out.println(arr1[0].length);// 배열을 한번 열고 그 속의 길이
		System.out.println(arr1[0][0]);// 배열속 그 값 출력

		for (int i = 0; i < arr1.length; i++) {// 외부
			for (int j = 0; j < arr1[i].length; j++) {// 내부
				System.out.print(arr1[i][j]);
			}
			System.out.println("");//엔터
		}
	}

}
