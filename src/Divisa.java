import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Divisa extends Unidad {
	
	public static DecimalFormat formato = new DecimalFormat("#,###.00");
	public static NumberFormat formatoNumero = NumberFormat.getNumberInstance();	
	//valores de cambio desde dolar
	private double valorEuro = 0.98363;
	private double valorPeso = 136.02;
	private double valorLibra = 0.85;
	private double valorReal = 5.17;
		
	public Divisa(String simbolo, double valor) { //constructor
		super(simbolo, valor);
	}

	public abstract double pasarADolares(double valor);
	
	public double dolaresAEuros(double valor) {
		double euros = valor * valorEuro;
		return euros;
	}
	
	public double dolaresAPesos(double valor) {
		double pesos = valor * valorPeso;
		return pesos;
	}
	
	public double dolaresALibras(double valor) {
		double libras = valor * valorLibra;
		return libras;
	}
	
	public double dolaresAReales(double valor) {
		double reales = valor * valorReal;
		return reales;
	}
}
 