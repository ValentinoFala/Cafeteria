package Cafes;

public class Cappucino extends Cafe{
	private double costoLecheV;
	private double costoCacao;
	private double costoCanela;
	public Cappucino(double precioBase, double costoLecheV, double costoCacao, double costoCanela) {
		super(precioBase);
		this.costoLecheV = costoLecheV;
		this.costoCacao = costoCacao;
		this.costoCanela = costoCanela;
	}
	public double getCostoLecheV() {
		return costoLecheV;
	}
	public void setCostoLecheV(double costoLecheV) {
		this.costoLecheV = costoLecheV;
	}
	public double getCostoCacao() {
		return costoCacao;
	}
	public void setCostoCacao(double costoCacao) {
		this.costoCacao = costoCacao;
	}
	public double getCostoCanela() {
		return costoCanela;
	}
	public void setCostoCanela(double costoCanela) {
		this.costoCanela = costoCanela;
	}
	
	public double calcularCostoExtra() {
		double costoExtra = (costoCacao + costoCanela + costoLecheV);
		return costoExtra;
	}
	@Override
	public double calcularPrecio() {
		return (super.calcularPrecio()+calcularCostoExtra());
	}
}
