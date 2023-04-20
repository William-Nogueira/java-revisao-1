import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
			
		char pergunta1;
		char pergunta2;
		char pergunta3;
		char pergunta4;
		char pergunta5;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda s ou n para as perguntas");
		
		System.out.print("Telefonou para a vitima? ");
		pergunta1 = scan.next().charAt(0);
		
		if (pergunta1 == 's') {
			contador++;
		}
		
		System.out.print("Esteve no local do crime? ");
		pergunta2 = scan.next().charAt(0);

		if (pergunta2 == 's') {
			contador++;
		}
		
		System.out.print("Mora perto da vitima? ");
		pergunta3 = scan.next().charAt(0);
		
		if (pergunta3 == 's') {
			contador++;
		}
		
		System.out.print("Devia para vitima? ");
		pergunta4 = scan.next().charAt(0);
		
		if (pergunta4 == 's') {
			contador++;
		}
		
		System.out.print("Ja trabalhou com a vitima? ");
		pergunta5 = scan.next().charAt(0);
		
		if (pergunta5 == 's') {
			contador++;
		}
		
		System.out.println(" ");
		
		if (contador <= 2) {
			System.out.println("A pessoa e suspeita");
		} else if (contador >= 3 && contador <= 4) {
			System.out.println("A pessoa e cumplice");
		} else if (contador == 5) {
			System.out.println("A pessoa e o assassino");
		} else {
			System.out.println("A pessoa e inocente");
		}
		
		scan.close();
		
	}

}
