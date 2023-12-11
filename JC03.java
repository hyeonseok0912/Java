package dec07;

public class JC03 {
	public static void main(String[] args) {
		int i, j;
		int temp;
		int a[] = {75, 95, 85, 100, 50};
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4 - i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
