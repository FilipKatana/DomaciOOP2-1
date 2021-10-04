package korisnici;

public abstract class Osoba {
	
	private String ime, prezime;
	
	public Osoba(String ime, String prezime) {
		this.setIme(ime);
		this.setPrezime(prezime);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
    public void ispisiPodatke() {
    	this.ispisiPodatke('\n');
    }
    
    protected void ispisiPodatke(char end) {
    	System.out.print("Ime: " + this.ime + " Prezime: " + this.prezime + end);
    }
    

}
