package dec06;

public class Test05 {

	public static void main(String[] args) {
		String text = "1q2w3e4r5t";
		String answer = "";
		// 여기에서 문자를 모두 제거하고 숫자만 출력해주세요.

		for (int i = 0; i < text.length(); i++) {
			if (Character.isAlphabetic(text.charAt(i))) {
				continue;
			} else {
				answer += text.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
