import javax.swing.JOptionPane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class MenuPrincipal {

	public static void main(String[] args) throws Exception {
		Bienvenida();
		MenuPrincipal();

	}

	public static void Bienvenida() throws Exception {
		ImageIcon icon = new ImageIcon(new URL("file:///C:/Users/KLM/eclipse-workspace/ConversorMultipleAlura/src/logo.png"));
		JLabel label = new JLabel(icon);
		JOptionPane.showMessageDialog(null, "Conversor m�ltiple ALURA. ACEPTAR para continuar...", "Bienvenida", JOptionPane.INFORMATION_MESSAGE, icon);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void MenuPrincipal() {

		// Se crea array con las opciones del menu principal
		String[] opcionesMenuPrincipal = { "Conversi�n de divisas", "Conversi�n de presiones",
				"Conversi�n de energ�as" };
		// asignamos las opciones al joptionpane

		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opci�n o CANCELAR para salir", "Conversor m�ltiple ALURA", JOptionPane.PLAIN_MESSAGE,
				null, opcionesMenuPrincipal, opcionesMenuPrincipal[0]); // opci�n por defecto seleccionada de la matriz

		if (opcionSeleccionada == opcionesMenuPrincipal[0]) {
			MenuConversorDivisas.MenuDivisas();
		}

		if (opcionSeleccionada == opcionesMenuPrincipal[1]) {
			MenuConversorPresiones.MenuPresiones();
		}

		if (opcionSeleccionada == opcionesMenuPrincipal[2]) {
			MenuConversorEnergias.MenuEnergias();
		}

		if (opcionSeleccionada == null) {
			System.exit(0);
		}
		// if(opcionSeleccionada==opcionesMenuPrincipal[3])
		// {// salimos del menu
		// System.exit(0);

	}

}
