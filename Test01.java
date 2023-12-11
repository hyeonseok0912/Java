package dec08;

public class Test01 {

	public static void main(String[] args) {
		boolean check[] = new boolean[5];
		
		for (int i = 0; i < check.length; i++) {
			check[i] = i % 2 == 0 ? false : true;
		}
		
		for (boolean i : check) {
			System.out.println(i);
		}
	}

}