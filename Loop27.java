public class Loop27 {

	public static void main(String[] args) {
		
		 Loop27 objswap = new Loop27();
		    objswap.two_var_swap();
	}

	private void two_var_swap() {
		
		int p1=48,p2=67,temp;
		{
		temp=p1;
		p1=p2;
		p2=temp;
		System.out.println("p1 is "+p1);
		System.out.println("p2 is "+p2);	
		}
	}

}
