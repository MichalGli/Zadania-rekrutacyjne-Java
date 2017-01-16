package model;

public class Klient {
	
	//Atrybuty klienta
	private int id_klienta;
	private String nazwisko;
	private String imie;
	private long pesel;
	
	public Klient(){}
	public Klient(int id_klienta, String nazwisko, String imie, long pesel){
		
		this.id_klienta = id_klienta;
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.pesel = pesel;
	}
	
	//Do bazy danych
	public String toString() {
		return "[" + id_klienta + "] - " + nazwisko + " - " + " - " + imie + " - " + pesel;
	}

}
