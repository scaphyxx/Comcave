package mietwagen;

public class Autovermietung {

	public static void main(String[] args) {
		
		Mietwagen mw_1_L = new Mietwagen("RangeRover", Kategorie.LUXUS,"weiß");
		Mietwagen geklaut = new Mietwagen("Bugatti Chiron", Kategorie.EDELKARRE, "Pink");
		Mietwagen unbezahlbar = new Mietwagen("Ferrari 335 Sport Scaglietti", Kategorie.EDELOLDTIMER, "Rot");
		
		System.out.println("Adresse: " + mw_1_L);
		System.out.println();
		System.out.println("\t\t\tStatus:");
		System.out.println("Referenzvariable: mw_1_l");
		System.out.println("Hersteller: \t" + mw_1_L.getHersteller());
		System.out.println("Typ: \t\t" + mw_1_L.getTyp());
		System.out.println("Farbe: \t\t" + mw_1_L.getFarbe());
		System.out.println("Zustand: \t" + mw_1_L.getZustand());
		System.out.println("Im Bestand seit: " + mw_1_L.getImBestandSeit());
		System.out.println("Laufleistung: \t" + mw_1_L.getLaufleistung());
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		mw_1_L.setLaufleistung(1500);
		System.out.println("Laufleistung: \t" + mw_1_L.getLaufleistung());
		System.out.println();
		System.out.println();
		
		
		geklaut.setGeklaut(true);
		geklaut.setZustand("nicht verfügbar");
		geklaut.setLaufleistung(9999);
		geklaut.setPreis(4000000);
		System.out.println("Mietwagen: \t" + geklaut.getHersteller());
		System.out.println("Typ: \t\t" + geklaut.getTyp());
		System.out.println("Farbe: \t\t" + geklaut.getFarbe());
		System.out.println("Laufleistung: \t" + geklaut.getLaufleistung() + " km");
		System.out.println("Zustand: \t" + geklaut.getZustand());
		System.out.println("Warum ist der " + geklaut.getHersteller() + " " + geklaut.getZustand() 
							+ ", wurde er gestohlen? " + geklaut.getGestohlen()); 
		if (geklaut.getPreis() > 1000000)
			System.out.println("Preis: \t\t" + (geklaut.getPreis()/1000000) + " Mio");
		System.out.println();
		System.out.println();
		
		unbezahlbar.setLaufleistung(35000);
		unbezahlbar.setPreis(32000000);

		System.out.println("Mietwagen: \t" + unbezahlbar.getHersteller());
		System.out.println("Typ: \t\t" + unbezahlbar.getTyp());
		System.out.println("Farbe: \t\t" + unbezahlbar.getFarbe());
		System.out.println("Laufleistung: \t" + unbezahlbar.getLaufleistung() + " km");
		System.out.println("Zustand: \t" + unbezahlbar.getZustand());
		if (unbezahlbar.getPreis() > 1000000)
			System.out.println("Preis: \t\t" + (unbezahlbar.getPreis()/1000000) + " Mio");
	}

}
