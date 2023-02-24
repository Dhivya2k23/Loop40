public class Loop26 {

	public static void main(String[] args) {
	
    Loop26 objswap = new Loop26();
    objswap.two_var_swap();
	}

	private void two_var_swap() {
		
		int p1=20,p2=40;
		{
			p1=p1+p2;
			p2=p1-p2;
			p1=p1-p2;
			System.out.println("p1 is "+p1);
			System.out.println("p2 is "+p2);
		}
		
	}

}
