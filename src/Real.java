
public class Real extends Divisa {

	public Real(double valor) {
		super("R$", valor);
		this.valor = valor;
		this.simbolo = "R$";
	}

	@Override
	public double pasarADolares(double real) {
		double dolares = real * 0.19;
		return dolares;
	}

	public static void main(String[] args) {
		Real real1 = new Real(199.574564);
		System.out.println(real1.simbolo + formato.format(real1.pasarADolares(real1.valor)));
	}
	
}
