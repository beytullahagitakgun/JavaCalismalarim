import java.util.Scanner;

public class KDVHesaplamaProgrami {

	public static void main(String[] args) {
		double kdv  = 0.18;
		double kdvliFiyat, kdvsizFiyat, urunFiyati, kdvtutari;
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen �r�n�n�z�n fiyat�n� giriniz : ");
		urunFiyati = scanner.nextDouble();
		kdvliFiyat = (urunFiyati + (urunFiyati * kdv));
		kdvsizFiyat = (urunFiyati - (urunFiyati * kdv));
		kdvtutari = (urunFiyati * kdv);
		
		System.out.println("�r�n�n Fiyat� " + urunFiyati);
		System.out.println("Kdv Tutar� " + kdvtutari);
		System.out.println("�r�n�n kdvli Fiyat� " + kdvliFiyat);
		System.out.println("�r�n�n Kdvsiz Fiyat� " + kdvsizFiyat);

	}

}
