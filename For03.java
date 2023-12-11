package dec06;

public class For03 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + ":" + j + " ");
			}
			System.out.println("");
		}
		// 이제 아래문장을 반복문으로 출력해주세요
		// *****
		// *****
		// *****
		// *****
		// *****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("*");
			}
			// System.out.println("");
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
