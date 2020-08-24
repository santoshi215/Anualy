package basic;

public class Anualyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=500;
		
		System.out.println("Enter the numer of days:"+day);
		
		
		int years = day/365;
		int weeks = ((day%365)/7);
		int dayss = ((day%365)%7);
		
		System.out.println("the numer of years :"+years+"year:"+weeks+"week:"+dayss+"days");
		
		System.out.println("t");
		

	}

}
