//********************************************************************
//  RationalNumber.java       Java Foundations
//
//  Represents one rational number with a numerator and denominator.
//********************************************************************

public class RationalNumber implements Comparable<RationalNumber>
{
    private int numerator, denominator;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(int numer, int denom)
    {
        if (denom == 0)
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0)
        {
            numer = numer * -1;
            denom = denom * -1;
        }

        numerator = numer;
        denominator = denom;

        reduce();
    }

    //-----------------------------------------------------------------
    //  Returns the numerator of this rational number.
    //-----------------------------------------------------------------
    public int getNumerator()
    {
        return numerator;
    }

    //-----------------------------------------------------------------
    //  Returns the denominator of this rational number.
    //-----------------------------------------------------------------
    public int getDenominator()
    {
        return denominator;
    }

    //-----------------------------------------------------------------
    //  Returns the reciprocal of this rational number.
    //-----------------------------------------------------------------
    public RationalNumber reciprocal()
    {
        return new RationalNumber(denominator, numerator);
    }

    //-----------------------------------------------------------------
    //  Adds this rational number to the one passed as a parameter.
    //  A common denominator is found by multiplying the individual
    //  denominators.
    //-----------------------------------------------------------------
    public RationalNumber add(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Subtracts the rational number passed as a parameter from this
    //  rational number.
    //-----------------------------------------------------------------
    public RationalNumber subtract(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Multiplies this rational number by the one passed as a
    //  parameter.
    //-----------------------------------------------------------------
    public RationalNumber multiply(RationalNumber op2)
    {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    }

    //-----------------------------------------------------------------
    //  Divides this rational number by the one passed as a parameter
    //  by multiplying by the reciprocal of the second rational.
    //-----------------------------------------------------------------
    public RationalNumber divide(RationalNumber op2)
    {
        return multiply(op2.reciprocal());
    }

    //-----------------------------------------------------------------
    //  Determines if this rational number is equal to the one passed
    //  as a parameter. Assumes they are both reduced.
    //-----------------------------------------------------------------
    public boolean isLike(RationalNumber op2)
    {
        return (numerator == op2.getNumerator() &&
                denominator == op2.getDenominator());
    }
    
    //-----------------------------------------------------------------
    //  Compares current object with object passed as a parameter.
    //	If current object and parameter object is equal, return 0.
    //	If current object is larger than parameter, return 1.
    //	If current object is smaller than parameter, return 2.
    //-----------------------------------------------------------------
    @Override
    public int compareTo(RationalNumber r2) {
    	int r;
    	double val1 = (double)this.getNumerator()/this.getDenominator();
    	double val2 = (double)r2.getNumerator()/r2.getDenominator();
    	if ((val1-val2)<0.0001 && (val1-val2)>0) {
    		r = 0;
    	}
    	else if (val1 > val2) {
    		r = 1;
    	}
    	else if (val1 < val2) {
    		r = -1;
    	}
    	else {
    		r = 0;
    	}
    	
    	return r;
    }
    
    //-----------------------------------------------------------------
    //  Returns this rational number as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;
        
        if (numerator == 0)
            result = "0";
        else
            if (denominator == 1)
                result = numerator + "";
            else
                result = numerator + "/" + denominator;
        
        return result;
    }

    //-----------------------------------------------------------------
    //  Reduces this rational number by dividing both the numerator
    //  and the denominator by their greatest common divisor.
    //-----------------------------------------------------------------
    private void reduce()
    {
        if (numerator != 0)
        {
            int common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        }
    }

    //-----------------------------------------------------------------
    //  Computes and returns the greatest common divisor of the two
    //  positive parameters. Uses Euclid's algorithm.
    //-----------------------------------------------------------------
    private int gcd(int num1, int num2)
    {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num1;
    }

}
