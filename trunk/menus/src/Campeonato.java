import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.AbstractTableModel;

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

	private JTextField jTCodigo, JTnombre;
	// Estas son las variables para las eqtiquetas de las cajas de texto
	private JLabel lblCodigo, lblInombre;
	// Estas son las variables para los botones
	private JButton insertar;
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
		cuadricula = new GridLayout(6, 2);
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

		contenedor.add(lblCodigo);
		// Agrego al contenedor la caja de texto nombre
		contenedor.add(jTCodigo);
		// Agrego al contenedor la etiqueta fecha
		contenedor.add(lblInombre);
		// Agrego al contenedor la caja de texto fecha
		contenedor.add(JTnombre);
		// Agrego al contenedor la etiqqueta de producto
		contenedor.add(insertar);
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

		class MyTableModel extends AbstractTableModel {
			final String[] name = { "Identificacion", "Nombre", "Escuderia",
					"Licencia", "Seleccionado" };

			Object[][] objects = new Object[Menu.listaP.size()][5];
			{

				for (int i = 0; i < Menu.listaP.size(); i++) {
					objects[i][0] = Menu.listaP.get(i).getIdentificacion();
					objects[i][1] = Menu.listaP.get(i).getNombrePiloto();
					objects[i][2] = Menu.listaP.get(i).getEscuderia();
					objects[i][3] = Menu.listaP.get(i).getLicencia();
					objects[i][4] = new Boolean(false);

				}
			}

			// únicamente retornamos el numero de elementos del
			// array de los nombres de las columnas
			public int getColumnCount() {
				return name.length;
			}

			public String getColumnName(int column) {
				return name[column];
			}

			public int getRowCount() {
				return objects.length;
			}

			public Object getValueAt(int row, int column) {
				return objects[row][column];
			}

			public Class getColumnClass(int column) {
				return (getValueAt(0, column).getClass());
			}

			public void setValueAt(Object value, int row, int column) {
				objects[row][column] = value;
			}

			public boolean isCellEditable(int row, int column) {
				return (column != 5);
			}
			
		}
		
		
		final MyTableModel myModel = new MyTableModel();
		JTable table = new JTable(myModel);
	
		
		// Creatamos un contenedor para la Tabla
		JScrollPane scrollPane = new JScrollPane(table);
		// Agregamos nuestra tabla al contenedor
		getContentPane().add(scrollPane, BorderLayout.SOUTH);

	
		
	
	       table.setVisible(true);


		class MyTableModelCarrera extends AbstractTableModel {

			final String[] name = { "Codigo", "Fecha", "Campeonato", "Vueltas",
					"Circuito", "Seleccionado" };

			Object[][] objects = new Object[Menu.listaR.size()][6];
			{

				for (int i = 0; i < Menu.listaR.size(); i++) {
					objects[i][0] = Menu.listaR.get(i).getIdCarrera();
					objects[i][1] = Menu.listaR.get(i).getFecha();
					objects[i][2] = Menu.listaR.get(i).getNombre();
					objects[i][3] = Menu.listaR.get(i).getNumvueltas();
					objects[i][4] = Menu.listaR.get(i).getCircuito();
					objects[i][5] = new Boolean(false);

				}
			}

			// únicamente retornamos el numero de elementos del
			// array de los nombres de las columnas
			public int getColumnCount() {
				return name.length;
			}

			public String getColumnName(int column) {
				return name[column];
			}

			public int getRowCount() {
				return objects.length;
			}

			public Object getValueAt(int row, int column) {
				return objects[row][column];
			}

			public Class getColumnClass(int column) {
				return (getValueAt(0, column).getClass());
			}

			public void setValueAt(Object value, int row, int column) {
				objects[row][column] = value;
			}

			public boolean isCellEditable(int row, int column) {
				return (column != 6);
			}

		}

		MyTableModelCarrera myMod = new MyTableModelCarrera();

		JTable tablaCarrera = new JTable(myMod);
		
		tablaCarrera.setPreferredScrollableViewportSize(new Dimension(500, 70));

		JScrollPane scrollPane2 = new JScrollPane(tablaCarrera);

		getContentPane().add(scrollPane2, BorderLayout.CENTER);

		tablaCarrera.setVisible(true);

	}
}
