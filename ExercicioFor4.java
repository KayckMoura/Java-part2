package repeticoes;

public class ExercicioFor4 {

	public static void main(String[] args) {
		 int x = 10;

	        for (; x != 1; ) {
	            System.out.println(x);

	            if (x % 2 == 0) {
	                x = x / 2;
	            } else {
	                x = 3 * x + 1;
	            }
	        }

	        System.out.println(x);

	}

}