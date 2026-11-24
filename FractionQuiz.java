impo
import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
	public static void main(String[] args) {
        System.out.println("Let the Fraction Quiz begin. " +
							"Answers should be in lowest terms. Good luck!");
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		String input = in.next();
		String[] operations = {"+", "-", "*", "/"};
		String randomOp = operations[r.nextInt(4)];
		for(;;){
			if (input.equals("quit")) break; 
			Fraction f1 = new Fraction();			
			Fraction f2 = new Fraction();
			System.out.print(f1 + " " + randomOp + " " + f2 + " " + "=" +  
							" " + input);
		}	
	}
}


