import java.util.Scanner;

public class KDVHesaplamaProgrami {

	public static void main(String[] args) {
		double kdv  = 0.18;
		double kdvliFiyat, kdvsizFiyat, urunFiyati, kdvtutari;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ürününüzün fiyatýný giriniz : ");
		urunFiyati = scanner.nextDouble();
		kdvliFiyat = (urunFiyati + (urunFiyati * kdv));
		kdvsizFiyat = (urunFiyati - (urunFiyati * kdv));
		kdvtutari = (urunFiyati * kdv);
		
		System.out.println("Ürünün Fiyatý " + urunFiyati);
		System.out.println("Kdv Tutarý " + kdvtutari);
		System.out.println("Ürünün kdvli Fiyatý " + kdvliFiyat);
		System.out.println("Ürünün Kdvsiz Fiyatý " + kdvsizFiyat);

	}

}
