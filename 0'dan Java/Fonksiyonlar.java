import java.util.Scanner;

public class Fonksiyonlar {

	public static void main(String[] args) {
		System.out.println(merhaba("Beytullah"));
		System.out.println(ya�Bul());
		
		
	}
	
	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}
	
	public static String ya�Bul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ka� Y�l�nda Do�dunuz : ");
		int dogumYili = scanner.nextInt();
		int ya�1 = 2022 - dogumYili;
		return ya�1 + " Ya��ndas�n�z";
	}

}
