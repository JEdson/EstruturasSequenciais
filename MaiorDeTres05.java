import java.util.Scanner;


public class MaiorDeTres05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o primeiro numero: ");
		Scanner LerS = new Scanner(System.in);
		double A = LerS.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double B = LerS.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		double C = LerS.nextDouble();
		double Maior;
		if (A>B)
			 if(A>C)
				 Maior = A;
			 else Maior = C;
		if (B>C)
			 Maior = B;
		else
			Maior = C;
		System.out.println(String.format("%3.2f é o maior de %3.2f, %3.2f, %3.2f", Maior, A,B,C));
		
		
		
		
	}

}
