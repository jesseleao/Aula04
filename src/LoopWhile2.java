import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade, i = 1;
		double media = 0;

		while (i <= 5) {
			System.out.println("Informe a idade do " + i + " aluno");
			idade = leitor.nextInt();
			media = media + idade;
			i += 1;
			// ou i = i + 1
			// ou i ++
		}

		media = media / 5.0;

		System.out.println("A média das idades é " + media);

		leitor.close();
	}

}
