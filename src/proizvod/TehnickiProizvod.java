package proizvod;

import kategorija.Kategorija;

public abstract class TehnickiProizvod {
	private Kategorija kategorija;
	private String marka;
	private String model;
	private double cena = 0.1;
	
	public TehnickiProizvod(Kategorija kategorija, String marka, String model, double cena) {
		this.kategorija = kategorija;
		this.marka = marka;
		this.model = model;
		this.setCena(cena);
	}

	public double getCena() {
		return cena;
	}

	public boolean setCena(double cena) {
		if (cena > 0) {
			this.cena = cena;
			return true;
		}
		
		return false;
	}

	public String getMarka() {
		return marka;
	}

	public Kategorija getKategorija() {
		return kategorija;
	}

	public String getModel() {
		return model;
	}
	
	protected void ispisiPodatke(String pro) {
		System.out.print(pro + " " + this.marka + " " + this.model + " po ceni: " + this.cena + " ");
	}
	
	/*
	public void ispisiPodatke() {
		System.out.print("Proizvod " + this.marka + " " + this.model + " po ceni: " + this.cena + " ");
	}
	*/
	

	public abstract void ispisiPodatke();
	
	

}
