public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 5);
        Fraction f3 = Fraction.multiply(f1, f2);
        System.out.println(f1);
        f3.reduce();
        System.out.println(f3);
    }
}
