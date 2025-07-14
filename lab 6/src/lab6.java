public class lab6 {
     public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1,4);
        Fraction fraction2 = new Fraction(3,5);

        fraction1.add(fraction2);
        System.out.println("Addition on fraction1 : "+fraction1);

        Fraction fraction3 = new Fraction(2,8);

        fraction1.sub(fraction3);
        System.out.println("Subtraction on fraction1 : "+fraction1);


        Fraction fraction4 = new Fraction(3,4);

        fraction1.multiplication(fraction4);
        System.out.println("Multiplication on fraction1 : "+fraction1);


        Fraction fraction5 = new Fraction(7,9);

        fraction1.division(fraction5);
        System.out.println("Division on fraction1 : "+fraction1);

    }
}

class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		return "" + numerator + "/" + denominator;
	}

	public void add(Fraction fraction) {

		int num = this.getNumerator() * fraction.getDenominator() + this.getDenominator() * fraction.getNumerator();
		int deno = this.getDenominator() * fraction.getDenominator();
                
		this.setNumerator(num);
		this.setDenominator(deno);
	}

	public void sub(Fraction fraction) {
		int num = this.getNumerator() * fraction.getDenominator() - this.getDenominator() * fraction.getNumerator();
		int deno = this.getDenominator() * fraction.getDenominator();

		this.setNumerator(num);
		this.setDenominator(deno);
	}

	public void multiplication(Fraction fraction) {
		int num = this.getNumerator() * fraction.getNumerator();
		int deno = this.getDenominator() * fraction.getDenominator();

		this.setNumerator(num);
		this.setDenominator(deno);
	}

	public void division(Fraction fraction) {

		int num = this.getNumerator() * fraction.getDenominator();
		int deno = this.getDenominator() * fraction.getNumerator();

		this.setNumerator(num);
		this.setDenominator(deno);
	}
}