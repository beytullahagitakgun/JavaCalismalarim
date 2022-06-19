
public class Donguler {

	public static void main(String[] args) {
		
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		int sayi = 5;
		while(sayi <= 15) {
			System.out.println(sayi);
			sayi += 1;
		}
		

	//iç içe for döngüsü

	for(int i=0; i<5; i++) {
		for(int j=5; j>i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
