
public class PesoArgentino extends Divisa {

	public PesoArgentino(double valor) {
		super("$", valor);
		this.valor = valor;
		this.simbolo = "$";
	}

	@Override
	public double pasarADolares(double pesos) {
		double dolares = pesos * 0.0074;
		return dolares;
	}

	
}
