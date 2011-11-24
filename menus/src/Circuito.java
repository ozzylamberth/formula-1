import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Circuito extends JFrame{
	JLabel label1, label2,label3;
	JTextField Text1,Text2;
	JComboBox combo1,combo2;
	JButton B1, b2;
	JPanel panelNorte, contenedor, panelcentro, panelsur, paneloeste,
	paneleste;
	
	 public Circuito() 
		// TODO Auto-generated constructor stub
	 {
		super ("crear campeonato");
		String course[] = {"autodrono","callejero","hibrido"};
		contenedor = new JPanel();
		panelNorte = new JPanel();
		panelsur = new JPanel();
		panelcentro = new JPanel();
		paneleste = new JPanel();
		paneloeste = new JPanel();

		label1 = new JLabel("nombre del circuito");
		Text1 = new JTextField(20);
		B1 = new JButton("adicionar circuito");

		label2 = new JLabel("Hubicacion");
		Text2 = new JTextField();
		b2 = new JButton("actualizar circuito");

		

		label3 = new JLabel("Tipo");
		combo2= new JComboBox(course);
	

		contenedor.setLayout(new BorderLayout());
		panelcentro.setLayout(new GridLayout(4, 2, 30, 30));

		// agrega todos los componentes al panel del centro
		panelcentro.add(label1);
		panelcentro.add(Text1);
		panelcentro.add(label2);
		panelcentro.add(Text2);
		panelcentro.add(label3);
		panelcentro.add(combo2);
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
	
	

}
