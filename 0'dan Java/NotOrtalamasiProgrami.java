import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {
		int quiz, vize, finall;
		double ortalama;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("quiz notunuzu giriniz: ");
		quiz = scanner.nextInt();
		System.out.println("vize notunuzu giriniz: ");
		vize = scanner.nextInt();
		System.out.println("final notunuzu giriniz: ");
		finall = scanner.nextInt();
		
		ortalama = ((quiz * 0.3) + (vize * 0.3) + (finall * 0.4));
		System.out.println("Not Ortalaman�z " + ortalama);
		
		if (ortalama < 45 ) {
			System.out.println("Kald�n�z");
		}else{
			System.out.println("Ge�tiniz");
		}
		
		
	}
}
