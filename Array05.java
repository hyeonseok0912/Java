package dec07;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		
		int num = 5;
		String text = "5";
		
		text = String.valueOf(num); // int 값을 String 값으로
		
		num = Integer.parseInt(text); // String 값을 int 값으로
		
		System.out.println(num);
		
		text = 5 + 5 + "";
		System.out.println(text);
		
		text = ""+ 5 + 5;
		System.out.println(text);
		System.out.println("===============================");
		
		Scanner sc = new Scanner(System.in);
		String msg = " 점수입력";
		String subject[] = {"자바", "jsp", "spring"};
		
		//점수를 저장하는 배열을 만들어 주세요.
		int score[] = new int[subject.length + 1];
	
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + msg);
			
			//점수를 입력받아서 저장해주세요.
			score[i] = sc.nextInt();
		}
		//모든 점수 및 총점/평균까지 출력해주세요.
		
		score[score.length - 1] = score[0] + score[1] + score[2];
		
		System.out.println("총점 : " + score[score.length - 1]);
		System.out.println("평균 : " + score[3] / 3);
	}

}
