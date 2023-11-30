package repeticoes;

public class ForExercicio01 {
public static void main(String[] args) {
	for(int i = 0; i < 10; i = i + 1) {
	System.out.println("Ola!");
	
		}
	
	int x = 0;
	int y = 0;
	
	for (int i = x; i < y; i++ )
	if (i % 19 == 0) {
		System.out.println("Achei um numero divisivel por 19 entre x e y");
		break;
	}
}
}
