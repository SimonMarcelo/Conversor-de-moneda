
public class Dolar extends Divisa {

	public Dolar(double valor) {
		super("U$S", valor);
		this.valor = valor;
		this.simbolo = "U$S";
	}

	@Override
	public double pasarADolares(double dolar) {
		double dolares = dolar;
		return dolares;
	}

}
