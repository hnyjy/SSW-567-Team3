package test;

//written by Jingyi Yang


import java.util.*;
import java.io.*;

public class Test1 {

	public String checknumber(String[] numbers) throws IOException {

		/*Scanner scan = new Scanner(System.in);
		int number;

		System.out.print("Please input the number:");
		
		while(true)
		{
			try
			{
				number = scan.nextInt();
				break;
			}
			catch( Exception e)
			{
				System.out.print("That's not an integer. Please input again:");
				scan = new Scanner(System.in);
			}
		}*/
		
		/*BufferedReader a = new BufferedReader(new FileReader("/Users/yangjingyi/Desktop/P01/P01(test).txt"));
		String number;*/
		String[] description = {"length", "width", "depth at the shallow end", "depth at the deep end"};
		String testresult = "";
		/*while((number = a.readLine()) != null)
		{
			String[] numbers = number.split(" ");*/
			
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i].matches("^[A-Za-z0-9]+$"))
				{
					if(numbers[i].startsWith("0"))
					{   
						System.out.println("The data start with 0!");
						testresult = testresult+"The data start with 0!\n";
					}
					else
						try
					    {
							int t = Integer.parseInt(numbers[i]);
							System.out.println(description[i]+" is "+t+" feet.");
							testresult=testresult+description[i]+" is "+t+" feet.\n";
					    }
				       catch(Exception e)
				        {
					        System.out.println("The data contains english alphabet.");
					        testresult= testresult+"The data contains english alphabet.\n";
				        }
				}
					else 
					{
						System.out.println("The data contains other character. ");
						testresult = testresult + "The data contains other character.\n";
					}
			}
				return testresult;
	}
	
	public static void main(String[] args) throws IOException {
	}
}
