
public class SumSquareDifference {
	public static void main(String args[])
	{
		long sum = 101 * 50;
		sum = (long)Math.pow(sum, 2.0);
		System.out.println(sum + "\n");
		long product = 0;
		for(int j = 1; j <= 100; j++)
		{
			product+=(long)(Math.pow(j, 2.0));
		}
		System.out.println(product + "\n");
		System.out.println(sum-product);
	}
}
