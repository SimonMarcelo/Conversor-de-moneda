
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDivisas {

	public static DecimalFormat formato2Decimales = new DecimalFormat("#,###.00");
	public static DecimalFormat formatoSinDecimal = new DecimalFormat("#,###.##");
 
	public static void main(String[] args) {

		String[] conversionesMonetarias = { "Peso Argentino a Dolar Estadounidense", "Peso Argentino a Euro",
				"Peso Argentino a Libra Esterlina", "Peso Argentino a Real", "Dolar Estadounidense a Peso Argentino",
				"Euro a Peso Argentino", "Libra Esterlina a Peso Argentino", "Real a Peso Argentino" };

		String elegirConversionMoneda = (String) JOptionPane.showInputDialog(null,
				"¿Qué tipo de conversión deseas realizar?", "Elegir conversion", JOptionPane.QUESTION_MESSAGE, null,
				conversionesMonetarias, conversionesMonetarias[0]);

		if (elegirConversionMoneda != null) {

			try {
				double valorAConvertir = Double
					.parseDouble(JOptionPane.showInputDialog("¿Cuál es el importe a convertir de \n "   + elegirConversionMoneda + "?"));

				String stringDevuelto;

				switch (elegirConversionMoneda) {
				case "Peso Argentino a Dolar Estadounidense": {
					PesoArgentino peso1 = new PesoArgentino(valorAConvertir);
					double valorConvertido = peso1.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					stringDevuelto = dolar.simbolo + " " + formato2Decimales.format(dolar.valor);
					break;
				}
				case "Peso Argentino a Euro": {
					PesoArgentino peso1 = new PesoArgentino(valorAConvertir);
					double valorConvertido = peso1.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					Euro euro = new Euro(dolar.dolaresAEuros(valorConvertido));
					stringDevuelto = euro.simbolo + " " + formato2Decimales.format(euro.valor);
					break;
				}
				case "Peso Argentino a Libra Esterlina": {
					PesoArgentino peso1 = new PesoArgentino(valorAConvertir);
					double valorConvertido = peso1.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					LibraEsterlina libraEsterlina = new LibraEsterlina(dolar.dolaresALibras(valorConvertido));
					stringDevuelto = libraEsterlina.simbolo + formato2Decimales.format(libraEsterlina.valor);
					break;
				}
				case "Peso Argentino a Real": {
					PesoArgentino peso = new PesoArgentino(valorAConvertir);
					double valorConvertido = peso.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					Real real = new Real(dolar.dolaresAReales(valorConvertido));
					stringDevuelto = real.simbolo + " " + formato2Decimales.format(real.valor);
					break;
				}
				case "Dolar Estadounidense a Peso Argentino": {
					Dolar dolar = new Dolar(valorAConvertir);
					double valorConvertido = dolar.dolaresAPesos(valorAConvertir);
					PesoArgentino peso = new PesoArgentino(valorConvertido);
					stringDevuelto = peso.simbolo + " " + formato2Decimales.format(peso.valor);
					break;
				}
				case "Euro a Peso Argentino": {
					Euro euro = new Euro(valorAConvertir);
					double valorConvertido = euro.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					PesoArgentino peso = new PesoArgentino(dolar.dolaresAPesos(valorConvertido));
					stringDevuelto = peso.simbolo + " " + formato2Decimales.format(peso.valor);
					break;
				}
				case "Libra Esterlina a Peso Argentino": {
					LibraEsterlina libraEsterlina = new LibraEsterlina(valorAConvertir);
					double valorConvertido = libraEsterlina.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					PesoArgentino peso = new PesoArgentino(dolar.dolaresAPesos(valorConvertido));
					stringDevuelto = peso.simbolo + " " + formato2Decimales.format(peso.valor);
					break;
				}
				case "Real a Peso Argentino": {
					Real real = new Real(valorAConvertir);
					double valorConvertido = real.pasarADolares(valorAConvertir);
					Dolar dolar = new Dolar(valorConvertido);
					PesoArgentino peso = new PesoArgentino(dolar.dolaresAPesos(valorConvertido));
					stringDevuelto = peso.simbolo + " " + formato2Decimales.format(peso.valor);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + elegirConversionMoneda);
				}

				JOptionPane.showMessageDialog(null, formatoSinDecimal.format(valorAConvertir) + " convertido de "
						+ elegirConversionMoneda + " es: " + stringDevuelto);

			} catch (NumberFormatException ne) {
				JOptionPane.showMessageDialog(null, "El valor ingresado debe ser un número");

			}
		}
	}
}
