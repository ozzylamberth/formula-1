import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

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
				JOptionPane
						.showMessageDialog(null,
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

	// Estas son las variables para las cajas de texto
	String[] listaEscuderias = { "Ferrari", "McLaren Park", "Sauber",
			"Honda", "Toyota", "USF1" };
	private JTextField jTIdentificacion, JTnombre, jTEscuderia, jTLicencia;
	// Estas son las variables para las eqtiquetas de las cajas de texto
	private JComboBox JcnumEscuderia;
	private JLabel lblIdentificacion, lblInombre, lblEscuderia, lblLicencia;
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

	public Piloto() {
		
		
		// llamada a super para el nombre de la ventana
		super("Facturacion");
		
		
		
		
		// Instancio la cuadrivula
		cuadricula = new GridLayout(11, 8);
		// Asigno el contenedor
		contenedor = getContentPane();
		// al contenedor le agrego la cuadricula
		contenedor.setLayout(cuadricula);
		// Instancio la etiqueta de cliente
		lblIdentificacion = new JLabel("Identificacion");
		// Instancio la caja de texto del cliente
		jTIdentificacion = new JTextField();
		// instancio la etiqueta de la fecha
		lblInombre = new JLabel("Nombre");
		// Instancio la caja de texto de la fecha
		JTnombre = new JTextField();
		// Instancio la etiqueta producto
		lblEscuderia = new JLabel("Escuderia");
		// Instancio la caja de texto del producto
		JcnumEscuderia = new JComboBox(listaEscuderias);
		// Instancio la etiqueta de la descripcion
		lblLicencia = new JLabel("Numero de licencia");
		// Instancio la caja de texto de la descripcion
		jTLicencia = new JTextField();

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
		contenedor.add(jTIdentificacion);
		// Agrego al contenedor la etiqueta fecha
		contenedor.add(lblInombre);
		// Agrego al contenedor la caja de texto fecha
		contenedor.add(JTnombre);
		// Agrego al contenedor la etiqqueta de producto
		contenedor.add(lblEscuderia);
		// agrego al contenedor la caja de texto producto
		contenedor.add(JcnumEscuderia);
		// Agrego al contenedor la etiqueta descripcion
		contenedor.add(lblLicencia);
		// Agrego al contenedor la caja de texto
		contenedor.add(jTLicencia);
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

				String idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();

				idpiloto = jTIdentificacion.getText();
				nombrepiloto = JTnombre.getText();
				escuderia = JcnumEscuderia.getSelectedItem().toString();
				licencia = jTLicencia.getText();

				ClasePiloto ccc = new ClasePiloto(idpiloto, nombrepiloto,
						escuderia, licencia);

				ca.iguales(ccc);

				jTIdentificacion.setText("");
				JTnombre.setText("");
				//JcnumEscuderia
				jTLicencia.setText("");

				if (tabla != null) {
					contenedor.remove(13);

				}

				Object[][] objetos = new Object[Menu.listaP.size()][4];
				for (int i = 0; i < Menu.listaP.size(); i++) {

					objetos[i][0] = Menu.listaP.get(i).getIdentificacion();
					objetos[i][1] = Menu.listaP.get(i).getNombrePiloto();
					objetos[i][2] = Menu.listaP.get(i).getEscuderia();
					objetos[i][3] = Menu.listaP.get(i).getLicencia();

				}

				String[] nombreColumnas = { "Identificacion", "Nombre",
						"Escuderia", "Licencia" };

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
				String idpiloto;
				Piloto ca = new Piloto();
				idpiloto = jTIdentificacion.getText();
				ClasePiloto cc = new ClasePiloto(idpiloto, "", "", "");
				ca.buscarE(cc);

				for (ClasePiloto a : Menu.listaP) {
					JTnombre.setText(String.valueOf(a.getNombrePiloto()
							.toString()));
					JcnumEscuderia.setSelectedItem(String.valueOf(a.getEscuderia()
							.toString()));
					jTLicencia.setText(String.valueOf(a.getLicencia()
							.toString()));

				}
			}
		});

		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();

				idpiloto = jTIdentificacion.getText();
				nombrepiloto = JTnombre.getText();
				escuderia = JcnumEscuderia.getSelectedItem().toString();
				licencia = jTLicencia.getText();

				ClasePiloto ccc = new ClasePiloto(idpiloto, nombrepiloto,
						escuderia, licencia);
				ca.eliminarEs(ccc);

				jTIdentificacion.setText(""); // se dejan en blanco las cajas de
				// texto
				// luego de eliminar el estudiante
				JTnombre.setText("");
			//	JcnumEscuderia.setText("");
				jTLicencia.setText("");
				try {

					Object[][] objetos = new Object[Menu.listaP.size()][4];
					for (int i = 0; i < Menu.listaP.size(); i++) {

						objetos[i][0] = Menu.listaP.get(i).getIdentificacion();
						objetos[i][1] = Menu.listaP.get(i).getNombrePiloto();
						objetos[i][2] = Menu.listaP.get(i).getEscuderia();
						objetos[i][3] = Menu.listaP.get(i).getLicencia();

					}

					String[] nombreColumnas = { "Identificacion", "Nombre",
							"Escuderia", "Licencia" };

					if (tabla != null) {

						contenedor.remove(13);

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
				String idpiloto;
				String nombrepiloto, escuderia, licencia;
				Piloto ca = new Piloto();

				idpiloto = jTIdentificacion.getText();
				nombrepiloto = JTnombre.getText();
				escuderia = JcnumEscuderia.getSelectedItem().toString();
				licencia = jTLicencia.getText();

				ClasePiloto ccc = new ClasePiloto(idpiloto, nombrepiloto,
						escuderia, licencia);
				ca.actualizarEs(ccc);

				Object[][] objetos = new Object[Menu.listaP.size()][4];
				for (int i = 0; i < Menu.listaP.size(); i++) {

					objetos[i][0] = Menu.listaP.get(i).getIdentificacion();
					objetos[i][1] = Menu.listaP.get(i).getNombrePiloto();
					objetos[i][2] = Menu.listaP.get(i).getEscuderia();
					objetos[i][3] = Menu.listaP.get(i).getLicencia();

				}
				String[] nombreColumnas = { "Identificacion", "Nombre",
						"Escuderia", "Licencia" };
				if (tabla != null) {

					contenedor.remove(13);

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

				tabla.setValueAt(ccc.getIdentificacion(), 0, 0);
				tabla.setValueAt(ccc.getNombrePiloto(), 0, 1);
				tabla.setValueAt(ccc.getEscuderia(), 0, 2);
				tabla.setValueAt(ccc.getLicencia(), 0, 3);

				JTnombre.setText("");
				jTEscuderia.setText("");
				jTLicencia.setText("");

			}
		});

	}

}
