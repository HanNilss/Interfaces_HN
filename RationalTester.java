//********************************************************************
//  RationalTester.java       Java Foundations
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************

public class RationalTester
{
    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r3, r4, r5, r6, r7;

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);
        
        RationalNumber r8 = new RationalNumber(10,2);
        RationalNumber r9 = new RationalNumber(10,2);
        
        if (r8.compareTo(r9) == 0) {
        	System.out.println("Equal");
        }
        else if (r8.compareTo(r9) > 0) {
        	System.out.println("r8 is larger than r9");
        }
        else if (r8.compareTo(r9) < 0) {
        	System.out.println("r9 is larger than r8");
        }

        RationalNumber r10 = new RationalNumber(12,2);
        RationalNumber r11 = new RationalNumber(11,2);
        
        if (r10.compareTo(r11) == 0) {
        	System.out.println("Equal");
        }
        else if (r10.compareTo(r11) > 0) {
        	System.out.println("r10 is larger than r11");
        }
        else if (r10.compareTo(r11) < 0) {
        	System.out.println("r11 is larger than r10");
        }
        
        RationalNumber r12 = new RationalNumber(5,2);
        RationalNumber r13 = new RationalNumber(6,2);
        
        if (r12.compareTo(r13) == 0) {
        	System.out.println("Equal");
        }
        else if (r12.compareTo(r13) > 0) {
        	System.out.println("r12 is larger than r13");
        }
        else if (r12.compareTo(r13) < 0) {
        	System.out.println("r13 is larger than r12");
        }
        
        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);
    }
}
