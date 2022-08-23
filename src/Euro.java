
public class Euro extends Divisa {

	public Euro(double valor) {
		super("€", valor);
		this.valor = valor;
		this.simbolo = "€";
	}

	@Override
	public double pasarADolares(double euros) {
		double dolares = euros;
		return dolares;
	}

}
