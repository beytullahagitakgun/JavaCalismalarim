package objectoriented;

public class ObjectFactory {

	public static void main(String[] args) {
		Pen firstPen = new Pen();
		firstPen.color = "K�rm�z�";
		firstPen.height = 12;
		
		String message = "�lk Kalem �retildi";
		
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
		
		//Bu �ekilde Vehicle class �ndaki �zellikleri Car ve Bicycle i�inde de kullanabildik
		//Bu �ekilde kod tekrar�ndan sak�nm�� oldum.
		
		//Superclass �rnek
		Vehicle car2 = new Car();
		
	}

}
