 package ex;

import java.io.IOException;
import java.util.Scanner;

public class DemoException {
	
	public static void main(String[] args)
	{
		int k = 0;
		int a[] = new int[4];
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		try
		{
			k = i/j;
			for(int c=0;c<=5;c++)
			{
				a[c] = c+1;
			}
			for(int value :a)
			{
				System.out.println(value);
			}
			
		}
		
		/*
		 * catch(IOException e ) { System.out.println("some IO Error");
		 * 
		 * }
		 */
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by Zero");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum number of value is 4:");
			
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception: ");
			
		}
		finally
		{
			System.out.println("Finally output");
		}
		
		System.out.println(k);
		
	}
	
	

}
