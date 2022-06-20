package objectoriented;

public class ObjectFactory {

	public static void main(String[] args) {
		Pen firstPen = new Pen();
		firstPen.color = "Kýrmýzý";
		firstPen.height = 12;
		
		String message = "Ýlk Kalem üretildi";
		
		firstPen.writeMessage(message);
		
		Pen secondPen = new Pen();
		secondPen.color = "Pembe";
		secondPen.height = 15;
		secondPen.writeMessage(secondPen.color + " " + secondPen.height);
		
		
		//Inheritance
		
		Car car = new Car();
		car.numberOfSeats = 5;
		car.numberOfWheels = 4;
		
		Bicycle bicycle = new Bicycle();
		bicycle.numberOfSeats = 1;
		bicycle.numberOfWheels = 2;
		
		//Bu þekilde Vehicle class ýndaki özellikleri Car ve Bicycle içinde de kullanabildik
		//Bu þekilde kod tekrarýndan sakýnmýþ oldum.
		
		//Superclass örnek
		Vehicle car2 = new Car();
		
	}

}
