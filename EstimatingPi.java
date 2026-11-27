public class EstimatingPi {
	public static void main (String[] margs) {
		Fraction MILU = new Fraction(355, 113);
		final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
		Fraction a = new Fraction(3, 1);
		while(Math.abs( Math.PI - a.toDouble()) >= EPSILON) {
			if (Math.PI > a.toDouble()) {
				a = new Fraction(a.getNum() + 1, a.getDenom());
			} else {
				a = new Fraction(a.getNum(), a.getDenom() + 1);
			}
		}
		System.out.println("Estimated pi: " + a);
	}
}

