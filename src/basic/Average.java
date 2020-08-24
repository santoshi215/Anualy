package basic;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physics=89;
		int chemistry=92;
		int maths=92;
		int bio=75;
		int english=63;
		int computer=92;
		
		int sum = (physics+chemistry+maths+bio+english+computer);
		
		System.out.println("total numbers scored in all subjects is:" +sum);
		System.out.println("average of all subjects is:"+(sum/6));
		

	}

}
