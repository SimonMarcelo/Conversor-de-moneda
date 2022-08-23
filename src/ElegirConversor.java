import javax.swing.*;

public class ElegirConversor {
	public static void main(String[] args) {

		String[] conversores = { "Divisas", "Temperatura" };

		String elegirConversor = (String) JOptionPane.showInputDialog(null, "¿Qué tipo de conversión deseas realizar?",
				"Elegir conversion", JOptionPane.PLAIN_MESSAGE, null, conversores, conversores[0]);

		if (elegirConversor == conversores[0]) {
			ConversorDivisas.main(args);
		} else if (elegirConversor == conversores[1]) {
			ConversorTemperatura.main(args);
		} 
	}
}
