package dec11;

public class Test04 {

	public static void main(String[] args) {
		int number = 1234;
		  int div = 10;
		  int result = 0;
		 
		  while (number > 0) // (1.>)
		  {
		    result = result * div;
		    result = result + number % div; //(2. %)
		    number = number / div; //(3. /)
		  }
		  
		  //printf("%d", result);
		  System.out.println(result); //4321
	}

}
