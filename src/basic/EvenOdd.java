package basic;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		int i;
		System.out.println("Enter an integer number:");
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
         i=input.nextInt();
         
		if(i%2==0)
		{
		
			System.out.println("even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
			
		
	

}}
