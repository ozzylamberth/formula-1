import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Campeonato extends JFrame {

	public void agregar(ClaseCampeonato ca) {
		Menu.listaC.add(ca);

	}

	public void iguales(ClaseCampeonato ca1) {
		int re = 0;
		for (ClaseCampeonato a : Menu.listaC) {
			if (a.getIdCampeonato().equals(ca1.getIdCampeonato())) {

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
		if (Menu.listaC.isEmpty()) {
			System.out.println("no ahi datos");
		} else {
			for (ClaseCampeonato b : Menu.listaC) {
				if (b.getIdCampeonato().equals(ca2.getIdCampeonato())) {
					a = Menu.listaC.indexOf(b);
					Menu.listaC.set(a, ca2);
					System.out
							.println("los datos se han actualizado con exito");
					JOptionPane.showMessageDialog(null,
							"los datos se han actualizado cone exito");
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
		if (Menu.listaC.isEmpty()) {
			System.out.println("no hay datos");

			// se crea un for que me recorre todo el indice de el arraylist y me
			// compara si loq ingresa el usuario es igual a algun indice del
			// arraylist muestra en pantalla los datos de ese indice
		} else {
			for (ClaseCampeonato c : Menu.listaC) {
				if (c.getIdCampeonato().equals(ad.getIdCampeonato())) {
					System.out.println(c.toString());
					oe = 1;
				}
			}

			// si no encuentra ninguno
			if (oe == 0)
				System.out.println("No Existe el Campeonato");

		}

	}

	public void eliminarEs(ClaseCampeonato asdfg) {
		int a = -1;
		if (Menu.listaC.isEmpty()) {
			System.out.println("ni hay datos");
		} else {
			for (ClaseCampeonato c : Menu.listaC) {
				if (c.getIdCampeonato().equals(asdfg.getIdCampeonato())) {
					a = Menu.listaC.indexOf(c);
					Menu.listaC.remove(a);
					System.out.println("el Campeonato ha sido eliminado");
					JOptionPane.showMessageDialog(null,
							"el campeonato ha sido eliminado");
					// aca debe hacerse el break para que no se siga comparando,
					// aqui ya se saldria definitivamente del ciclo se encuentra
					// el numero de documento
					break;

				}
			}

		}

		if (a == -1) {
			System.out.println("no existe ningun campeonato con ese id");

		}

	}

	private JTextField jTCodigo, JTnombre;
	// Estas son las variables para las eqtiquetas de las cajas de texto
	private JLabel lblCodigo, lblInombre;
	// Estas son las variables para los botones
	private JButton insertar, eliminar, actualizar, buscar;
	// private JButton insertar, eliminar, actualizar, buscar;
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

	public Campeonato() {
		// llamada a super para el nombre de la ventana
		super("Campeonato");
		// Instancio la cuadrivula
		cuadricula = new GridLayout(5, 2);
		// Asigno el contenedor
		contenedor = getContentPane();
		// al contenedor le agrego la cuadricula
		contenedor.setLayout(cuadricula);
		// Instancio la etiqueta de cliente
		lblCodigo = new JLabel("Codigo");
		// Instancio la caja de texto del cliente
		jTCodigo = new JTextField();
		// instancio la etiqueta de la fecha
		lblInombre = new JLabel("Nombre");
		// Instancio la caja de texto de la fecha
		JTnombre = new JTextField();
		// Instancio la etiqueta producto
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

		contenedor.add(lblCodigo);
		// Agrego al contenedor la caja de texto nombre
		contenedor.add(jTCodigo);
		// Agrego al contenedor la etiqueta fecha
		contenedor.add(lblInombre);
		// Agrego al contenedor la caja de texto fecha
		contenedor.add(JTnombre);
		// Agrego al contenedor la etiqqueta de producto
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

				String codigoCampeonato, nombreCampeonato;

				Campeonato ca = new Campeonato();

				codigoCampeonato = jTCodigo.getText();
				nombreCampeonato = JTnombre.getText();

				ClaseCampeonato ccc = new ClaseCampeonato(codigoCampeonato,
						nombreCampeonato);

				ca.iguales(ccc);

				jTCodigo.setText("");
				JTnombre.setText("");

			}
		});

		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String codigoCampeonato, nombreCampeonato;

				Campeonato ca = new Campeonato();

				codigoCampeonato = jTCodigo.getText();
				nombreCampeonato = JTnombre.getText();

				ClaseCampeonato ccc = new ClaseCampeonato(codigoCampeonato,
						nombreCampeonato);

				ca.eliminarEs(ccc);

				jTCodigo.setText("");
				JTnombre.setText("");

			}
		});

		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idCampeonato, nombre;
				Campeonato ca = new Campeonato();
				idCampeonato = jTCodigo.getText();
				nombre = JTnombre.getText();
				ClaseCampeonato cc = new ClaseCampeonato(idCampeonato, nombre);
				ca.buscarcampeonato(cc);

				for (ClaseCampeonato a : Menu.listaC) {

					jTCodigo.setText(String.valueOf(a.getIdCampeonato()
							.toString()));
					JTnombre.setText(String.valueOf(a.getNombreCampeonato()
							.toString()));

				}
			}
		});

		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String codigoCampeonato, nombreCampeonato;

				Campeonato ca = new Campeonato();

				codigoCampeonato = jTCodigo.getText();
				nombreCampeonato = JTnombre.getText();

				ClaseCampeonato ccc = new ClaseCampeonato(codigoCampeonato,
						nombreCampeonato);

				ca.actualizar(ccc);

				jTCodigo.setText("");
				JTnombre.setText("");

			}
		});

	}

}
