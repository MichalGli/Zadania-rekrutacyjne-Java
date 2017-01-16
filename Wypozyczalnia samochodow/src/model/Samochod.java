package model;

public class Samochod {
	
	//Atrybuty samochodu
	private int id_samochodu = 0;
	private String marka = "Opel";
	private String model = "Astra";
	private int rocznik = 2010;
	private String kolor = "Srebrny";
	private double cena = 99.99;
	private boolean dostepny = true;
	
	//Gettery i settery
	public int getId_samochodu() {
		return id_samochodu;
	}
	public void setId_samochodu(int id_samochodu) {
		this.id_samochodu = id_samochodu;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRocznik() {
		return rocznik;
	}
	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}
	public String getKolor() {
		return kolor;
	}
	public void setKolor(String kolor) {
		this.kolor = kolor;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public boolean isDostepny() {
		return dostepny;
	}
	public void setDostepny(boolean dostepny) {
		this.dostepny = dostepny;
	}
	
	//Konstruktory
	public Samochod() {}
	public Samochod(int id_samochodu, String marka, String model, int rocznik, String kolor, double cena, boolean dostepny) {
		
		this.id_samochodu = id_samochodu;
		this.marka = marka;
		this.model = model;
		this.rocznik = rocznik;
		this.kolor = kolor;
		this.cena = cena;
		this.dostepny = dostepny;
	}
	
	//Do bazy danych
	public String toString() {
        return "[" + id_samochodu + "] - " + marka + " - " + " - " + model + " - " + rocznik + " - " + kolor + " - " + cena + " - " + dostepny;
    }

	
	
	

}
