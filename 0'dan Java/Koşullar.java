import java.util.Scanner;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Ko�ullar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�sminiz nedir ? ");
		String isim = scanner.next();
		System.out.println("Merhaba, " + isim);
		System.out.println("L�tfen Ya��n�z� Giriniz : ");
		int ya� = scanner.nextInt();
		System.out.println("�ansl� Say�n�z : ");
		
		int harfSay�s� = isim.length();
		
		int �ansl�Say� = 0;
		
		if(ya� < 15) {
			�ansl�Say� = (harfSay�s� * ya�) % 10;
		}else if(ya� < 20){
			�ansl�Say� = (ya� * ya� - harfSay�s�) % 10;	
		}else if(ya� < 60){
			�ansl�Say� = (harfSay�s� + ya�) % 10;	
		}else {
			�ansl�Say� = (harfSay�s� * 5 - ya�) % 10;
		}
		if(�ansl�Say� < 0) {
			�ansl�Say� = -1 * �ansl�Say�;
		}
		System.out.println(�ansl�Say�);

	}

}
