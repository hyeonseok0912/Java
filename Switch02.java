package dec11;

public class Switch02 {

	public static void main(String[] args) {
		
		int score = 75;
		int scoreRange = score / 10;
		char hakzum;
		
		switch (scoreRange) {
		case 10:
		case 9:
			hakzum = 'A';
			break;
			
		case 8:
			hakzum = 'B';
		break;
		
		case 7:
			hakzum = 'C';
		break;
		
		case 6:
			hakzum = 'D';
		break;

		default:
			hakzum = 'F';
			break;
		}
		System.out.println(hakzum);
	}

}
