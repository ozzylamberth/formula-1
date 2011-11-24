import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;

public class Resultados {
	
	private JTable tabla;
		
	private GridLayout cuadricula;
	// Este es el contenedor de la ventana
	private Container contenedor;
	private JPanel panel = new JPanel();
	
	
	public void  crearTabla(){ 
		cuadricula = new GridLayout(11, 8);
		// Asigno el contenedor
		contenedor = getContentPane();
		// al contenedor le agrego la cuadricula
		contenedor.setLayout(cuadricula);

		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		JTable table = new JTable(data, new String[] { "nombre","apellido","deporte","verdad" });

		
	tabla.repaint();

	tabla.addRowSelectionInterval(0, 0);

	tabla.setPreferredScrollableViewportSize(new Dimension(900, 300));

	JScrollPane scroll = new JScrollPane(tabla);

	this.contenedor.add(scroll, BorderLayout.CENTER);

	setVisible(true);

	addWindowListener(new WindowAdapter() {

		public void windowClosing(WindowEvent e) {

			System.exit(0);

		}

	});

	
	}
	
}
