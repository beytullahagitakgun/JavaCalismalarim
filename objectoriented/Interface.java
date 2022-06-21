package objectoriented;

public class Interface {
	
	public interface Polygon{
		void getArea(int lenght, int breadth);
	}
	
	//Polygon implement yapalým 
	
	public static class Rectangle implements Polygon{
		public void getArea(int lenght, int breadth) {
			System.out.println("The area of rectangle is " + (lenght * breadth));	
		}	
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.getArea(12, 5);
	}

}
