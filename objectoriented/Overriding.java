package objectoriented;
public class Overriding {
	
	public static class Human{
		public void eat(){
			System.out.println("Human is eating");
		}
	}
	// Burada eat fonksiyonun özelliðini override etmiþ olduk 
	// Not : Buradaki en büyük amacýmýz birden çok subclass ta superclass ýn methodunu deðiþtirmeden subclass ta bu özelliði kendine göre düzenlemek
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
