import java.util.ArrayList;
public class SumPrimes {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int j = 1;
		int i = 3;
		long sum = 0;
		sum+=2;
		while(i <= 2e6)
		{
			if(isPrime(i))
			{
				sum+=i;
				primes.add(i);
				i++;
				j++;
			}
			else
				i++;
		}
		System.out.println(sum);

	}
	public static boolean isPrime(int n)
	{
		if(n %2 == 0)
			return false;
		for(int i = 3; i <= Math.sqrt(n); i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
