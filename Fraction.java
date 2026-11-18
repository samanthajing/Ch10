public class Fraction {
    // instance variables (attributes, fields)
    private int numerator;
    private int denominator;

    // constructors
    public Fraction() { 
        numerator = 1;
        denominator = 1;
    }
    public Fraction(int n, int d) {
        numerator = n;
        setDenom(d);
    }
    public Fraction(String s) {
        numerator = Integer.parseInt(s.substring(0, s.indexOf("/")));
        setDenom(Integer.parseInt(s.substring(s.indexOf("/") + 1)));
    }
    public Fraction(Fraction f) {
		numerator = f.numerator;
		denominator = f.denominator;
	}

    // behaviour methods (accessor, mutator, helper)
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }
    public String toString() {
		return numerator + "/" + denominator;
	}
	public double toDouble() {
		return numerator*1.0/denominator;
	}
	
	// mutator methods 
	public void setNum(int n) {
		numerator = n;
	}
	public void setDenom(int d) {
		if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("Error: denomenator cannot be zero");
        }
	}
}
