
public class Somapares {



	    public static void main(String[] args) {
	        int i = 0;

	        do {
	            if (i % 10 == 0) {
	                System.out.println(i + " - É múltiplo de 10");
	            } else {
	                System.out.println(i);
	            }
	            i += 2; 
	        } while (i <= 500);
	    }
	}
	