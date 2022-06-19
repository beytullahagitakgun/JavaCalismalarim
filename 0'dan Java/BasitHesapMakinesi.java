import java.util.Scanner;

public class BasitHesapMakinesi {

	public static void main(String[] args) {
		int x, y, secim;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ýlk Sayýyý Giriniz: ");
		x = scanner.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz: ");
		y = scanner.nextInt();
		System.out.println(" 1. Toplama\n 2. Çýkarma\n 3. Çarpma\n 4. Bölme");
		System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
		secim = scanner.nextInt();
		
		if(secim == 1) {
			System.out.println("Toplam : " + (x + y));
		}else if (secim == 2) {
			System.out.println("Çýkarma : " + (x - y));	
		}else if (secim == 3) {
			System.out.println("Çarpma : " + (x * y));
		}else if(secim == 4) {
			if(y == 0) {
				System.out.println("bir sayý sýfýra bölünemez");
			}
			System.out.println("Bölme : " + (x / y));
		}else{
			System.out.println("Geçersiz bir iþlem seçtiniz");
		}
		
		
		

	}

}
