package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.Bibliotekainterfejs;

public class Biblioteka implements Bibliotekainterfejs {
	private LinkedList<Knjiga> knjige= new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		if(k== null){
			throw new RuntimeException("Knjiga je null");
		}
		knjige.add(k);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if(k== null){
			throw new RuntimeException("Knjiga je null");
		}
		knjige.remove(k);
		
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
if(naslov==null || autor== null || isbn==0 || izdavac==null){
			throw new RuntimeException("Morate uneti neki kriterijum");

		}
		LinkedList<Knjiga> rezultati= new LinkedList<Knjiga>();
		
		for(int i=0; i<knjige.size(); i++){
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultati.add(knjige.get(i));
			}
		}
		
		return rezultati;
	}
	

}
