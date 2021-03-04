import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual é a melhor forma de
		 * calcular essa média?
		 */
		Scanner leitor = new Scanner(System.in);
		
		int idade, i = 1, ONG;
		double media = 0;
		
		System.out.println("Quantos alunos deseja cadastrar?");
		ONG = leitor.nextInt();
		
		while (i <= ONG) {
			System.out.println("Informe a idade do " + i + " aluno");
			idade = leitor.nextInt();
			media = media + idade;
			i += 1;
		}

		media = media / (double)ONG;

		System.out.println("A média das idades é " + media);

		leitor.close();
	}

}
