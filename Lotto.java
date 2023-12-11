package dec07;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		
		Random random = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			//lotto[i] = (int)(Math.random() * 45 + 1);
			lotto[i] = random.nextInt(45) + 1; // 1~45
		}
	System.out.println(Arrays.toString(lotto));
	}

}
