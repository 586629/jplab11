package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;

import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;


public class Blogg {


		private Innlegg[] innleggsTab;
		private int nesteLedig;
		
		
		public Blogg() {
			innleggsTab = new Innlegg[20];
		this.nesteLedig = 0;
		}
		
	public Blogg(int lengde) {
		innleggsTab = new Innlegg[lengde];
		this.nesteLedig = 0;
	}
	
	public int getAntall() {
		return this.nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTab;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int finnes = -1;
		for (int i = 0; i < nesteLedig && finnes == -1; i++){
			if (innleggsTab[i] != null && innlegg.erLik(innleggsTab[i])) {
				finnes = i;
			}
	}
		return finnes; 

	
	}

	public boolean finnes(Innlegg innlegg) {
		if(finnInnlegg(innlegg) != -1) { 
			return true;
		}
		else {
			return false;
		}
	

	}

	public boolean ledigPlass() {
		return(nesteLedig < innleggsTab.length)
				;

	}
	
	public boolean leggTil(Innlegg innlegg) {
if (!finnes(innlegg) && ledigPlass()) {
	innleggsTab[nesteLedig] = innlegg;
	nesteLedig++;
	return true;
}
else { 
	return false;
}

	}
	
	public String toString() {
	String str = nesteLedig + "\n";
	for ( int i = 0 ; i < nesteLedig; i++) {
		if (innleggsTab[i] instanceof Bilde) {
			Bilde bildeobj =  (Bilde) innleggsTab[i];
			str += bildeobj.toString();
		}
		else { 
			Tekst tekstObj = (Tekst) innleggsTab[i];
			str += tekstObj.toString();
		}
	}
	return str;
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