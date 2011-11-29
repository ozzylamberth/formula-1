import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class Tabla extends JFrame {

	public Tabla() {
		super("Pilotos");

		MyTableModel myModel = new MyTableModel();
		JTable table = new JTable(myModel);

		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		// Creatamos un contenedor para la Tabla
		JScrollPane scrollPane = new JScrollPane(table);
		// Agregamos nuestra tabla al contenedor
		getContentPane().add(scrollPane, BorderLayout.CENTER);

	}

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
}
