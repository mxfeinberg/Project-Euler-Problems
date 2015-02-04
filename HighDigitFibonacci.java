import java.math.BigInteger;

public class HighDigitFibonacci {

	public static void main(String[] args) {
		BigInteger count = new BigInteger("12");
		BigInteger num = new BigInteger("144");
		while(num.toString().length() < 10)
		{
			num = getFib(count);
			count = count.add(new BigInteger("1"));
		}
		System.out.println(num.toString().length());
		System.out.println(count);

	}
	public static BigInteger getFib(BigInteger n)
	{
		if(n.toString().equals("0"))
			return new BigInteger("0");
		else if(n.toString().equals("1"))
			return new BigInteger("1");
		else 
			return getFib(n.subtract(new BigInteger("1"))).add(getFib(n.subtract(new BigInteger("2"))));
	}
}
