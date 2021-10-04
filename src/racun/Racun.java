package racun;

import java.util.ArrayList;
import java.util.Collection;


import korisnici.Prodavac;
import proizvod.TehnickiProizvod;

public class Racun {
	private Prodavac prodavac;
	private Collection<TehnickiProizvod> proizvodi;
	
	public Racun(Prodavac p) {
		this.prodavac = p;
		this.proizvodi = new ArrayList<TehnickiProizvod>();
	}
	
	public Racun(Collection<TehnickiProizvod> pr) {
		this.proizvodi = pr;
	}
	
	public Racun(Prodavac p, Collection<TehnickiProizvod> pr) {
		this.prodavac = p;
		this.proizvodi = pr;
		
	}
	
	public void dodajProizvod(TehnickiProizvod t) {
		this.proizvodi.add(t);
	}
	
	public boolean ukloniProizvod(int index) {
		if (index < 0 || index >= this.proizvodi.size()) {
			return false;
		}
		((ArrayList<TehnickiProizvod>) this.proizvodi).remove(index);
		return true;
	}
	

	public TehnickiProizvod getProizvod(int index) {
		if (index < 0 || index >= this.proizvodi.size()) {
			throw new IndexOutOfBoundsException("Greška pri dobavljanju proizvoda. Na računu ima " + this.proizvodi.size() +
					" proizvoda, a prosleđen index je " + index);
		}
		
		return ((ArrayList<TehnickiProizvod>) this.proizvodi).get(index);
	}
	
	public double cena() {
		double cena = 0.0;
		
		for (TehnickiProizvod t : this.proizvodi) {
			cena += t.getCena();
		}
		
		/*
		for (int i = 0; i < this.proizvodi.size(); ++i) {
			cena += ((ArrayList<TehnickiProizvod>) this.proizvodi).get(i).getCena();
		}
		*/
		
		return cena;
	}
	
	
	public void ispisiPodatke() {
		System.out.println("---------------------RAČUN-----------------------");
		for (int i = 0; i < this.proizvodi.size(); ++i) {
			System.out.print((i+1) + ". ");
			((ArrayList<TehnickiProizvod>) this.proizvodi).get(i).ispisiPodatke();
		}
		System.out.println("Ukupna cena: " + this.cena());
		System.out.println("Prodavac: " + this.prodavac.getIme() + " " + this.prodavac.getPrezime());
	}
	
	

}
