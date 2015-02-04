
public class SpecialPythagoreanTriples {
	public static void main(String[] args)
	{
		int a = 7;
		int b = 24;
		int c = 25;
		while(a + b + c != 1000)
		{
			for(int m = 2; m <= 25; m++)
			{
		    for (int n = 1; n < m; n ++)
		    {
			a = (int)Math.pow(m, 2) - (int)Math.pow(n, 2);
			b = 2 * m * n;
			c = (int)Math.pow(m, 2) + (int)Math.pow(n, 2);
			if(a+b+c == 1000)
				break;
		    }
		    if(a+b+c == 1000)
				break;
			}
		}
		System.out.println(a + b + c + "\n");
		System.out.println(a * b * c);
	}
}
