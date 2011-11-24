import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;

public class Piloto extends JFrame {

	static ArrayList<ClasePiloto> ar = new ArrayList<ClasePiloto>();

	public void agregarEs(ClasePiloto cl) {
		ar.add(cl);
	}

	public void igualesEs(ClasePiloto cls) {
		int re = 0;
		for (ClasePiloto ad : ar) {
			if (ad.getIdentificacion() == (cls.getIdentificacion())) {
				JOptionPane.showMessageDialog(null,
						"ya existe un piloto con la misma identificacion");
				re = 1;
			}

		}

		if (re == 0)
			agregarEs(cls);
		JOptionPane.showMessageDialog(null, "piloto Creado con Exito");
	}

	public void buscarE(ClasePiloto asd) {
		int oe = 1;
		if (ar.isEmpty()) {
			JOptionPane.showMessageDialog(null, "no hay datos");
		} else {
			for (ClasePiloto f : ar) {
				if (f.getIdentificacion() == (asd.getIdentificacion())) {
					System.out.println(f);
					oe = 1;
				}
			}
			if (oe == 0) {
				System.out.println("No Existe el piloto");
			}

		}
	}

	public void actualizarEs(ClasePiloto asdf) {
		int a = 0;
		if (ar.isEmpty()) {
			System.out.println("no hay datos");
		} else {
			for (ClasePiloto d : ar) {
				if (d.getIdentificacion() == (asdf.getIdentificacion())) {
					a = ar.indexOf(d);
					ar.set(a, asdf);
					System.out
							.println("los datos se han actualizado con exito");
					JOptionPane.showMessageDialog(null,
							"los datos se han actualizado cone exito");
				} else {
					System.out
							.println("No existe ningun piloto con esa identificacion");
					JOptionPane.showMessageDialog(null,
							"los datos se han actualizado cone exito");
				}
			}

		}
	}

	public void eliminarEs(ClasePiloto asdfg) {
		int a = -1;
		if (ar.isEmpty()) {
			System.out.println("ni hay datos");
		} else {
			for (ClasePiloto c : ar) {
				if (c.getIdentificacion() == (asdfg.getIdentificacion())) {
					a = ar.indexOf(c);
					ar.remove(a);
					System.out.println("el piloto a sido eliminado");
					JOptionPane.showMessageDialog(null,
							"el piloto a sido eliminado");
					// aca debe hacerse el break para que no se siga comparando, aqui ya se saldria definitivamente del ciclo se encuentra el numero de documento
					break;

				}
			}

		}

		if (a == -1) {
			System.out
					.println("no existe ningun piloto con esa identificacion");

		}

	}

	JLabel label1, label2, label3, label0;
	JTextField Text1, txt2, Text0;
	JComboBox combo1;
	JButton B1, b2, b3, b4, B0;
	JPanel panelNorte, contenedor, panelcentro, panelsur, paneloeste,
			paneleste;

	public Piloto() {
		super("Crear Piloto");
		String com[] = { "BCA", "MCA", "PPC", "CIC" };
		contenedor = new JPanel();
		panelNorte = new JPanel();
		panelsur = new JPanel();
		panelcentro = new JPanel();
		paneleste = new JPanel();
		paneloeste = new JPanel();

		label0 = new JLabel("id piloto");
		Text0 = new JTextField(20);
		B1 = new JButton("crear piloto");

		label1 = new JLabel("nombre piloto");
		Text1 = new JTextField(20);
		b2 = new JButton("buscar piloto");

	
		label3 = new JLabel("Escuderia");
		combo1 = new JComboBox(com);
		b4 = new JButton("eliminar piloto");
		
		
		label2 = new JLabel("licencia");
		txt2 = new JTextField();
		b3 = new JButton("actualizar piloto");

	

		

		contenedor.setLayout(new BorderLayout());
		panelcentro.setLayout(new GridLayout(6, 2, 30, 30));

		// agrega todos los componentes al panel del centro
		panelcentro.add(label0);
		panelcentro.add(Text0);
		panelcentro.add(label1);
		panelcentro.add(Text1);
		panelcentro.add(label2);
		panelcentro.add(txt2);
		panelcentro.add(label3);
		panelcentro.add(combo1);
		panelcentro.add(B1);
		panelcentro.add(b2);
		panelcentro.add(b3);
		panelcentro.add(b4);
		
		B1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				int idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();
				
				
				idpiloto = Text0.getText().length();
				nombrepiloto = Text1.getText();
				escuderia = combo1.getSelectedItem().toString();
				licencia = txt2.getText();
				

				ClasePiloto ccc = new ClasePiloto(idpiloto,
						nombrepiloto, escuderia, licencia);
				
				ca.igualesEs(ccc);

				Text0.setText("");
				Text1.setText("");
				txt2.setText("");
				

			}
		});

		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idpiloto;
				Piloto ca = new Piloto();
				idpiloto = Text0.getText().length();
				ClasePiloto cc = new ClasePiloto(idpiloto, "", "",
						"");
				ca.buscarE(cc);				
				
				for (ClasePiloto a : ar) {
					Text1.setText(String.valueOf(a.getNombrePiloto()
							.toString()));
					combo1.setSelectedItem(String.valueOf(a.getEscuderia()
							.toString()));
					txt2.setText(String.valueOf(a.getLicencia()
							.toString()));
					
				}
			}
		});
		
		
		
		
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();
				
				
				idpiloto = Text0.getText().length();
				nombrepiloto = Text1.getText();
				escuderia = combo1.getSelectedItem().toString();
				licencia = txt2.getText();
				

				ClasePiloto ccc = new ClasePiloto(idpiloto,
						nombrepiloto, escuderia, licencia);
				ca.eliminarEs(ccc);

				Text1.setText(""); // se dejan en blanco las cajas de texto
				// luego de eliminar el estudiante
				Text0.setText("");
				Text1.setText("");
				txt2.setText("");

			}
		});

		
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();
				
				
				idpiloto = Text0.getText().length();
				nombrepiloto = Text1.getText();
				escuderia = combo1.getSelectedItem().toString();
				licencia = txt2.getText();
				

				ClasePiloto ccc = new ClasePiloto(idpiloto,
						nombrepiloto, escuderia, licencia);
				ca.actualizarEs(ccc);

				Text0.setText("");
				Text1.setText("");
				combo1.setSelectedItem("");
				txt2.setText("");

			}
		});

		
		
		
		
		
		
		
		
		
		
		

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