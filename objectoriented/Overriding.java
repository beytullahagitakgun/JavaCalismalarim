package objectoriented;
public class Overriding {
	
	public static class Human{
		public void eat(){
			System.out.println("Human is eating");
		}
	}
	// Burada eat fonksiyonun �zelli�ini override etmi� olduk 
	// Not : Buradaki en b�y�k amac�m�z birden �ok subclass ta superclass �n methodunu de�i�tirmeden subclass ta bu �zelli�i kendine g�re d�zenlemek
	public static class Boy extends Human{
		public void eat() {
			System.out.println("Boy is eating");
		}
	}

	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.eat();

	}

}
