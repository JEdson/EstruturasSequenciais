import java.util.Scanner;


public class Pitagoras03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C1, C2, H;
		System.out.print("Medida de um cateto (cm)? ");
		Scanner LerS = new Scanner(System.in);
		C1 = LerS.nextDouble();
		System.out.print("Medida do outro cateto (cm)? ");
		C2 = LerS.nextDouble();
		H=Math.sqrt(Math.pow(C1, 2)+Math.pow(C2, 2));
		System.out.printf(String.format("Hipotenusa=%4.1f cm", H));
		
	}

}
