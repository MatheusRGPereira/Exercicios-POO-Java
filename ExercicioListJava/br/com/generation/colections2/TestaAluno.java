package br.com.generation.colections2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<Aluno> alunos = new ArrayList<>();

		System.out.println("Quantos alunos voce deseja adicionar?");
		int numeroAlunos = leia.nextInt();
		leia.nextLine();

		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Idade do aluno");
			int idade= leia.nextInt();
			leia.nextLine();
			
			System.out.println("Nome do alune");
			String nome = leia.nextLine();
			
			alunos.add(new Aluno(nome,idade));
			

		}
		System.out.print(alunos);
	}

}
