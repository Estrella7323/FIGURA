package figura;

public class Circulo extends Figura{
	static final private double PI = 3.14159;
	private double radio;
	
	public Circulo(String nom, double r) {
		super(nom);
		this.radio = r;
	}
    public double area() { 
    	System.out.println("Nombre del circulo"+this.nombre);
    	return PI * Math.pow(radio, 2);
    }
    public void pintar(String color) {
    	System.out.println("Circulo de color"+ color);
    }
}
