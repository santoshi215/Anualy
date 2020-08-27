package basic;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle=34000;
		int time=5;
		int roi=10;
		System.out.println("Principle amount is:"+principle);
		System.out.println("time period is:"+time);
		System.out.println("roi  is:"+roi);
		
		
		int princeamount = ((principle*time*roi)/100);
		
		System.out.println("simple interest is :" +(princeamount));
		
		
		

	}

}
