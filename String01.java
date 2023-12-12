package dec12;

//String용법
/*
 * 독특함
 * #불변, #주소값, #문자열, #나누기, #GC
 * 
 * 문자열을 저장합니다. 값 저장할 때 "" 쌍따옴표를 사용합니다.
 * ""값을 기준으로 인스턴스를 생성합니다.
 * 값이 같으면 같은 값을 기존의 인스턴스를 참조합니다.(바라봅니다)
 */
public class String01 {

	public static void main(String[] args) {
		String hi = new String("Hi");//R타입 객체타입
		String hi2 = new String("Hi");

		hi = "안녕";
		hi =  "Hello";
		
		System.out.println(hi == hi2);// true
		//R타입에서 ==는? 같은 객체냐?
		//값이 같아?
		System.out.println(hi.equals(hi2));//앞 문자가 대문자면 이렇게 비교함
		
		String name = "";
		for (int i = 0; i < 20; i++) {
			name += i;
		}
		
		//String 대신에 사용하는 것
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 20; i++) {
			sb.append(i);
		}
		
		System.out.println(sb);
		String temp = sb.toString();
		
		temp = "안녕하세요";
		//.indexOf() 특정 문자가 몇 번째 인덱스에 있는지 출력합니다.
		System.out.println(temp.indexOf('녕'));
		System.out.println(temp.indexOf('강'));
		System.out.println(temp.indexOf('안'));
		
		int c = temp.indexOf('요');
		//.contains()해당 문자가 있으면 참, 없으면 거짓
		System.out.println(temp.contains("녕"));
		System.out.println(temp.contains("강"));
	}
}
