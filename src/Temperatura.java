
public abstract class Temperatura extends Unidad {
	
	public Temperatura(String simbolo, double valor) { //constructor
		super(simbolo, valor);
	}

	public double kelvinACelsius (double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}
	
	public double kelvinAFarenheit (double kelvin) {
		double farenheit = ((kelvin - 273.15) * 1.8) + 32;
		return farenheit;
	}
	
	public double celsiusAFarenheit (double celsius) {
		double farenheit = (celsius * 1.8) + 32;
		return farenheit;
	}
	
	public double celsiusAKelvin (double celsius) {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double farenheitAKelvin (double farenheit) {
		double kelvin = ((farenheit - 32) * 5 / 9) + 273.15;
		return kelvin;
	}
	
	public double farenheitACelsius (double farenheit) {
		double celsius = (farenheit - 32) * 5 / 9;
		return celsius;
	}

}
 