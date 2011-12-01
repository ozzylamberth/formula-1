import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Carrera extends JFrame {

	public void agregar(ClaseCarrera cl) {

		Menu.listaR.add(cl);
	}

	public void iguales(ClaseCarrera as) {
		int re = 0;
		for (ClaseCarrera p : Menu.listaR) {
			if (p.getIdCarrera().equals(as.getIdCarrera())) {
				System.out
						.println("Ya Existe una Carrera con el mismo id");
				JOptionPane
						.showMessageDialog(null,
								"Ya Existe una Carrera con el mismo id");
				re = 1;
			}
		}
		if (re == 0)
			agregar(as);

	}

	public void buscarE(ClaseCarrera asd) {
		int oe = 1;
		if (Menu.listaR.isEmpty()) {
			JOptionPane.showMessageDialog(null, "no hay datos");
		} else {
			for (ClaseCarrera f : Menu.listaR) {
				if (f.getIdCarrera().equals(asd.getIdCarrera())) {
					System.out.println(f);
					oe = 1;
				}
			}
			if (oe == 0) {
				System.out.println("No Existe la carrera");
			}

		}
	}

	public void actualizarEs(ClaseCarrera asdf) {
		int a = 0;
		if (Menu.listaR.isEmpty()) {
			System.out.println("no hay datos");
		} else {
			for (ClaseCarrera d : Menu.listaR) {
				if (d.getIdCarrera().equals(asdf.getIdCarrera())) {
					a = Menu.listaR.indexOf(d);
					Menu.listaR.set(a, asdf);
					System.out
							.println("la Carrera se ha Actualizado con exito");
					JOptionPane.showMessageDialog(null,
							"la Carrera se ha Actualizado con exito");
				} else {
					System.out
							.println("No existe ninguna carrera con ese id");
					JOptionPane.showMessageDialog(null,
							"los datos se han actualizado cone exito");
				}
			}

		}
	}

	public void eliminarEs(ClaseCarrera asdfg) {
		int a = -1;
		if (Menu.listaR.isEmpty()) {
			System.out.println("ni hay datos");
		} else {
			for (ClaseCarrera c : Menu.listaR) {
				if (c.getIdCarrera().equals(asdfg.getIdCarrera())) {
					a = Menu.listaR.indexOf(c);
					Menu.listaR.remove(a);
					System.out.println("la Carrera ha sido eliminada");
					JOptionPane.showMessageDialog(null,
							"la Carrera ha sido eliminada");
					// aca debe hacerse el break para que no se siga comparando,
					// aqui ya se saldria definitivamente del ciclo se encuentra
					// el numero de documento
					break;

				}
			}

		}

		if (a == -1) {
			System.out
					.println("no existe ninguna carrera con ese id");

		}

	}

	// Estas son las variables para las cajas de texto
	private JTextField jTId, JTnombre, jTFecha;
	private JComboBox JCNumVueltas, JCCircuito;
	// Estas son las variables para las eqtiquetas de las cajas de texto
	private JLabel lblIdentificacion, lblInombre, lblEscuderia, lblLicencia,
			lblnumvueltas, lbcircuito;
	// Estas son las variables para los botones
	private JButton insertar, eliminar, actualizar, buscar;
	// Esta es la cuadricula que me permite ubicar los elementos de la ventana
	private GridLayout cuadricula;
	// Este es el contenedor de la ventana
	private Container contenedor;
	// Este es el panel para agregarle los elementos de la ventana
	private JPanel panel = new JPanel();
	// Esta es la instancia de la clase calcular

	// Esta es la tabla donde se veran las operaciones
	private JTable tabla;
	// Esta es la lista de producto y sus caracteristicas
	int indice;

	// Este es el contructor de la clase vista

	public Carrera() {
		// llamada a super para el nombre de la ventana
		super("Facturacion");
		String[] listaNumVueltas = { "1", "2", "3", "4", "5" };
		String[] listaCircuitos = { "Adelaida", "Albert Park", "Bahréin",
				"Boavista", "Brands Hatch", "Bugatti" };
		// Instancio la cuadrivula
		cuadricula = new GridLayout(11, 8);
		// Asigno el contenedor
		contenedor = getContentPane();
		// al contenedor le agrego la cuadricula
		contenedor.setLayout(cuadricula);
		// Instancio la etiqueta de cliente
		lblIdentificacion = new JLabel("Id Carrera");
		// Instancio la caja de texto del cliente
		jTId = new JTextField();
		// instancio la etiqueta de la fecha
		lblInombre = new JLabel("Nombre Carrera");
		// Instancio la caja de texto de la fecha
		JTnombre = new JTextField();
		// Instancio la etiqueta producto
		lblEscuderia = new JLabel("Fecha Carrera");
		// Instancio la caja de texto del producto
		jTFecha = new JTextField();
		// Instancio la etiqueta de la descripcion
		lblnumvueltas = new JLabel("Numero Vueltas");
		// Instancio la caja de texto de la descripcion
		JCNumVueltas = new JComboBox(listaNumVueltas);
		lbcircuito = new JLabel("Circuito");
		JCCircuito = new JComboBox(listaCircuitos);

		// Creo el boton insertar
		insertar = new JButton("Insertar");
		// Asigno el evento al boton insertar

		// Creo el boton eliminar
		eliminar = new JButton("Eliminar");
		// Asigno el evento al boton eliminar

		// Creo el boton actualizar
		actualizar = new JButton("Actualizar");
		// Asigno el evento al boton actualizar

		// Agrego al contenedor la etiqueta nombre

		buscar = new JButton("Buscar");
		// Asigno el evento al boton buscar

		// Agrego al contenedor la etiqueta buscar

		contenedor.add(lblIdentificacion);
		// Agrego al contenedor la caja de texto nombre
		contenedor.add(jTId);
		// Agrego al contenedor la etiqueta fecha
		contenedor.add(lblInombre);
		// Agrego al contenedor la caja de texto fecha
		contenedor.add(JTnombre);
		// Agrego al contenedor la etiqqueta de producto
		contenedor.add(lblEscuderia);
		// agrego al contenedor la caja de texto producto
		contenedor.add(jTFecha);
		contenedor.add(lblnumvueltas);
		// Agrego al contenedor la etiqueta descripcion
		contenedor.add(JCNumVueltas);
		contenedor.add(lbcircuito);
		// Agrego al contenedor la caja de texto
		contenedor.add(JCCircuito);
		// Agrego al contenedor la etiqueta de cantidad
		contenedor.add(insertar);
		// Agrego al contenedor la caja de texto cantidad
		contenedor.add(eliminar);
		// Agrego al contenedor la etiqueeta de precio
		contenedor.add(actualizar);
		// Agrego al contenedor la caja de texto precio
		contenedor.add(buscar);
		// Agrego al contenedor el panel
		contenedor.add(panel);
		// Dimensiono la ventana
		// Vuelvo visible los elementos de la ventana

		insertar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String id, nombreCa, fecha, numVueltas, circuito;
				Carrera ca = new Carrera();

				id = jTId.getText();
				nombreCa = JTnombre.getText();
				fecha = jTFecha.getText();
				numVueltas = JCNumVueltas.getSelectedItem().toString();
				circuito = JCCircuito.getSelectedItem().toString();

				ClaseCarrera ccc = new ClaseCarrera(id, nombreCa, fecha,
						numVueltas, circuito);

				ca.iguales(ccc);

				jTId.setText("");
				JTnombre.setText("");
				jTFecha.setText("");

				if (tabla != null) {
					contenedor.remove(15);

				}

				Object[][] objetos = new Object[Menu.listaR.size()][5];
				for (int i = 0; i < Menu.listaR.size(); i++) {

					objetos[i][0] = Menu.listaR.get(i).getIdCarrera();
					objetos[i][1] = Menu.listaR.get(i).getNombre();
					objetos[i][2] = Menu.listaR.get(i).getFecha();
					objetos[i][3] = Menu.listaR.get(i).getNumvueltas();
					objetos[i][4] = Menu.listaR.get(i).getCircuito();
				}

				String[] nombreColumnas = { "Id Carrera", "Nombre", "Fecha",
						"Numero Vueltas", "Circuito" };

				tabla = new JTable(objetos, nombreColumnas);

				// Redibujo la tabla
				tabla.repaint();
				// Agrego los datos a la tabla en sus respectivas celdas
				tabla.addRowSelectionInterval(0, 0);
				// Dimensiono un scrollPane
				tabla
						.setPreferredScrollableViewportSize(new Dimension(600,
								200));

				// creo un scrollPane
				JScrollPane scroll = new JScrollPane(tabla);
				// Agrego el scrollPane al contenedor
				contenedor.add(scroll, BorderLayout.SOUTH);
				// Configuro la visibilidad del ScrollPane
				setVisible(true);
				// Creo el evento para cerrar la ventana*/

			}
		});

		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id;
				Carrera ca = new Carrera();
				id = jTId.getText();
				ClaseCarrera cc = new ClaseCarrera(id, "", "", "", "");
				ca.buscarE(cc);

				for (ClaseCarrera a : Menu.listaR) {
					JTnombre.setText(String.valueOf(a.getNombre().toString()));
					jTFecha.setText(String.valueOf(a.getFecha()));
					JCNumVueltas.setSelectedItem(String.valueOf(a
							.getNumvueltas().toString()));
					JCCircuito.setSelectedItem(String.valueOf(a.getCircuito()
							.toString()));

				}
			}
		});

		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id, nombreCa, fecha, numVueltas, circuito;
				Carrera ca = new Carrera();

				id = jTId.getText();
				nombreCa = JTnombre.getText();
				fecha = jTFecha.getText();
				numVueltas = JCNumVueltas.getSelectedItem().toString();
				circuito = JCCircuito.getSelectedItem().toString();

				ClaseCarrera ccc = new ClaseCarrera(id, nombreCa, fecha,
						numVueltas, circuito);

				ca.eliminarEs(ccc);

				jTId.setText("");
				JTnombre.setText("");
				jTFecha.setText("");

				jTId.setText(""); // se dejan en blanco las cajas de texto
				// luego de eliminar el estudiante
				JTnombre.setText("");

				try {

					Object[][] objetos = new Object[Menu.listaR.size()][5];
					for (int i = 0; i < Menu.listaR.size(); i++) {

						objetos[i][0] = Menu.listaR.get(i).getIdCarrera();
						objetos[i][1] = Menu.listaR.get(i).getNombre();
						objetos[i][2] = Menu.listaR.get(i).getFecha();
						objetos[i][3] = Menu.listaR.get(i).getNumvueltas();
						objetos[i][4] = Menu.listaR.get(i).getCircuito();

					}

					String[] nombreColumnas = { "Id Carrera", "Nombre",
							"Fecha", "Numero Vueltas", "Circuito" };

					if (tabla != null) {

						contenedor.remove(15);

					}
					tabla = new JTable(objetos, nombreColumnas);

					tabla.repaint();

					tabla.setPreferredScrollableViewportSize(new Dimension(100,
							200));

					JScrollPane scroll = new JScrollPane(tabla);
					getContentPane().add(scroll, BorderLayout.SOUTH);

					setVisible(true);

					addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {

							System.exit(0);

						}

					});
					tabla.removeRowSelectionInterval(0, 0);

				} catch (IllegalArgumentException e1) {
					JOptionPane.showMessageDialog(null, "piloto eliminado");
				}
			}
		});

		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id, nombreCa, fecha, numVueltas, circuito;
				Carrera ca = new Carrera();

				id = jTId.getText();
				nombreCa = JTnombre.getText();
				fecha = jTFecha.getText();
				numVueltas = JCNumVueltas.getSelectedItem().toString();
				circuito = JCCircuito.getSelectedItem().toString();

				ClaseCarrera ccc = new ClaseCarrera(id, nombreCa, fecha,
						numVueltas, circuito);

				ca.actualizarEs(ccc);
				Object[][] objetos = new Object[Menu.listaR.size()][5];
				for (int i = 0; i < Menu.listaR.size(); i++) {

					objetos[i][0] = Menu.listaR.get(i).getIdCarrera();
					objetos[i][1] = Menu.listaR.get(i).getNombre();
					objetos[i][2] = Menu.listaR.get(i).getFecha();
					objetos[i][3] = Menu.listaR.get(i).getNumvueltas();
					objetos[i][4] = Menu.listaR.get(i).getCircuito();

				}

				String[] nombreColumnas = { "Id Carrera", "Nombre", "Fecha",
						"Numero Vueltas", "Circuito" };

				if (tabla != null) {

					contenedor.remove(15);

				}

				tabla = new JTable(objetos, nombreColumnas);

				tabla.repaint();
				tabla
						.setPreferredScrollableViewportSize(new Dimension(900,
								300));

				JScrollPane scroll = new JScrollPane(tabla);
				getContentPane().add(scroll, BorderLayout.WEST);

				setVisible(true);

				addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {

						System.exit(0);

					}

				});

				tabla.setValueAt(ccc.getIdCarrera(), 0, 0);
				tabla.setValueAt(ccc.getFecha(), 0, 1);
				tabla.setValueAt(ccc.getNombre(), 0, 2);
				tabla.setValueAt(ccc.getNumvueltas(), 0, 3);
				tabla.setValueAt(ccc.getCircuito(), 0, 4);

				jTId.setText("");
				JTnombre.setText("");
				jTFecha.setText("");

			}
		});

	}

}
