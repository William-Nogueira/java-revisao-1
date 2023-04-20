import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		int[] idadeArr = new int[100];
		String[] opiniaoArr = new String[100];
		String opiniao;
		int idade;
		int somaIdadesRuim = 0;
		int contadorOtimo = 0;
		double contadorBom = 0;
		double contadorRegular = 0;
		int contadorRuim = 0;
		double contadorPessimo = 0;
		int maiorIdadePessimo = 0;
		int maiorIdadeOtimo = 0;
		int maiorIdadeRuim = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < idadeArr.length; i++) {
			System.out.println("Qual sua idade? ");
			idade = scan.nextInt();
			idadeArr[i] = idade;

			System.out.println("Qual sua opiniao em relacao ao filme? ");
			System.out.println("Otimo = O | Bom = B | Regular = R | Ruim = RR | Pessimo = P");
			opiniao = scan.next();
			opiniaoArr[i] = opiniao;

			if (opiniaoArr[i].equalsIgnoreCase("O")) {
				contadorOtimo++;
				if (idadeArr[i] > maiorIdadeOtimo) {
					maiorIdadeOtimo = idadeArr[i];
				}

			} else if (opiniaoArr[i].equalsIgnoreCase("B")) {
				contadorBom++;

			} else if (opiniaoArr[i].equalsIgnoreCase("R")) {
				contadorRegular++;

			} else if (opiniaoArr[i].equalsIgnoreCase("RR")) {
				contadorRuim++;
				somaIdadesRuim += idadeArr[i];
				if (idadeArr[i] > maiorIdadeRuim) {
					maiorIdadeRuim = idadeArr[i];
				}

			} else if (opiniaoArr[i].equalsIgnoreCase("P")) {
				contadorPessimo++;
				if (idadeArr[i] > maiorIdadePessimo) {
					maiorIdadePessimo = idadeArr[i];
				}
			}
		}

		double porcentagemPessimo = (contadorPessimo / idadeArr.length) * 100;
		double diferencaBomRegular = Math.abs(((contadorBom / idadeArr.length) - (contadorRegular / idadeArr.length)));
		int diferencaOtimoRuim = Math.abs((maiorIdadeOtimo - maiorIdadeRuim));
		
		System.out.println("A quantidade de pessoas que responderam Otimo foi: " + contadorOtimo);
		System.out.println("A diferenca percentual entre respostas Bom e Regular e de: " + (diferencaBomRegular * 100) + "%");
		System.out.println("A media de idade de pessoas que responderam Ruim e de: " + (somaIdadesRuim / contadorRuim));
		System.out.println("O Percentual de respostas Pessimo foi de: " + porcentagemPessimo + "%");
		System.out.println("A maior idade das pessoas que responderam Pessimo foi: " + maiorIdadePessimo);
		System.out.println("A diferenca entre a maior idade que respondeu otimo e a maior idade que respondeu ruim foi: " + diferencaOtimoRuim);

		scan.close();
	}

}
