/*
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
import java.math.BigInteger;
public class FactorialDigitSum {

	public static void main(String[] args) 
	{
		BigInteger b = getFactorial(new BigInteger("100")); 
		String s = b.toString();
		System.out.println(s);
		int total = 0;
		while(s.length() > 0)
		{
			total = total + Integer.decode(s.substring(0,1));
			s = s.substring(1);
		}
		System.out.println(total);
	}
	public static BigInteger getFactorial(BigInteger n)
	{
		if(n.intValue() <= 1)
			return new BigInteger("1");
		else
			return n.multiply(getFactorial(n.subtract(new BigInteger("1"))));
	}

}
