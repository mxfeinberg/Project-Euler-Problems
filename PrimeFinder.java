
public class PrimeFinder {

	public static void main(String[] args) {
		int[] primes = new int[10001];
		primes[0]=2;
		int j = 1;
		int i = 3;
		while(primes[10000] == 0)
		{
			if(isPrime(i))
			{
				primes[j]=i;
				i++;
				j++;
			}
			else
				i++;
		}
		System.out.println(primes[10000]);

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
