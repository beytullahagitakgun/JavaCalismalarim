import java.util.Scanner;

public class DaireAlanHacimHesaplama {

	public static void main(String[] args) {
		double alan, hacim, pi = 3.14;
		int r;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen Diare yar��ap�n� giriniz : \n");
		r = scanner.nextInt();
		alan = 2 * pi * r;
		hacim = (pi * (r * r));
		System.out.println("Dairenin alan� : " + alan);
		System.out.println("Dairenin Hacmi : " + hacim);

	}

}
