package dec12;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {
		int num = 4;
		if(num == 5) {
			
		}else if(num == 4) {
			
		}else if(num == 3) {
			
		}else {
			
		}
		
		switch (num) {
		case 5:
			
			break;
		case 4:
			
			break;
		case 3:
			
			break;
		
		default:
			break;
		}
		
		//어떤 회사
		/*
		 * 자신의 직급을 입력하면 올라갈 수 있는 층이 표시되는 프로그램
		 * 1. 사장 2.부장 3.대리 4.사원 5.알바
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("직급을 선택해주세요.");
		System.out.println("1.사장 2.부장 3.대리 4.사원 5.알바");
		int input = sc.nextInt();
		
		switch (input) {
		case 1:
			System.out.print("5, ");
			break;
		case 2:
			System.out.print("4, ");
			break;
		case 3:
			System.out.print("3, ");
			break;
		case 4:
			System.out.print("2, ");
			break;
		case 5:
			System.out.print("1, ");
			break;

		default:
			break;
		}
		System.out.println("층까지 갈 수 있습니다.");
	}

}
