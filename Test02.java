package dec08;
/*
 * 친구의 비밀번호
 * 인터넷을 사용하려고 친구에게 물었습니다.
 * wifi password가 뭐냐고
 * 친구의 대답은 : 일이삼사오육
 * 123456을 넣었으나 열리지 않자 다졌더니
 * (일이 2개, 삼이 4개, 오가 6개)
 */
public class Test02 {

	public static void main(String[] args) {
		
		int passwrod[] = new int[12];
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j <= i+1; j++ ) {
					System.out.print(i+1);
				}
			}
		}
	}

}
