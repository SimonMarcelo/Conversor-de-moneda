
public class Celsius extends Temperatura{

	public Celsius (String simbolo, double valor) { //constructor
		super("°C", valor);
		this.valor = valor;
		this.simbolo = "°C";
	}
	
}
