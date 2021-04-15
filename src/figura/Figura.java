package figura;

public abstract class Figura {
	protected String nombre;
	abstract public void pintar(String color);
	abstract public double area();
	
	public Figura(String nombre) {
		this.nombre = nombre;
		
	}
    final public double compArea(Figura b) {
    	return this.area() - b.area();
    	
    }
    final public String toString() {
    	return this.nombre+"de area"+ this.area();
    }
}
