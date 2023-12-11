package dec05;
/*
 * 여러분은 과수원을 하고 있습니다.
 * 키우는 과일은 사과, 배, 오렌지 입니다.
 * 각각 하루 생산량은 5, 7, 5개가 열립니다.
 * 위 값을 기준으로 하루 총 생산되는 과일의 수를 출력해주세요.
 * 출력시키고 하루 기준으로 시간당 몇 개의 과일이 열리는지 출력해주세요.
 * 예)총 생산 갯수 : 17
 *    시간당 생산 갯수 : 0.nnnnn...
 *    
 *  주의 : 최대한 변수를 많이 사용하고, 반드시 한번의 리터럴 값을 적어주세요.
 *  	   캐스팅 많이 활용하세요. 평균 변수는 float 타입으로 선언하셔서
 *         사용하세요.
 */

public class Test01 {

	public static void main(String[] args) {
		int apple = 5;
		int pear = 7;
		int orange = 5;
		float avg1;

		int total = apple + pear + orange;
		avg1 = (float) total / 24;

		System.out.println("하루 총 생산되는 과일의 수: " + total);
		System.out.println("시간당 생산 갯수: " + avg1);
	}

}
