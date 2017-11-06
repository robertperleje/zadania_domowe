package pl.atena.edu.akademia6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class WczytajPlik {
	
	//Podstawow¹ rol¹ biblioteki do logowania jest przekazanie komunikatu wygenerowanego w kodzie 
	//(np. informacji, ¿e jakaœ operacja siê powiod³a) do odpowiedniego miejsca 
	//(np. standardowe wyjœcie konsoli, plik, serwer zdalny), dodaj¹c informacje o czasie, poziomie i ew kilka innych pomocniczych. 
	//protected Logger logger = Logger.getGlobal();
	
	
	 
	//private PrzetwarzajLinie plinie;
	ArrayList<String> tablicaSlow = new ArrayList<String>();
	PoliczSlowa<Object, Object> polsl = new  PoliczSlowa<Object, Object>();
	
	public void wczytajPlik(String source) {
		try {
			File file = new File(source);
			//logger.info("Wczytano: " + source + "\n");

			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) 
			{	
				String line = sc.nextLine();
				String[] row = line.split("\\s");
			
				for (String slowo : row) 
				{
					tablicaSlow.add(slowo);
					Collections.sort(tablicaSlow);
				}
			}
			
			polsl.policz(tablicaSlow);
						
			sc.close();
		
			//logger.info("Zakokoñczono przetwarzanie: " + source + "\n");
		} catch (FileNotFoundException e) {
			//logger.throwing("AWczytajPlik", "wczytajPlik", e);
			
		}
	}

}
