import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang.ArrayUtils;//interesante identificar número elemento matriz
import org.omg.CORBA.PUBLIC_MEMBER;

public class MenuConversorEnergias extends MenuPrincipal {

	public static double importe;

	public static void main(String[] args) {

	}

	public static void MenuEnergias() {
		String[] opcionesMenuConversorEnergia = {
				"kilowatt-hora (kWh) \u25B6 kilocaloría (kcal)",
				"kilowatt-hora (kWh) \u25B6 unidad termal británica (BTU)",
				"kilowatt-hora (kWh) \u25B6 kilojoule (kJ)",
				"kilocaloría (kcal) \u25B6 kilowatt-hora (kWh)", 
				"unidad termal británica (BTU) \u25B6 kilowatt-hora (kWh)",
				"kilojoule (kJ) \u25B6 kilowatt-hora (kWh)", 
				"Regresar al MENÚ PRINCIPAL" };
		String opcionConversion = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opción o CANCELAR para salir.", "Conversor de energías ALURA", JOptionPane.PLAIN_MESSAGE,
				null, opcionesMenuConversorEnergia, opcionesMenuConversorEnergia[0]);// opción por defecto seleccionada de
																					// la matriz

		if (opcionConversion == opcionesMenuConversorEnergia[6]) {
			MenuPrincipal();
		}
		if (opcionConversion == null) {
			System.exit(0);
		}

		if (opcionConversion != opcionesMenuConversorEnergia[6]) {

			// ingreso de la suma a convertir
			JFrame frame1 = new JFrame();
			String importe = JOptionPane.showInputDialog(frame1, "Ingrese la cantidad a convertir...", opcionConversion,
					JOptionPane.QUESTION_MESSAGE);

			// el ingreso es valor numerico?
			String regex = "([0-9]+)(.*)";
			if (importe.matches(regex) == false) {

				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f, "Ingrese un dato numérico.");
				MenuEnergias();
			}

			ConversorEnergias.Convertir(ArrayUtils.indexOf(opcionesMenuConversorEnergia, opcionConversion) + 1,
					Double.parseDouble(importe));

			double mensajeEgreso;

			mensajeEgreso = ConversorEnergias.egreso;
			mensajeEgreso = Math.round((ConversorEnergias.egreso * 10000)) / 10000.0;

			// mensajeEgreso=ConversorDivisas.egreso;
			JFrame frame2 = new JFrame();
			JOptionPane.showMessageDialog(frame2,
					importe + " " + ConversorEnergias.unidadIngreso + " " + "equivalen a " + mensajeEgreso + " "
							+ ConversorEnergias.unidadEgreso,
					"La conversión solicitada es...", JOptionPane.INFORMATION_MESSAGE);

			String[] options = new String[] { "Nueva conversión", "MENU PRINCIPAL", "Cancelar" };
			int response = JOptionPane.showOptionDialog(null, "Seleccione una opción o CANCELAR para salir",
					"Conversor múltiple ALURA", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
					options[0]);
			switch (response) {
			case 0:
				MenuEnergias();
				break;
			case 1:
				MenuPrincipal();
				break;
			case 2:
				System.exit(0);
				break;
			}

		}

	}

}
