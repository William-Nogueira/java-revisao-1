import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		double produto1;
		double produto2;
		double produto3;

		Scanner scan = new Scanner(System.in);

		System.out.print("Qual o preco do primeiro produto? ");
		produto1 = scan.nextDouble();

		System.out.print("Qual o preco do segundo produto? ");
		produto2 = scan.nextDouble();

		System.out.print("Qual o preco do terceiro produto? ");
		produto3 = scan.nextDouble();

		if (produto1 < produto2 && produto1 < produto3) {
			System.out.print("Voce deve escolher o produto 1");

		} else if (produto2 < produto3) {
			System.out.print("Voce deve escolher o produto 2");

		} else {
			System.out.print("Voce deve escolher o produto 3");
		}

		scan.close();
	}

}
