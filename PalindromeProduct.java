
public class PalindromeProduct {
	public static void main(String Args[])
	{
		int max = Integer.MIN_VALUE;
		for(int i = 100; i <= 999; i++)
		{
			for(int j = 100; j <= 999; j++)
			{
				int product = i * j;
				String p = Integer.toString(product);
				boolean palindrome = false;
				while(p.length() > 0)
				{
						if(p.length() == 2 && p.substring(0, 1).equals(p.substring(1,2)))
						{
							palindrome = true;
							p="";
						}
						else if (p.length() == 1)
						{
							palindrome = true;
							p="";
						}
						else if(p.substring(0,1).equals(p.substring(p.length()-1)))
						{	
							p = p.substring(1,p.length()-1);
						}
						else
						{
							p = "";
							palindrome = false;
						}
				}
				if(product > max && palindrome)
				{
					max = product;
				}
			}
		}
		System.out.println(max);
	}

}
