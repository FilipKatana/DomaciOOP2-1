package prodavnica;

import java.util.ArrayList;
import java.util.Collection;

import korisnici.Prodavac;
import korisnici.Zaposleni;
import proizvod.TehnickiProizvod;
import racun.Racun;

public class Prodavnica {
	private Collection<TehnickiProizvod> dostupniProizvodi;
	private Collection<Zaposleni> listaZaposlenih;
	
	public Prodavnica() {
		this.dostupniProizvodi = new ArrayList<TehnickiProizvod>();
		this.listaZaposlenih = new ArrayList<Zaposleni>();
	}
	
	public void dodajProizvod(TehnickiProizvod t) {
		this.dostupniProizvodi.add(t);
	}
	
	public boolean ukloniProizvod(int index) {
		if (index < 0 || index >= this.dostupniProizvodi.size()) {
			return false;
		}
		((ArrayList<TehnickiProizvod>) this.dostupniProizvodi).remove(index);
		return true;
	}
	
	public void dodajZaposlenog(Zaposleni z) {
		this.listaZaposlenih.add(z);
	}
	
	public boolean ukloniZaposlenog(int index) {
		if (index < 0 || index >= this.listaZaposlenih.size()) {
			return false;
		}
		((ArrayList<Zaposleni>) this.listaZaposlenih).remove(index);
		return true;
	}
	
	public void ispisiPodatke() {
		System.out.println("-------------------PRODAVNICA-----------------");
		
		System.out.println("DOSTUPNI PROIZVODI:");
		for (int i = 0; i < this.dostupniProizvodi.size(); ++i) {
			System.out.print((i+1) + ". ");
			((ArrayList<TehnickiProizvod>) this.dostupniProizvodi).get(i).ispisiPodatke();
		}
		
		System.out.println("LISTA ZAPOSLENIH:");
		for (int i = 0; i < this.listaZaposlenih.size(); ++i) {
			System.out.print((i+1) + ". ");
			((ArrayList<Zaposleni>) this.listaZaposlenih).get(i).ispisiPodatke();
		}
		
	}
	
	public Zaposleni getZaposleni(int index) {
		if (index < 0 || index >= this.listaZaposlenih.size()) {
			throw new IndexOutOfBoundsException("Prosleđen index nije validan za broj zaposlenih! Broj zaposlenih je " + 
		this.listaZaposlenih.size() + " a prosleđen index je " + index);
		}
		return ((ArrayList<Zaposleni>) this.listaZaposlenih).get(index);
	}
	
	public TehnickiProizvod getProizvod(int index) {
		if (index < 0 || index >= this.dostupniProizvodi.size()) {
			throw new IndexOutOfBoundsException("Prosleđen index nije validan za dostupne proizvode! Broj proizvoda je " + 
		this.dostupniProizvodi.size() + " a prosleđen index je " + index);
		}
		return ((ArrayList<TehnickiProizvod>) this.dostupniProizvodi).get(index);
	}
	
	public Racun kreirajRacun(int indexP, Collection<TehnickiProizvod> proizvodi) {
		Prodavac p;
		try {
			p = (Prodavac) this.getZaposleni(indexP);
		} catch (ClassCastException c) {
			throw new IllegalArgumentException("Greška pri kreiranju računa u prodavnici! Prosleđeni indeks nije indeks prodavca.");
		}
		
		for (TehnickiProizvod teh : proizvodi) {
			if (!((ArrayList<TehnickiProizvod>) this.dostupniProizvodi).contains(teh)) {
				throw new IllegalArgumentException("Greška pri kreiranju računa u prodavnici! Jedan ili više od prosleđenih proizvoda ne pripadaju prodavnici!");
			}
		}
		
		return new Racun(p, proizvodi);
	}
}
