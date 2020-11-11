package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	
	private static String MAPPE = System.getProperty("user.dir" + "/src/no/hvl/dat100/jplab11/tests/");

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean funnet = false;
		
		try {
			File file = new File(MAPPE + filnavn);
			
			Scanner reader = new Scanner (file);
			
			int lineNr = 1;
			String line;
			
			while (reader.hasNextLine()) {
				line = reader.nextLine();
				System.out.println(lineNr + "" + line);
				lineNr++;
			}
			
			reader.close();
			
			funnet = true;
			}
		catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,  "Feil fil");
			
			
		}
		return funnet;

	
	}
}
