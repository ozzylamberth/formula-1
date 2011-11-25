import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JCheckBox;




public class Campeonato extends JFrame {

	static ArrayList<ClaseCampeonato> al = new ArrayList<ClaseCampeonato>();

	public void agregar(ClaseCampeonato ca) {
		al.add(ca);

	}

	public void iguales(ClaseCampeonato ca1) {
		int re = 0;
		for (ClaseCampeonato a : al) {
			if (a.getIdCampeonato() == (ca1.getIdCampeonato())) {

				JOptionPane.showMessageDialog(null,
						"ya existe un campeonato con el mismo id");
				re = 1;
			}
		}

		if (re == 0)
			agregar(ca1);
		JOptionPane.showMessageDialog(null, "Campeonato Creado con Exito");
	}

	public void actualizar(ClaseCampeonato ca2) {
		int a = 0;
		if (al.isEmpty()) {
			System.out.println("no ahi datos");
		} else {
			for (ClaseCampeonato b : al) {
				if (b.getIdCampeonato() == (ca2.getIdCampeonato())) {
					a = al.indexOf(b);
					al.set(a, ca2);
					System.out.println("los datos se han actualizado con exito");
					JOptionPane.showMessageDialog(null,"los datos se han actualizado cone exito");
				} else {
					System.out
							.println("no existe ningun campeonato con ese id");
				}
			}

		}

	}

	public void buscarcampeonato(ClaseCampeonato ad) {
		int oe = 0;
		// con el isempty si mira si el arraylist esta vacio nos muestra en
		// pantalla el mensaje
		if (al.isEmpty()) {
			System.out.println("no hay datos");

			// se crea un for que me recorre todo el indice de el arraylist y me
			// compara si loq ingresa el usuario es igual a algun indice del
			// arraylist muestra en pantalla los datos de ese indice
		} else {
			for (ClaseCampeonato c : al) {
				if (c.getIdCampeonato() == (ad.getIdCampeonato())) {
					System.out.println(c.toString());
					oe = 1;
				}
			}

			// si no encuentra ninguno
			if (oe == 0)
				System.out.println("No Existe el Campeonato");

		}

	}

	JLabel label1, label2;
	JTextField Text1, Text2;
    JCheckBox a;
	
	JButton b3, b4;
	JPanel panelNorte, contenedor, panelcentro, panelsur, paneloeste,otropanel,
			paneleste;
	
	JTable tabla;
	
	

	public Campeonato() {
		super("crear campeonato");

		String combo[] = { "BCA", "MCA", "PPC", "CIC" };
		contenedor = new JPanel();
		panelNorte = new JPanel();
		panelsur = new JPanel();
		panelcentro = new JPanel();
		paneleste = new JPanel();
		paneloeste = new JPanel();

		label1 = new JLabel("Codigo");
		Text1 = new JTextField(20);
		

		label2 = new JLabel("Nombre");
		Text2 = new JTextField();
				
		JTable b = new JTable( new Object[][]{
                {false, null, null},
                {false, null, null},
                {false, null, null},
                {false, null, null}
            }, new String[] { "Descripcion", "Cantidad",
				"Precio"});
		b.setVisible(true);

		
		b3 = new JButton("Crear");
	
	
		contenedor.setLayout(new BorderLayout());
		panelcentro.setLayout(new GridLayout(6, 2, 30, 30));
		

		// agrega todos los componentes al panel del centro
		panelcentro.add(label1);
		panelcentro.add(Text1);
		panelcentro.add(label2);
		panelcentro.add(Text2);
		panelcentro.add(b3);
	
		panelcentro.add(b);

		

		
		
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
