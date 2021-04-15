package figura;

public class Cuadrado extends Rectangulo{
	public Cuadrado(String nombre, double lado) {
		super(nombre, lado, lado);
	}
    public void pintar(String color) {
    	System.out.println("Cuadrado de color"+ color);
    }

}

