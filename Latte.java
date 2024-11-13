package Cafes;

public class Latte extends Cafe{
	private double costoLecheV;
	private double costoLecheE;
	public Latte(double precioBase, double costoLecheV, double costoLecheE) {
		super(precioBase);
		this.costoLecheV = costoLecheV;
		this.costoLecheE = costoLecheE;
	}
	public double getCostoLecheV() {
		return costoLecheV;
	}
	public void setCostoLecheV(double costoLecheV) {
		this.costoLecheV = costoLecheV;
	}
	public double getCostoLecheE() {
		return costoLecheE;
	}
	public void setCostoLecheE(double costoLecheE) {
		this.costoLecheE = costoLecheE;
	}
	public double calcularCostoExtra() {
		double costoExtra = (costoLecheE + costoLecheV);
		return costoExtra;
	}
	@Override
	public double calcularPrecio() {
		return (super.calcularPrecio()+calcularCostoExtra());
	}
}
