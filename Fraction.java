public class Fraction {
    // instance variables (attributes, fields)
    private int numerator, denominator;

    // constructors
    public Fraction() { // default constructor
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) { // parameterized constructor
        numerator = n;
        denominator = d;
    }

    // behaviour methods (accessor, mutator, helper)
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }
}
