import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Escuderia extends JFrame{
	
	JLabel label1;
	JTextField Text1;
	
	JButton B1,b2;
	JPanel panelNorte, contenedor, panelcentro, panelsur, paneloeste,
			paneleste;
	
	public  Escuderia(){
		super("crear escuderia");
				
		contenedor = new JPanel();
		panelNorte = new JPanel();
		panelsur = new JPanel();
		panelcentro = new JPanel();
		paneleste = new JPanel();
		paneloeste = new JPanel();

		label1 = new JLabel("Nombre Escuderia ");
		Text1 = new JTextField(20);
		B1 = new JButton("guardar Escuderia");
		b2 = new JButton("Editar escuderia");
		
		contenedor.setLayout(new BorderLayout());
		panelcentro.setLayout(new GridLayout(2, 1, 10, 10));

		// agrega todos los componentes al panel del centro
		panelcentro.add(label1);
		panelcentro.add(Text1);
		panelcentro.add(B1);
		panelcentro.add(b2);
		
		// se le agrega al contenedor todos los paneles en diferentes partes del
		// frame para una mejor distribucion del los componentes
		contenedor.add(panelcentro, BorderLayout.CENTER);
		contenedor.add(panelNorte, BorderLayout.NORTH);
		contenedor.add(panelsur, BorderLayout.SOUTH);
		contenedor.add(paneloeste, BorderLayout.WEST);
		contenedor.add(paneleste, BorderLayout.EAST);
		add(contenedor);

		

	}
	
	public static void main(String args[]) {
		Escuderia Eje = new Escuderia();
		Eje.setSize(300, 200);
		Eje.setVisible(true);
	}
		
	
	

}
