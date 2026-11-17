public class FractionDriver {
	public static void main (String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(6, 7);
		System.out.println(f1);
		System.out.println(f1.getNum() + "/" + f1.getDenom());
		System.out.println(f2.getNum() + "/" + f2.getDenom());
	}
}
