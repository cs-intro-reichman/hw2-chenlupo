// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int steps = Integer.parseInt(args[0]);

	   
		int count = 1;
		

       if(args[1].equals("v")){
		for(int i = 1; i < steps+1; i++){
           int j = i;
		   System.out.print(i);
		do{
			if(j% 2 == 0){
				j = j/2;
				System.out.print("," + j);
				count++;
			}else{
				j = j*3 + 1;
				System.out.print("," + j);
				count++;
			}
		}while(j != 1);
		System.out.print("(" + count + ")");
		System.out.println("");
	}
	System.out.println("Every one of the first " + steps + " hailstone sequences reached 1.");
}else{
	for(int i = 1; i < steps+1; i++){
		int j = i;
		do{
			if(j% 2 == 0){
				j = j/2;
				count++;
			}else{
				j = j*3 + 1;
				count++;
			}
		}while(j != 1);
}
System.out.println("Every one of the first " + steps + " hailstone sequences reached 1.");
  }
}
}
