import java.util.Random;
import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
        System.out.println("Fraction Quiz. Answers should be in lowest terms.");
        System.out.println();
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String[] operations = {"+", "-", "*", "/"};
        int q = 0;
        int c = 0;

        for (;;) {
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
            String randomOp = operations[r.nextInt(4)];
            System.out.print(f1 + " " + randomOp + " " + f2 + " "
                + "="
                + " ");
            String input = in.next();
            System.out.println();
            if (input.equals("quit")) break;
			Fraction i = new Fraction(input);
			Fraction ans;
			
			if(randomOp.equals("+")) {
                ans = Fraction.add(f1, f2);
			} else if(randomOp.equals("-")) {
                ans = Fraction.subtract(f1, f2);
			} else if(randomOp.equals("*")) {
                ans = Fraction.multiply(f1, f2);
			} else {
                ans = Fraction.devide(f1, f2);
			}
	
			if(i.getNum() == ans.getNum() && i.getDenom() == ans.getDenom()) {
                System.out.println("Correct.");
                System.out.println();
                q++;
                c++;
			} else {
                System.out.println("Incorrect. The answer is " + ans);
                System.out.println();
                q++;
			}
        }
        if (input.equals("quit")) {
            if (q == 0) {
                System.out.print("BOOOOO.");
            } else {
                double score = c / q * 100.0;
                System.out.print("Your score is " + score + ". ");
            }
        }
    }
}
