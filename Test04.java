package dec06;

//String 형이 아닌 Integer형으로 1~10000중 8의 갯수를 찾는 방법
//집에서 편하게 해보기
public class Test04 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i < 10000; i++) {
			if ((i / 1000) % 10 == 8) {
				count++;
			}
			if ((i / 100) % 10 == 8) {
				count++;
			}
			if ((i / 10) % 10 == 8) {
				count++;
			}
			if ((i % 10) == 8) {
				count++;
			}
		}
		System.out.println(count);
	}
}
