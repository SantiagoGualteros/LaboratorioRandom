package logica;

public class Dividir extends Calculadora {
	private double num1;
	private double num2;
	
	public Dividir(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double operacion() {
		double dividir = num1 / num2;
		return dividir;
	}
	
}
