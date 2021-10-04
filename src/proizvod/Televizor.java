package proizvod;

import kategorija.Kategorija;

public class Televizor extends TehnickiProizvod {
	
	private double dijagonala = 1.5;

	public Televizor(Kategorija kategorija, String marka, String model, double cena, double dijagonala) {
		super(kategorija, marka, model, cena);
		this.setDijagonala(dijagonala);
	}

	public double getDijagonala() {
		return dijagonala;
	}

	public boolean setDijagonala(double dijagonala) {
		if (dijagonala > 0) {
			this.dijagonala = dijagonala;
			return true;
		}
		return false;
		
	}
	
	public void ispisiPodatke() {
		this.ispisiPodatke("Televizor");
		System.out.println("i dijagonalom od " + this.dijagonala);
	}

}
