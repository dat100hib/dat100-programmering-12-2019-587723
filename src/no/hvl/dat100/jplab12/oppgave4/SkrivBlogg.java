package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg blogg, String filnavn) {

		try {
		var writer = new PrintWriter(MAPPE +filnavn);
		
		writer.println(blogg.toString());
		writer.close();
		return true;
		
	} catch (FileNotFoundException e) {
		System.out.println("Finner ikke filen" + e.getMessage());
	}
		return false;
	}
		
		
}
