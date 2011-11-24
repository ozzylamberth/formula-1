import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Resultados extends JFrame{
			
	private GridLayout cuadricula;
	
	private Container contenedor;
	private JPanel panel = new JPanel();
	private JTable tabla;
	
	
	public void  crearTabla(){ 
		cuadricula = new GridLayout(11, 8);
		// Asigno el contenedor
		contenedor = getContentPane();
		// al contenedor le agrego la cuadricula
		contenedor.setLayout(cuadricula);
		contenedor.add(panel);
				
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
