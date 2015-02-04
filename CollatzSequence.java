
public class CollatzSequence {
	public static void main(String[] args)
	{
		int start = 200000;
		int count = 1;
		int tempCount = 1;
		int num = start;
		int identity = start;
		while(start > 77030)
		{
			if(num == 1)
			{
				if(tempCount > count)
				{
					count = tempCount;
					identity = start;
				}
				tempCount = 1;
				start--;
				num = start;
			}
			if(num % 2 == 0)
			{
				num = num/2;
				tempCount++;
			}
			else if(num % 2 == 1)
			{
				num = 3*num + 1;
				tempCount++;
			}
			
		}
		System.out.println(identity);
	}

}
