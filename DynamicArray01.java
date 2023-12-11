package dec11;

//동적 가변배열
/*
 * 배열의 길을 동적으로 생성한다라는 뜻입니다.
 * 필요시에 길이를 생성합니다.
 * 동적가변배열이 아닌 것은 처음부터 배열의 길이를 입력(초기화)해서 사용
 * 동적가변배열은 값대입 전 필요할 때 길이를 생성해서 입력, 값대입을 합니다.
 * 필요한 만큼 만들어서 씁니다.
 * 
 */
public class DynamicArray01 {

	public static void main(String[] args) {
//		int arr1[][] = new int[3][3];
//		int arr2[][] = new int[3][];//다이나믹 어레이
//		
//		arr2[0] = new int[3];
//		arr2[1] = new int[6];
//		arr2[2] = new int[12];
//		
//		for(int[] is : arr2) {//0 1 2
//			for(int i : is) {//0 1 2
//				System.out.printf("%2d", i);
//			}System.err.println("");
//			}

		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][];// 다이나믹 어레이

		arr2[0] = new int[3];
		arr2[1] = new int[6];
		arr2[2] = new int[12];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
