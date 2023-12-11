package dec11;

//do~while
/*
 * while문과 다르게 무조건 한번은 실행하고 그 후 조건에 따라 반복여부를
 * 결정합니다.
 * while문은 조건식이 거짓이라면 반복을 실행하지 않습니다.
 * do~while문은 무조건 한 번은 반복을 도는 형태입니다.
 */
public class Do_While01 {

	public static void main(String[] args) {

		do {
			System.out.println("반복합니다."); //실행 먼저 하는게 중요
		} while (!true);
	}

}
