import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Bienvenida {

	public static void Bienvenida() throws Exception {
		// TODO Auto-generated method stub

		ImageIcon icon = new ImageIcon(new URL("file:///C:/Users/KLM/eclipse-workspace/ConversorMultipleAlura/src/logo.png"));
		JLabel label = new JLabel(icon);
		JOptionPane.showMessageDialog(null, "Conversor múltiple ALURA. ACEPTAR para continuar...", "Bienvenida", JOptionPane.INFORMATION_MESSAGE, icon);
	
		
	}

}
