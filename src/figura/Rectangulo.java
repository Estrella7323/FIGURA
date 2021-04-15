package figura;

public class Rectangulo extends Figura{
	private double largo;
	private double ancho;
	
	public Rectangulo(String nom, double largo , double ancho ) {
		super(nom);
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public double area() {
		return this.largo * this.ancho;
						
	}
    public void pintar(String color) {
    	System.out.println("Rectangulo de color"+ color);
    }
}
