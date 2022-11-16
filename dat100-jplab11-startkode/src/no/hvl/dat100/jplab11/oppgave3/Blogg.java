package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTab;
	private int nesteLedig;

	public Blogg() {
		innleggTab = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggTab = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innleggTab;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i > nesteLedig; i++) {
			if (innlegg.erLik(innleggTab[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int i = 0;

		while (i < nesteLedig && !funnet) {
			if (innlegg.getId() == innleggTab[i].getId()) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	public boolean ledigPlass() {
		boolean ledig = true;

		if (nesteLedig == innleggTab.length) {
			ledig = false;
		}
		return ledig;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;

		if (!finnes(innlegg)) {
			innleggTab[nesteLedig] = innlegg;
			lagtTil = true;
			nesteLedig++;
		}
		return lagtTil;
	}

	public String toString() {
		String a = "";
		for (int i = 0; i < nesteLedig; i++) {
			a += innleggTab[i].toString();
		}
		return nesteLedig + "\n" + a;
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