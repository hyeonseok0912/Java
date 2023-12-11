package dec05;
//제어문 = 조건문, 반복문
/*
 * 조건문 = if, switch
 * 
 * 반복문 = for, while, do~while
 * 
 * 
 * 
 *if
 *제어문이란 프로그램이 실행될 때 특정 조건, 반복을 수행 또는
 *멈추게 하기 위해 필요한 명령 구문입니다.
 *
 *제어문은 조건에 따라 분기되는 조건문과
 *특정 구문을 반복하는 반복문으로 구성되어 있습니다.
 *
 *조건문은 if (조건식){
 *	조건식이 참일때 실행할 문장
 *}
 *
 *if (조건식){
 *		참일때
 *} else {
 *		거짓일때
 *}
 *
 *if (조건식1){
 *		조건식1이 참일때
 *} else if (조건식2){
 *		조건식2가 참일때
 *}	else {
 *		위 조건식 1,2에 모두 거짓일때
 *}
 *
 *switch ~ case 구문도 있습니다.
 *
 *if 조건문은 필요에 따라 구성할 수 있습니다.
 *if만 정의해도 되고, if~else if()로 구성해도 됩니다.
 *if와 else로 만 구성해도 됩니다. (특별한 규칙이 없습니다)
 *단, if가 없는 else if, else는 절대 불가능합니다.
 *또한 필요에 따라 각 구문 내부에 또 다시 조건을 중첩시킬 수 있습니다.
 *
 */
public class IF01 {
	public static void main(String[] args) {
		int num = 5;
		
		if(num > 5)	{
			System.out.println("5보다 큽니다.");
		} else if(num < 5){
			System.out.println("5보다 작습니다.");
		} else {
			//위 조건식이 거짓이라면 출력될 문장;
			System.out.println("5입니다");
		}
		
		
	}
}
