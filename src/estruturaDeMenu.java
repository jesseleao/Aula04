import java.util.Scanner;

public class estruturaDeMenu {
	
	public static void main (String[] args) {
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		
		while(opcao != 4) {
			System.out.println("Escolha uma das op��es a seguir:");
			System.out.println("1 - Op��o A");
			System.out.println("2 - Op��o B");
			System.out.println("3 - Op��o C");
			System.out.println("4 - Sair");
			System.out.println("Digite a op��o desejada!");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Voc� escolheu a op��o A");
				break;
			case 2:
				System.out.println("Voc� escolheu a op��o B");
				break;
			case 3:
				System.out.println("Voc� escolheu a op��o C");
				break;
			}
		}
	}
}
