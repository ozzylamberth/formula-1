import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Carrera  extends JFrame{
	JLabel label1, label2,label3,label4,label5,label6;
	JTextField Text1;
	JComboBox combo1,combo2, combo3, combo4, combo5;
	JButton B1, b2;
	JPanel panelNorte, contenedor, panelcentro, panelsur, paneloeste,
			paneleste;
	
	public Carrera(){
		super("crear carrera");
		contenedor = new JPanel();
		panelNorte = new JPanel();
		panelsur = new JPanel();
		panelcentro = new JPanel();
		paneleste = new JPanel();
		paneloeste = new JPanel();

		label1 = new JLabel("nombre Carrera");
		Text1 = new JTextField(20);
		B1 = new JButton("Guardar campeonato");

		label2 = new JLabel("Agregar  circuito");
		combo1 = new JComboBox();
		b2 = new JButton("Editar campeonato");
		
		label3 = new JLabel("Agregar  campeonato");
		combo2 = new JComboBox();
		
		label4 = new JLabel("Agregar  piloto 1");
		combo3 = new JComboBox();
		label5 = new JLabel("Agregar  piloto 2");
		combo4 = new JComboBox();
		label6 = new JLabel("Agregar  piloto 3");
		combo5 = new JComboBox();

		contenedor.setLayout(new BorderLayout());
		panelcentro.setLayout(new GridLayout(7, 2, 30, 30));

		// agrega todos los componentes al panel del centro
		panelcentro.add(label1);
		panelcentro.add(Text1);
		panelcentro.add(label2);
		panelcentro.add(combo1);
		panelcentro.add(label3);
		panelcentro.add(combo2);
		panelcentro.add(label4);
		panelcentro.add(combo3);
		panelcentro.add(label5);
		panelcentro.add(combo4);
		panelcentro.add(label6);
		panelcentro.add(combo5);
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
	public static void main(String[] args) {
		Carrera p = new Carrera();
		p.setVisible(true);
		p.setSize(600, 500);
		p.setResizable(false);
	}



		
		
	}


