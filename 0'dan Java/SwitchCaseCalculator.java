import java.util.Scanner;

public class SwitchCaseCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hesaplamak istedi�ini iki say�y� giriniz: ");
		int say�Bir = scanner.nextInt();
		int sayiIki= scanner.nextInt();
		int sonuc;
		System.out.println("Hangi i�lemi yapmak istersiniz ? (*, /, +, -") ;
		char i�lem = scanner.next().charAt(0);
		
		switch(i�lem) {
		
		case '+':
			sonuc = say�Bir + sayiIki;
			System.out.println("Toplama Sonucu " + sonuc);
				break;
		case '-':
			sonuc = say�Bir - sayiIki;
			System.out.println("��karma Sonucu " + sonuc);
				break;
		case '*':
			sonuc = say�Bir * sayiIki;
			System.out.println("�arpma Sonucu "+ sonuc);
				break;
		case '/':
			if(sayiIki == 0)
				System.out.println("Say� 0'a b�l�nemez l�tfen tekrar deneyin...");
			sonuc = say�Bir / sayiIki;
			System.out.println("B�lme Sonucu " + sonuc);
				break;
				
		default: System.out.println("ge�erli bir say� girmediniz");
		}
		scanner.close();

	}

}
