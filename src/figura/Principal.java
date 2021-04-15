package figura;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Circulo c1 = new Circulo("circulo 1", 5);
		
		Rectangulo r1 = new Rectangulo ("rect 1 ", 10 , 3);
		
		Cuadrado cua1 = new Cuadrado("cuadrado 1", 6);
		
		Figura[] arreglo = new Figura[6];
		arreglo [0] = new Circulo("circulo 2", 40);
		arreglo [1] = new Cuadrado("cuadrado 5", 5);
		arreglo [2] = new Rectangulo("rectangulo 20", 3,7);
		arreglo [4] = c1;
		
		System.out.println("Area total;"+ TotalArea(arreglo));
		
		ArrayList<Figura> v1 = new ArrayList<Figura>();
		v1.add(new Circulo("c6",30));
		v1.add(new Rectangulo("r5",2,5));
		v1.add(arreglo[1]);
		
		Circulo f2 = (Circulo) v1.get(0);
		
		//v1.add(new Figura());

		//mostrar(v1);
		
		//System.out.println("Figura posicion 1;"+ arreglo[1]);
		
		/*
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(cua1);
		*/
		/*
		colorear(c1, "rojo");
		colorear(r1, "azul");
		colorear(cua1, "amarillo");
		*/
    }
	 public static void mostrar(ArrayList<Figura> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	 }
	
	public static void colorear(Figura f , String color) {
		f.pintar(color);
	}
	public static double TotalArea(Figura[] ar) {
		double suma = 0;
		for (Figura x: ar) {
			if (x !=null)
				suma += x.area();
		}
		return suma;
	}
	
}
