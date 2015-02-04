/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 *	What is the sum of the digits of the number 2^1000?
 */
import java.math.BigInteger;
public class PowerDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		String s = number.toString();
		long total = 0;
		while(s.length() > 0)
		{
			total = total + Integer.decode(s.substring(0, 1));
			s = s.substring(1);
		}
		System.out.println(total);

	}

}
