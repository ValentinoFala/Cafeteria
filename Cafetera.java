package Cafes;

public class Cafetera {

	public static void main(String[] args) {
		Cafe Cappu = new Cappucino(0.25, 0.50, 0.35, 1);
		Cappucino cappu2 = new Cappucino(0.25, 0.75, 0.35, 1);
		Vendedor Juancito = new Vendedor(cappu2, 3.0);
		System.out.println("El precio es: " + Juancito.calcularPrecioFinal());
		System.out.println("El precio es: " + cappu2.calcularPrecio());
		System.out.println("El precio es: " + Cappu.calcularPrecio());
	}

}
