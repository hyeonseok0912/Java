package dec06;
//1~25까지 짝수의 갯수는?
public class Test02 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 1; i <=25; i++) {
			if (i % 2 == 0) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println("짝수의 갯수는? "+count);
	}

}
