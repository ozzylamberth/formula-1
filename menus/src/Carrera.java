import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Carrera  extends JFrame{
	
	
	public void agregar(ClaseCarrera cl) {

		Menu.listaR.add(cl);
	}
	
	        
	public void iguales(ClaseCarrera as) {
		int re = 0;
		for (ClaseCarrera p : Menu.listaR) {
			if (p.getIdCarrera().equals(as.getIdCarrera())) {
				System.out
						.println("Ya Existe una Carrera con el mismo Codigo");
				JOptionPane.showMessageDialog(null,
				"Ya Existe una Carrera con el mismo Codigo");
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
				System.out.println("No Existe la Carrera");
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
							.println("La Carrera se ha Actualizado don Exito");
					JOptionPane.showMessageDialog(null,
							"La Carrera se ha Actualizado don Exito");
				} else {
					System.out
							.println("No existe ninguna Carrera con ese Codigo ");
					JOptionPane.showMessageDialog(null,
							"los datos se han actualizado con exito");
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
	
	
	JLabel lbcodigo, lbnombre,lbnumvueltas,lbcircuito,lbfecha;
	JTextField jtcodigo,jtfecha,jtnombre;
	JComboBox comnumvueltas,comcircuito;
	JButton btnagregar, btnbuscar,btnactualizar,btneliminar;
	JPanel panelNorte, contenedor, panelcentro, panelsur, paneloeste,
			paneleste;
	JTable tabla;
	public Carrera(){
		super("crear carrera");
		String combonumvueltas[] = { "1", "2", "3", "4","5","6","7","8","9","10"};
		String combocircuito[] = {"Circuito internacional de barein", "Circuito Callejero de adelaida", "Circutio de charade", "Circuto de bavista"};
		
		tabla = new JTable();
		tabla.setPreferredScrollableViewportSize(new Dimension(200, 100));
		// Creatamos un contenedor para la Tabla
		JScrollPane scrollPane = new JScrollPane(tabla);
		// Agregamos nuestra tabla al contenedor
		getContentPane().add(scrollPane, BorderLayout.SOUTH);
		contenedor = new JPanel();
		panelNorte = new JPanel();
		panelsur = new JPanel();
		panelcentro = new JPanel();
		paneleste = new JPanel();
		paneloeste = new JPanel();

		lbcodigo = new JLabel("Codigo Carrera");
		jtcodigo = new JTextField(20);
		btnagregar = new JButton("Guardar Carrera");

		lbfecha = new JLabel("Fecha Carrera");
		jtfecha = new JTextField();
		btnbuscar = new JButton("Buscar Carrera");
		
		lbnombre = new JLabel("Nombre Campeonato");
		jtnombre = new JTextField();
		btnactualizar = new JButton("Actualizar Carrera");
		
		lbnumvueltas = new JLabel("Numero de vueltas");
		comnumvueltas = new JComboBox(combonumvueltas);
		btneliminar = new JButton("Eliminar");
		
		lbcircuito = new JLabel("Circuito");
		comcircuito = new JComboBox(combocircuito);

		contenedor.setLayout(new BorderLayout());
		panelcentro.setLayout(new GridLayout(7, 2, 30, 30));

		// agrega todos los componentes al panel del centro
		panelcentro.add(lbcodigo);
		panelcentro.add(jtcodigo);
		panelcentro.add(lbfecha);
		panelcentro.add(jtfecha);
		panelcentro.add(lbnombre);
		panelcentro.add(jtnombre);
		panelcentro.add(lbnumvueltas);
		panelcentro.add(comnumvueltas);
		panelcentro.add(lbcircuito);
		panelcentro.add(comcircuito);
		panelcentro.add(btnagregar);
		panelcentro.add(btnbuscar);
		panelcentro.add(btnactualizar);
		panelcentro.add(btneliminar);
		

	btnagregar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			
				String codigo, fecha, nombre,numVueltas,circuito;
				Carrera ca = new Carrera();

				codigo = jtcodigo.getText();
				fecha = jtfecha.getText();
				nombre = jtnombre.getText();
				numVueltas = comnumvueltas.getSelectedItem().toString();
				circuito = comcircuito.getSelectedItem().toString();

				ClaseCarrera ccc = new ClaseCarrera(codigo, fecha,
						nombre, numVueltas,circuito);

				ca.iguales(ccc);

				jtcodigo.setText("");
				jtfecha.setText("");
				jtnombre.setText("");

			}
		});

		
	btnbuscar.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		
			String codigo;
			Carrera ca = new Carrera();

			codigo = jtcodigo.getText();
			

			ClaseCarrera ccc = new ClaseCarrera(codigo, "",
					"", "","");

			ca.buscarE(ccc);
			

			for (ClaseCarrera a : Menu.listaR) {
				jtfecha.setText(String
						.valueOf(a.getFecha().toString()));
				jtnombre.setText(String.valueOf(a.getNombre()
						.toString()));
				comnumvueltas.setSelectedItem(String.valueOf(a.getNumvueltas().toString()));
				comcircuito.setSelectedItem(String.valueOf(a.getCircuito().toString()));
				//comcircuito.setSelectedItem(a.getCircuito().toString());

			}

		}
	});
	
	btnactualizar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String codigo, fecha, nombre,numVueltas,circuito;
			Carrera ca = new Carrera();

			codigo = jtcodigo.getText();
			fecha = jtfecha.getText();
			nombre = jtnombre.getText();
			numVueltas = comnumvueltas.getSelectedItem().toString();
			circuito = comcircuito.getSelectedItem().toString();

			ClaseCarrera ccc = new ClaseCarrera(codigo, fecha,
					nombre, numVueltas,circuito);

			ca.actualizarEs(ccc);

			jtcodigo.setText("");
			jtfecha.setText("");
			jtnombre.setText("");

		}
	});
	
	btneliminar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String codigo, fecha, nombre,numVueltas,circuito;
			Carrera ca = new Carrera();

			codigo = jtcodigo.getText();
			fecha = jtfecha.getText();
			nombre = jtnombre.getText();
			numVueltas = comnumvueltas.getSelectedItem().toString();
			circuito = comcircuito.getSelectedItem().toString();

			ClaseCarrera ccc = new ClaseCarrera(codigo, fecha,
					nombre, numVueltas,circuito);

			ca.eliminarEs(ccc);

			jtcodigo.setText("");
			jtfecha.setText("");
			jtnombre.setText("");
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
	public static void main(String[] args) {
		Carrera p = new Carrera();
		p.setVisible(true);
		p.setSize(600, 500);
		p.setResizable(false);
	}



		
		
	}


