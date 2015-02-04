import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class BigSum {
	public static void main(String[] args)
	{
		File file = new File("C:/Users/Max/Documents/Workspace/Multiple3and5/src/bigSum.txt");
		ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
		 try {
		        Scanner scan = new Scanner(file);

		        while (scan.hasNextLine()) 
		        {
		            numbers.add(new BigInteger(scan.next()));
		        }
		        scan.close();
		    } 
		    catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
		 BigInteger total = BigInteger.ZERO;
		 System.out.println(numbers.size());
		 for(BigInteger i:numbers)
		 {
			 total = total.add(i);
		 }
		 System.out.println(total);
	}

}
