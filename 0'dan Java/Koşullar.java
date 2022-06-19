import java.util.Scanner;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Koþullar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ýsminiz nedir ? ");
		String isim = scanner.next();
		System.out.println("Merhaba, " + isim);
		System.out.println("Lütfen Yaþýnýzý Giriniz : ");
		int yaþ = scanner.nextInt();
		System.out.println("Þanslý Sayýnýz : ");
		
		int harfSayýsý = isim.length();
		
		int þanslýSayý = 0;
		
		if(yaþ < 15) {
			þanslýSayý = (harfSayýsý * yaþ) % 10;
		}else if(yaþ < 20){
			þanslýSayý = (yaþ * yaþ - harfSayýsý) % 10;	
		}else if(yaþ < 60){
			þanslýSayý = (harfSayýsý + yaþ) % 10;	
		}else {
			þanslýSayý = (harfSayýsý * 5 - yaþ) % 10;
		}
		if(þanslýSayý < 0) {
			þanslýSayý = -1 * þanslýSayý;
		}
		System.out.println(þanslýSayý);

	}

}
