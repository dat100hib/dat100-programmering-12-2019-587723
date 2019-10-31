package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] samling;
	private int nesteLedig = 0;
	
	

	public Blogg() {
		this(20);					
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];			
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (samling[i].erLik(innlegg)) return i;	
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1; 
	}

	public boolean ledigPlass() {
		return nesteLedig <= samling.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {
     if(!ledigPlass() || finnes(innlegg)) return false;
     samling[nesteLedig] = innlegg;
     nesteLedig++;
     return true;
	}
	
	public String toString() {
		
		var sb = new StringBuilder(Integer.toString(nesteLedig));
		sb.append("\n");
		for (Innlegg innlegg : samling) {
			if (innlegg == null) break;
			sb.append(innlegg.toString());
		}
		return sb.toString();
	}

	
	
	
	
	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}