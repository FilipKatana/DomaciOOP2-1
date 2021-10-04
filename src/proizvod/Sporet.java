package proizvod;

import kategorija.Kategorija;

public class Sporet extends TehnickiProizvod {
	
	private int brojRingli = 2;
	private boolean imaRernu;
	private double duzina = 1, sirina = 1, visina = 1;
	

	public Sporet(Kategorija kategorija, String marka, String model, double cena, int brojRingli, boolean imaRernu, double duzina,
			double sirina, double visina) {
		
		super(kategorija, marka, model, cena);
		
		if (brojRingli >= 2) {
			this.brojRingli = brojRingli;
		}
		
		if (sirina > 0) {
			this.sirina = sirina;
		}
		
		if (duzina > 0) {
			this.duzina = duzina;
		}
		
		if (visina > 0) {
			this.visina = visina;
		}
		
		this.imaRernu = imaRernu;
		
	}


	public int getBrojRingli() {
		return brojRingli;
	}


	public boolean isImaRernu() {
		return imaRernu;
	}


	public double getDuzina() {
		return duzina;
	}


	public double getVisina() {
		return visina;
	}


	public double getSirina() {
		return sirina;
	}
	
	
	public void ispisiPodatke() {
		this.ispisiPodatke("Šporet");
		System.out.println(((this.imaRernu) ? "sa rernom" : "bez rerne") + " i " + this.brojRingli + " ringle " + this.duzina + "x" +
		this.sirina + "x" + this.visina);
	}

}
