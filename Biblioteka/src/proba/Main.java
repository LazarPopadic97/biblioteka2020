package proba;

import java.util.LinkedList;
import java.util.List;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {

	public static void main(String[] args) {
		Knjiga knjiga1=new Knjiga();
		Autor autor11=new Autor();
		Autor autor12=new Autor();
		autor11.setIme("Predrag");
		autor11.setPrezime("Brkic");
		autor12.setIme("Maja");
		autor12.setPrezime("Karlo");
		LinkedList<Autor> autori1=new LinkedList<Autor>();
		autori1.add(autor11);
		autori1.add(autor12);
		knjiga1.setAutori(autori1);
		knjiga1.setIsbn("00000001");
		knjiga1.setIzdanje(2003);
		knjiga1.setIzdavac("Vulkan");
		knjiga1.setNaslov("Matematika");
		
		
		Knjiga knjiga2=new Knjiga();
		Autor autor21=new Autor();
		autor21.setIme("Mesa");
		autor21.setPrezime("Selimovic");
		LinkedList<Autor> autori2=new LinkedList<Autor>();
		autori2.add(autor21);
		knjiga2.setAutori(autori2);
		knjiga2.setIsbn("00000002");
		knjiga2.setIzdanje(2002);
		knjiga2.setIzdavac("Delfi");
		knjiga2.setNaslov("Tvrdjava");
		
		Biblioteka b=new Biblioteka();
		b.dodajKnjigu(knjiga1);
		b.dodajKnjigu(knjiga2);
		
		Biblioteka b1=new Biblioteka();
		b.prebaciUJson("biblioteka.json");
		b1.prebaciIzJsona("biblioteka.json");
		

	}

}
