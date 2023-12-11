package dec05;

import java.io.IOException;

public class If06 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("0~9 중 하나의 숫자를 눌러주세요");
		int value = System.in.read() - 48;
		
		System.out.println(value);
	}
}
