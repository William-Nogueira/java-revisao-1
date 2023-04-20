import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		int senha;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Informe a senha: ");
			senha = scan.nextInt();
			contador++;
			if (senha == 1234) {
				System.out.println("Acesso Permitido");
				System.out.println("A senha foi informada: " + contador + " vezes.");
				break;
			} else {
				System.out.println("Acesso Negado");
			}
		}
		
		scan.close();
	}

}
