import java.util.Scanner;

public class SwitchCaseCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hesaplamak istediðini iki sayýyý giriniz: ");
		int sayýBir = scanner.nextInt();
		int sayiIki= scanner.nextInt();
		int sonuc;
		System.out.println("Hangi iþlemi yapmak istersiniz ? (*, /, +, -") ;
		char iþlem = scanner.next().charAt(0);
		
		switch(iþlem) {
		
		case '+':
			sonuc = sayýBir + sayiIki;
			System.out.println("Toplama Sonucu " + sonuc);
				break;
		case '-':
			sonuc = sayýBir - sayiIki;
			System.out.println("Çýkarma Sonucu " + sonuc);
				break;
		case '*':
			sonuc = sayýBir * sayiIki;
			System.out.println("Çarpma Sonucu "+ sonuc);
				break;
		case '/':
			if(sayiIki == 0)
				System.out.println("Sayý 0'a bölünemez lütfen tekrar deneyin...");
			sonuc = sayýBir / sayiIki;
			System.out.println("Bölme Sonucu " + sonuc);
				break;
				
		default: System.out.println("geçerli bir sayý girmediniz");
		}
		scanner.close();

	}

}
