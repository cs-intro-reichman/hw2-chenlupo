// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int benchmark = Integer.parseInt(args[0]);

		double result = 1;
		 int denom = 3;
		 
		
		for (int i = 0; i < benchmark-1 ;i ++) {
			
			if(i % 2 == 0 ){
				result-= (double)1/(denom);
			}else{
				result+= (double)1/(denom);
			}
			denom+= 2;
			
		}
		System.out.println("pi according to Java: " + Math.PI) ;
		System.out.println("pi, approximated:     " + 4*(result));
	}
}
