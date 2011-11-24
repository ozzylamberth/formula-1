import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
	public Menu() {

		super("Formulario formula 1");
		//creo la barra donde iran todos los menus
		JMenuBar barra = new JMenuBar();
		//creo los menus dentro de la barra
		JMenu menu1 = new JMenu("Campeonato");
		JMenu menu2 = new JMenu("Piloto");
		JMenu menu5 = new JMenu("Carrera");
		JMenu menu3 = new JMenu("Resultados");
		
		//le agrego a la barra los menus 
		barra.add(menu1);
		barra.add(menu3);
		barra.add(menu2);
		barra.add(menu5);
		// cre el item q ira dentro del jmenu crear campeonato
		JMenuItem crearcamp = new JMenuItem("crear campeonato ");
		
		
			
		//le agrego a el menu de crear campeonato el item crear campeonato 
		menu1.add(crearcamp);
		crearcamp.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en elementoSalir
					@Override
					public void actionPerformed(ActionEvent evento) {
						Campeonato formulario = new Campeonato();
						formulario.setSize(600, 400);
						formulario.setVisible(true);
						}
				} // fin de la clase interna anónima

		); // fin de la llamada a addActionListener

		JMenuItem crearpiloto = new JMenuItem("crar piloto");
		menu2.add(crearpiloto);

		crearpiloto.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en elementoSalir
					@Override
					public void actionPerformed(ActionEvent evento) {
						Piloto formulario = new Piloto();
						formulario.setSize(350, 400);
						formulario.setVisible(true);
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		


		JMenuItem crearcarrera = new JMenuItem("crear carrera");
		menu5.add(crearcarrera);

		crearcarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				Carrera formulario = new Carrera();
				formulario.setSize(600, 400);
				formulario.setVisible(true);
			}
		});
		
		JMenuItem iniciarCarrera = new JMenuItem("Iniciar Carrera");
		menu5.add(iniciarCarrera);

		crearcarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				
			}
		});
		JMenuItem resul = new JMenuItem("resultados ");
		menu3.add(resul);
		resul.addActionListener(

				new ActionListener() { // clase interna anónima

							// terminar la aplicación cuando el usuario haga clic en elementoSalir
							@Override
							public void actionPerformed(ActionEvent evento) {
								Resultados re = new Resultados();
								re.setSize(600, 400);
								re.setVisible(true);
								}
						} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener


		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setSize(400, 300);
		setVisible(true);
		setJMenuBar(barra);

		setLocationRelativeTo(null);
		// esto es para al darle click a alguno de los items decirle q hacer

	}

	public static void main(String args[]) {
		Menu Eje = new Menu();
		Eje.setSize(400, 300);
		Eje.setVisible(true);
	}

}
