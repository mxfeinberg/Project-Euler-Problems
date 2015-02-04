
public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		int count = 0;
		int start = 50;
		while(count < 501)
		{
			count = 0;
			int p = getTriangularNumber(start);
			for(int i = 1; i <= (int)Math.sqrt(p); i++)
			{
				if(p % i == 0)
					count = count + 2;
				if(count >= 501)
					break;
			}

			if(count < 501)
				start++;
		}
		System.out.println(getTriangularNumber(start));

	}
	
	public static int getTriangularNumber(int n)
	{
		int m = 0;
		for(int i = 1; i <=n; i++)
		{
			m+=i;
		}
		return m;
	}
}
