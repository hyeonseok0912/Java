package dec06;

public class For02 {

	public static void main(String[] args) {
		//1에서부터 25까지의 숫자를 출력합니다.
		//단 3의 배수는 Fizz
		//5의 배수는 Buzz
		//3의 배수이면서 5의 배수인 숫자는 FizzBuzz
		
		for (int i = 1; i <= 25; i++) {
			if (i % 15 == 0) {
				System.out.print("Fizz Buzz, ");
			} else if(i % 3 == 0) {
				System.out.print("Fizz, ");
			} else if(i % 5 == 0) {
				System.out.print("Buzz, ");
			} else {
				System.out.print(i+", ");
			}
		}
	}

}
