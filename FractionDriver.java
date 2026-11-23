public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 8);
        Fraction f2 = new Fraction(1, 5);
        Fraction f3 = Fraction.multiply(f1, f2);
        System.out.println(f2.toDouble());
        f3.reduce();
        System.out.println(f3);
    }
}
