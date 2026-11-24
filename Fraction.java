import java.util.Random;

public class Fraction {
    // instance variables (attributes, fields)
    private int numerator;
    private int denominator;

    // constructors
    public Fraction() { 
        Random random = new Random();
        numerator = random.nextInt(10)+1;
        denominator = random.nextInt(10)+1;
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
	public void reduce() {
		final int GCF = gcf();
		numerator = numerator/GCF;
		denominator = denominator/GCF;
	}
	
	//helper methods
	private int gcf() {
		int a = numerator;
		int b = denominator;
		while(b!=0) {
			int gcf = b;
			b = a%b;
			a = gcf;
		}
		return a;
	} 
	
	// static methods
	public static Fraction multiply(Fraction a, Fraction b) {
		int n = a.numerator * b.numerator;
		int d = a.denominator * b.denominator;
		Fraction ans = new Fraction(n, d);
		ans.reduce();
		return ans;
	}
	public static Fraction devide(Fraction a, Fraction b) {
		int n = a.numerator * b.denominator;
		int d = a.denominator * b.numerator;
		Fraction ans = new Fraction(n, d);
		ans.reduce();
		return ans;
	}
	public static Fraction add(Fraction a, Fraction b) {
		int n = a.numerator * b.denominator + 
				a.denominator * b.numerator;
		int d = a.denominator * b.numerator;
		Fraction ans = new Fraction(n, d);
		ans.reduce();
		return ans;
	}
	public static Fraction subtract(Fraction a, Fraction b) {
		int n = a.numerator * b.denominator - 
				a.denominator * b.numerator;
		int d = a.denominator * b.numerator;
		Fraction ans = new Fraction(n, d);
		ans.reduce();
		return ans;
	}
}

