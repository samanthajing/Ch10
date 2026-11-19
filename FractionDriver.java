public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = Fraction.mult(f1, f2);
        System.out.println(f3);
        System.out.println(f2.toDouble());
    }
}
