package basic;

public class Compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double r=0.08;
       int t=5,p=2000,n=12;
       
       double amount =p*Math.pow((1+r/n),(n*t));
       double compoundi = amount-p;
       
       System.out.println("The compound interest annualy is:$"+compoundi);
	}

}
