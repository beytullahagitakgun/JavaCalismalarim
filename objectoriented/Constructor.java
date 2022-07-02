package objectoriented;

public class Constructor {
	int modelYili;
	String modelIsmi;
	
	public Constructor(int yil, String isim) {
		modelIsmi = isim;
		modelYili = yil;
	}

	public static void main(String[] args) {
		Constructor deneme = new Constructor(1969, "Mustang");
		System.out.println(deneme.modelIsmi+" "+deneme.modelYili);
		

	}
}
