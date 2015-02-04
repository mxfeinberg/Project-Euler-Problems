
public class LPF {
	public static void main (String Args[])
	{
		long n = 600851475143L;
		System.out.println(factor(n));
	}
	public static int factor(long n)
	{
		long z = 2;
		while(z * z <= n)
		{
			if(n%z == 0)
			{
				n=n/z;
				z=2;
			}
			else
				z++;
		}
			return (int) n;
	}

}
