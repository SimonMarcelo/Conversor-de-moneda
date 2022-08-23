
public class LibraEsterlina extends Divisa {

	public LibraEsterlina(double valor) {
		super("₤", valor);
		this.valor = valor;
		this.simbolo = "₤";
	}

	@Override
	public double pasarADolares(double libra) {
		double dolares = libra * 1.18;
		return dolares;
	}

}
