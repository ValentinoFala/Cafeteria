package Cafes;

public class Cafe {
	protected double precioBase;

	public Cafe(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

public double calcularPrecio() {
	return precioBase;
}
}
