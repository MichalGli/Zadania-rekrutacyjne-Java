package layout;

import javax.swing.*;

import java.awt.Window;
import java.awt.event.*;

public class Layout extends JFrame{
	
	private String nazwaAplikacji = "Wypożyczalnia samochodów by Jakub Wanowski";
	private JFrame window = new JFrame();
	
	//PASEK MENU
	private JMenuBar menu = new JMenuBar();
	
	//ELEMENTY PASKA MENU
	private JMenu samochodyMenu = new JMenu("Samochody");
	private JMenu klienciMenu = new JMenu("Klienci");
	private JMenu wypozyczeniaMenu = new JMenu("Wypożyczenia");
	private JMenu pomocMenu = new JMenu("Pomoc");
	
	//PODMENU ELEMENTÓW PASKA MENU
	private JMenuItem nowySamochodMenu = new JMenuItem("Dodaj samochód");
	private JMenuItem listaSamochodowMenu = new JMenuItem("Lista dostępnych samochodów");
	private JMenuItem nowyKlientMenu = new JMenuItem("Nowy klient");
	private JMenuItem listaKlientowMenu = new JMenuItem("Lista klientów");
	private JMenuItem noweWypozyczenieMenu = new JMenuItem("Wypożycz samochód");
	private JMenuItem historiaMenu = new JMenuItem("Historia");
	private JMenuItem oProgramieMenu = new JMenuItem("O programie");
	
	private String tytul = "Żadna opcja nie jest wybrana!!";
	private JPanel panel = new JPanel();

	JLabel wybranaOpcja = new JLabel(tytul);
	

	public Layout(){
		
		window.setSize(640, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setTitle(nazwaAplikacji);
		
		window.setJMenuBar(menu);
		menu.add(samochodyMenu);	// Musi być przed setVisible()
		menu.add(klienciMenu);
		menu.add(wypozyczeniaMenu);
		menu.add(pomocMenu);
		
		
		
		window.add(panel);
		panel.add(wybranaOpcja);
		
		
		window.setVisible(true);
		
		samochodyMenu.add(nowySamochodMenu);	// Nie musi stać przed setVisible()
		NowySamochod nowySamochodListener = new NowySamochod();
		nowySamochodMenu.addActionListener(nowySamochodListener);
		
		samochodyMenu.add(listaSamochodowMenu);
		ListaSamochodow listaSamochodowListener = new ListaSamochodow();
		listaSamochodowMenu.addActionListener(listaSamochodowListener);
		
		klienciMenu.add(nowyKlientMenu);
		NowyKlient nowyKlientListener = new NowyKlient();
		nowyKlientMenu.addActionListener(listaSamochodowListener);
		
		klienciMenu.add(listaKlientowMenu);
		ListaKlientow listaKlientowListener = new ListaKlientow();
		listaKlientowMenu.addActionListener(listaKlientowListener);
		
		wypozyczeniaMenu.add(noweWypozyczenieMenu);
		NoweWypozyczenie noweWypozyczenieListener = new NoweWypozyczenie();
		noweWypozyczenieMenu.addActionListener(noweWypozyczenieListener);
		
		wypozyczeniaMenu.add(historiaMenu);
		HistoriaWypozyczen historiaWypozyczenListener = new HistoriaWypozyczen();
		historiaMenu.addActionListener(historiaWypozyczenListener);
		
		pomocMenu.add(oProgramieMenu);
		OProgramie oProgramieListener = new OProgramie();
		oProgramieMenu.addActionListener(oProgramieListener);
		
		//Tylko do testów
		window.setAlwaysOnTop(true);
		
		
	}//End of Layout()
	
	
	
	class NowySamochod implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na nowySamochodPanel
			
			System.exit(0);
		}
		
	}//End of NowySamochod
	
	class ListaSamochodow implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na listaSamochodowPanel
			System.exit(0);
			
		}
		
	}//End of ListaSamochodow
		
	class NowyKlient implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na nowyKlientPanel
			System.exit(0);
			
		}
		
	}//End of NowyKlient
	
	class ListaKlientow implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na listaKlientowPanel
			System.exit(0);
			
		}
		
	}//End of ListaKlientow		
		
	class NoweWypozyczenie implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na noweWypozyczeniePanel
			System.exit(0);
			
		}
		
	}//End of NoweWypozyczenie
	
	class HistoriaWypozyczen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na HistoriaWypozyczenPanel
			System.exit(0);
			
		}
		
	}//End of HistoriaWypozyczen		
	
	class OProgramie implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Podmienia cały panel na OProgramiePanel
			System.exit(0);
			
		}
		
	}//End of OProgramie	
	

}//End of Layout class



