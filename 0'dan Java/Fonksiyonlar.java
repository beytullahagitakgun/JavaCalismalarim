import java.util.Scanner;

public class Fonksiyonlar {

	public static void main(String[] args) {
		System.out.println(merhaba("Beytullah"));
		System.out.println(yaþBul());
		
		
	}
	
	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}
	
	public static String yaþBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç Yýlýnda Doðdunuz : ");
		int dogumYili = scanner.nextInt();
		int yaþ1 = 2022 - dogumYili;
		return yaþ1 + " Yaþýndasýnýz";
	}

}
