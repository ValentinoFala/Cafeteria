package Cafes;

public class Vendedor {
	private Cafe cafe;
	private double ganancia;
	public Vendedor(Cafe cafe, double ganancia) {
		this.cafe = cafe;
		this.ganancia = ganancia;
	}
	public Cafe getCafe() {
		return cafe;
	}
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	public double getGanancia() {
		return ganancia;
	}
	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	public double calcularPrecioFinal() {
		double precio;
		precio = (cafe.calcularPrecio()+ ganancia);
		return precio;
	}
}
