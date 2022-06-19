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
	}

}
