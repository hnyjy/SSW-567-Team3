package test;

import java.io.*;
import junit.framework.TestCase;

public class TestCalcuator extends TestCase {
	public void test() throws IOException{
		Test1 test= new Test1();
		BufferedReader a = new BufferedReader(new FileReader("/Users/yangjingyi/Desktop/P02(Jingyi Yang)/P01(test).txt"));
		String number;
		while((number = a.readLine())!=null
		{
			String[] numbers = number.split(" ");
			String result = test.checknumber(numbers);
			assertEquals("The data contains other character.\n"+"The data contains english alphabet.\n"+"The data start with 0!\n"+"depth at the deep end is 859 feet.\n",result);
		}
	}
}


