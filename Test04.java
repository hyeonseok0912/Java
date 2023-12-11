package dec08;
/*
 * 1차원의 점들이 주어졌을 때
 * 그 중 가장 거리가 짤은 것의 쌍을 출력하는 함수를 작성하시오.
 * (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
 * 
 * 예를들어 S = {1, 3, 4, 8, 13, 17, 20}이 주어졌다면,
 * 결과값은 (3,4)가 될 것이다.
 */
public class Test04 {

	public static void main(String[] args) {
		int daum[] = {1, 3, 4, 8, 13, 17, 20};
		int fir = 0; int sec = 0;
		int temp = daum[1] - daum[0];//거리차이를 저장할 변수
		int i, j = 0;
		
		for(i=0; i < daum.length - 1; i++) {
			for(j=i+1; j < daum.length - 1; j++) {
			if(daum[j] - daum[i] < temp) {
				fir = daum[i];
				sec = daum[j];
				temp = daum[j] - daum[i];
			}
		}
	}
		System.out.println("순서쌍은 : "+fir+", "+sec);
		System.out.println("거리차는 : " + temp);
	}
}
