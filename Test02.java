package dec11;

public class Test02 {

	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0;
		int n = 10; // 나눌 수

		while (n >= 1) {
			a[i++] = (n % 2);
			n /= 2;
		}
		for (i = 7; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}

}
