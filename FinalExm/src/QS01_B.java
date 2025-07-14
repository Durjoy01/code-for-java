import java.util.Scanner;

class NegativeNumberException extends Exception{
	public NegativeNumberException(String warning) {
		super(warning);
	}
}
public class QS01_B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter any number: ");
			int n = input.nextInt();
			
			if(n<0)
				throw new NegativeNumberException("Negative Number Exception!");
			else
				System.out.println("Thank you!");
		}catch(NegativeNumberException ex) {
			System.out.println(ex);
		}

	}

}