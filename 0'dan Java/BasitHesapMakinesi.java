import java.util.Scanner;

public class BasitHesapMakinesi {

	public static void main(String[] args) {
		int x, y, secim;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�lk Say�y� Giriniz: ");
		x = scanner.nextInt();
		System.out.println("�kinci Say�y� Giriniz: ");
		y = scanner.nextInt();
		System.out.println(" 1. Toplama\n 2. ��karma\n 3. �arpma\n 4. B�lme");
		System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
		secim = scanner.nextInt();
		
		if(secim == 1) {
			System.out.println("Toplam : " + (x + y));
		}else if (secim == 2) {
			System.out.println("��karma : " + (x - y));	
		}else if (secim == 3) {
			System.out.println("�arpma : " + (x * y));
		}else if(secim == 4) {
			if(y == 0) {
				System.out.println("bir say� s�f�ra b�l�nemez");
			}
			System.out.println("B�lme : " + (x / y));
		}else{
			System.out.println("Ge�ersiz bir i�lem se�tiniz");
		}
		
		
		

	}

}
