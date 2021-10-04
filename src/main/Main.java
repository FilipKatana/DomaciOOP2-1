package main;

import java.util.ArrayList;
import java.util.Collection;

import kategorija.Kategorija;
import korisnici.Prodavac;
import korisnici.Zaposleni;
import prodavnica.Prodavnica;
import proizvod.Sporet;
import proizvod.TehnickiProizvod;
import proizvod.Televizor;
import racun.Racun;

public class Main {

	public static void main(String[] args) {
		Kategorija kat = new Kategorija("Tehnologija", "AABBAA");
		
		Collection<Zaposleni> kolekcijaZaposlenih = new ArrayList<Zaposleni>();
		Collection<TehnickiProizvod> kolekcijaProizvoda = new ArrayList<TehnickiProizvod>();
		Collection<Racun> kolekcijaRacuna = new ArrayList<Racun>();
		
		kolekcijaZaposlenih.add(new Zaposleni("Marina", "Marijanović", "667b"));
		kolekcijaZaposlenih.add(new Prodavac("Slavko", "Jeličić", "228o"));
		
		kolekcijaProizvoda.add(new Televizor(kat, "Philips", "Watch Mate 500", 500.6, 4.5));
		kolekcijaProizvoda.add(new Sporet(kat, "Siemens", "Coocking Pro", 1000.2, 3, true, 5, 6, 7));
		
		
		Prodavnica prodavnica = new Prodavnica();
		
		for (Zaposleni z : kolekcijaZaposlenih) {
			prodavnica.dodajZaposlenog(z);
		}
		
		for (TehnickiProizvod teh : kolekcijaProizvoda) {
			prodavnica.dodajProizvod(teh);
		}
		
		prodavnica.ispisiPodatke();
		
		
		kolekcijaRacuna.add(prodavnica.kreirajRacun(1, kolekcijaProizvoda));
		((ArrayList<Racun>) kolekcijaRacuna).get(0).ispisiPodatke();
		
		System.out.println("ISPIS PROMENE CENE");
		((ArrayList<TehnickiProizvod>) kolekcijaProizvoda).get(0).setCena(20.5);
		((ArrayList<TehnickiProizvod>) kolekcijaProizvoda).get(0).ispisiPodatke();
		
		

	}

}
