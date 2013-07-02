
public class CapitalCalculado02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double X=1000, I=1, Capacum;
		Capacum=X * Math.pow((1+I/100),2);
		System.out.printf("%5.2f euros capitalizados durante 2 anos à taxa anual de %4.1f %c resultam em %7.2f euros",X, I, '%', Capacum);
		
	}

}
