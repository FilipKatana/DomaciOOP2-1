package korisnici;

public class Zaposleni extends Osoba {
	
	private String sifraZaposlenog;

	public Zaposleni(String ime, String prezime, String sifraZaposlenog) {
		super(ime, prezime);
		this.sifraZaposlenog = sifraZaposlenog;
		
	}

	public String getSifraZaposlenog() {
		return sifraZaposlenog;
	}
	
	public void ispisiPodatke() {
		this.ispisiPodatke(' ');
		System.out.println("Šifra: " + this.sifraZaposlenog);
	}

}
