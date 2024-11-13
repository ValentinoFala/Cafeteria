package Cafes;

public class Mocha extends Cafe{
	private double costoLecheV;
	private double costoChoso;
	public Mocha(double precioBase, double costoLecheV, double costoChoso) {
		super(precioBase);
		this.costoLecheV = costoLecheV;
		this.costoChoso = costoChoso;
	}
	public double getCostoLecheV() {
		return costoLecheV;
	}
	public void setCostoLecheV(double costoLecheV) {
		this.costoLecheV = costoLecheV;
	}
	public double getCostoChoso() {
		return costoChoso;
	}
	public void setCostoChoso(double costoChoso) {
		this.costoChoso = costoChoso;
	}
	public double calcularCostoExtra() {
		double costoExtra = (costoChoso + costoLecheV);
		return costoExtra;
	}
	@Override
	public double calcularPrecio() {
		return (super.calcularPrecio()+calcularCostoExtra());
	}
}
