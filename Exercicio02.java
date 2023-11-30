package repeticoes;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int alunos = input.nextInt();
		int alu = 1;
		double soma = 0;
		
		while (alu < alunos) {
			System.out.println("Digite a nota do aluno: " );
			double nota = input.nextDouble();
			soma = soma + nota;
			alu++;
			
			double media = soma / alunos;
			System.out.println("A media dos alunos e: " + media);

		
		}
	}
}