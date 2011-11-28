import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;



import java.util.ArrayList;

public class Piloto extends JFrame {
	


	public void agregar(ClasePiloto cl) {

		Menu.listaP.add(cl);
	}
	
	        
	public void iguales(ClasePiloto as) {
		int re = 0;
		for (ClasePiloto p : Menu.listaP) {
			if (p.getIdentificacion().equals(as.getIdentificacion())) {
				System.out
						.println("ya existe un piloto con el mismo numero de identificacion");
				JOptionPane.showMessageDialog(null,
				"ya existe un piloto con el mismo numero de identificacion");
				re = 1;
			}
		}
		if (re == 0)
			agregar(as);
			
	}
	
	
	
	

	public void buscarE(ClasePiloto asd) {
		int oe = 1;
		if (Menu.listaP.isEmpty()) {
			JOptionPane.showMessageDialog(null, "no hay datos");
		} else {
			for (ClasePiloto f : Menu.listaP) {
				if (f.getIdentificacion().equals(asd.getIdentificacion())) {
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
		if (Menu.listaP.isEmpty()) {
			System.out.println("no hay datos");
		} else {
			for (ClasePiloto d : Menu.listaP) {
				if (d.getIdentificacion().equals(asdf.getIdentificacion())) {
					a = Menu.listaP.indexOf(d);
					Menu.listaP.set(a, asdf);
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
		if (Menu.listaP.isEmpty()) {
			System.out.println("ni hay datos");
		} else {
			for (ClasePiloto c : Menu.listaP) {
				if (c.getIdentificacion().equals(asdfg.getIdentificacion())) {
					a = Menu.listaP.indexOf(c);
					Menu.listaP.remove(a);
					System.out.println("el piloto a sido eliminado");
					JOptionPane.showMessageDialog(null,
							"el piloto a sido eliminado");
					// aca debe hacerse el break para que no se siga comparando,
					// aqui ya se saldria definitivamente del ciclo se encuentra
					// el numero de documento
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
		MyTableModel myModel = new MyTableModel();
		
		
		
	
		JTable table = new JTable(myModel);
		table.setPreferredScrollableViewportSize(new Dimension(200, 100));
		// Creatamos un contenedor para la Tabla
		JScrollPane scrollPane = new JScrollPane(table);
		// Agregamos nuestra tabla al contenedor
		getContentPane().add(scrollPane, BorderLayout.SOUTH);
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
		panelcentro.setLayout(new GridLayout(7, 2, 30, 30));

		// agrega todos los componentes al panel del centro
		panelcentro.add(label0);
		panelcentro.add(Text0);
		panelcentro.add(label1);
		panelcentro.add(Text1);
		panelcentro.add(label3);
		panelcentro.add(combo1);
		panelcentro.add(label2);
		panelcentro.add(txt2);
		
		panelcentro.add(B1);
		panelcentro.add(b2);
		panelcentro.add(b3);
		panelcentro.add(b4);
		//panelcentro.add(table);

		B1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();

				idpiloto = Text0.getText();
				nombrepiloto = Text1.getText();
				escuderia = combo1.getSelectedItem().toString();
				licencia = txt2.getText();

				ClasePiloto ccc = new ClasePiloto(idpiloto, nombrepiloto,
						escuderia, licencia);

				ca.iguales(ccc);

				Text0.setText("");
				Text1.setText("");
				txt2.setText("");

			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idpiloto;
				Piloto ca = new Piloto();
				idpiloto = Text0.getText();
				ClasePiloto cc = new ClasePiloto(idpiloto, "", "", "");
				ca.buscarE(cc);

				for (ClasePiloto a : Menu.listaP) {
					Text1.setText(String
							.valueOf(a.getNombrePiloto().toString()));
					combo1.setSelectedItem(String.valueOf(a.getEscuderia()
							.toString()));
					txt2.setText(String.valueOf(a.getLicencia().toString()));

				}
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();

				idpiloto = Text0.getText();
				nombrepiloto = Text1.getText();
				escuderia = combo1.getSelectedItem().toString();
				licencia = txt2.getText();

				ClasePiloto ccc = new ClasePiloto(idpiloto, nombrepiloto,
						escuderia, licencia);
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
				String idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();

				idpiloto = Text0.getText();
				nombrepiloto = Text1.getText();
				escuderia = combo1.getSelectedItem().toString();
				licencia = txt2.getText();

				ClasePiloto ccc = new ClasePiloto(idpiloto, nombrepiloto,
						escuderia, licencia);
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
		
		class MyTableModel extends AbstractTableModel {
			final String[] columnNames = { "Identificacion", "Nombre", "Escuderia",
					"licencia" };
			
			
			final Object[][] data = {
					{ "Mary", "Campione", "Esquiar", new Integer(5),
							new Boolean(false) },
					{ "Lhucas", "Huml", "Patinar", new Integer(3),
							new Boolean(true) },
					{ "Kathya", "Walrath", "Escalar", new Integer(2),
							new Boolean(false) },
					{ "Marcus", "Andrews", "Correr", new Integer(7),
							new Boolean(true) } };

			// únicamente retornamos el numero de elementos del
			// array de los nombres de las columnas
			public int getColumnCount() {
				return columnNames.length;
			}

			// retormanos el numero de elementos
			// del array de datos
			public int getRowCount() {
				return data.length;
			}

			// retornamos el elemento indicado
			public String getColumnName(int col) {
				return columnNames[col];
			}

			// y lo mismo para las celdas
			public Object getValueAt(int row, int col) {
				return data[row][col];
			}

			/*
			 * Este metodo sirve para determinar el editor predeterminado para cada
			 * columna de celdas
			 */
			public Class getColumnClass(int c) {
				return getValueAt(0, c).getClass();
			}

			/*
			 * 
			 * /* No tienes que implementar este método a menos que los datos de tu
			 * tabla cambien
			 */
			public void setValueAt(Object value, int row, int col) {
				data[row][col] = value;
				fireTableCellUpdated(row, col);
			}

		}
		

	
}