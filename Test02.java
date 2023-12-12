package dec12;

public class Test02 {

	public static void main(String[] args) {
		//1차원 배열
		//2차원 배열, 동적가변배열
		//3차원 배열
		int arr1[][][] = new int[3][3][3];
		
		int num = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr1[i][j].length; k++) {
					arr1[i][j][k] = num++;
				}
			}
		}
		
		for (int[][] is : arr1) {
			for (int[] is2 : is) {
				for(int i : is2) {
					System.out.printf("%3d", i);
				}
				System.out.println("");
			}
			System.out.printf("%n");
		}// end foreach
	}
}
