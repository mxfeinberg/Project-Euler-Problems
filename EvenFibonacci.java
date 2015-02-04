
public class EvenFibonacci {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(fib(i) <= 4e6)
		{
			int a = fib(i);
			if(a % 2 == 0)
				sum+=fib(i);
			i++;
		}
		System.out.println(sum);
	}
	public static int fib(int n)
	{
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
}

