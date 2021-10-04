package kategorija;

public class Kategorija {
	private String naziv;
	private String sifra;
	
	public Kategorija(String naziv, String sifra) {
		this.setNaziv(naziv);
		this.setSifra(sifra);
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public void ispisiPodatke() {
		System.out.println("Naziv: " + this.naziv + " Šifra: " + this.sifra);
	}

}
