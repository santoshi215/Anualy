package basic;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int number;
       @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       
       
       System.out.println("Enter the number:");
       number=sc.nextInt();
       
       
       if(number%2==0)
       {
    	   System.out.println("the numer is even:");
       }
       else
       {
    	   System.out.println("the numer is odd:");
       }
       
       
       
    	   
       
       
      


	}

}
