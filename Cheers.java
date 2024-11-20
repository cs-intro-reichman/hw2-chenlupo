// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
           
           String uppercase = args[0].toUpperCase();
           int times = Integer.parseInt(args[1]);
           
           for(int i = 0; i < uppercase.length(); i++){
              char x = uppercase.charAt(i);
                if(x == 'A' || x == 'E' || x == 'F' || x == 'H' || x == 'I' || x == 'L' || x == 'M' || x == 'N' || x == 'O' || x == 'R' || x == 'S' || x == 'X'){
                        System.out.println("Give me an " + x + ": " + x + "!");
                }else{
                        System.out.println("Give me a  " + x + ": " + x + "!");
                }
           }
                
        System.out.println("What does that spell?");
        
        for(int i = 0; i < times ; i++){
                System.out.println(args[0] + "!!!");
           }
         }
        }
