public class FractionDriver {
	public static void main (String[] args) {
		Fraction f1 = new Fraction("2/3");
		Fraction f2 = new Fraction(f1);
		System.out.println(f1);
		System.out.println(f2.toDouble());
	}
}
