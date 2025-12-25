public class Fraction {
    private final int numerator;
    private final int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator > 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("denominator must be positive");
        }

    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int sumNum = this.numerator * other.denominator + other.numerator * this.denominator;
        int sumDen = this.denominator * other.denominator;
        return new Fraction(sumNum, sumDen);
    }

    public Fraction sum(int otherInt) {
        int sumNum = this.numerator + otherInt * this.denominator;
        return new Fraction(sumNum, this.denominator);
    }

    public Fraction minus(Fraction other) {
        int minusNum = this.numerator * other.denominator - other.numerator * this.denominator;
        int minusDen = this.denominator * other.denominator;
        return new Fraction(minusNum, minusDen);
    }

    public Fraction minus(int otherInt) {
        int minusNum = this.numerator - otherInt * this.denominator;
        return new Fraction(minusNum, this.denominator);
    }

}
