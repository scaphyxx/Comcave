package mietwagen;

import java.time.LocalDate;

public class Mietwagen {
	private String hersteller;
	  private Kategorie typ;
	  private String farbe;
	  private String zustand = "verfuegbar";
	  private LocalDate imBestandSeit;
	  private int laufleistung;
	  private boolean gestohlen = false;
	  private int wert;
	  
	   public Mietwagen(String hersteller, Kategorie typ, String farbe){
	      this.hersteller = hersteller;
	      this.typ = typ;
	      this.farbe = farbe;
	       imBestandSeit = LocalDate.now(); 
	  }
	public String getHersteller(){return hersteller;} 
	public Kategorie getTyp(){return typ;}
	public String getFarbe(){return farbe;}
	public String getZustand(){return zustand;}
	public LocalDate getImBestandSeit(){return imBestandSeit;}
	public int getLaufleistung() {return laufleistung;}
	public boolean getGestohlen() {return gestohlen;}
	public int getPreis() {return wert;}
	
	public void setLaufleistung(int km){this.laufleistung = laufleistung + km;}
	public void setZustand(String zustand){ this.zustand = zustand;}
	public void setGeklaut(boolean geklaut){this.gestohlen = geklaut;}
	public void setPreis(int preis) {this.wert = preis;}
	
	public void verleihen(){}
	public void zurueckgeben(){}
	public void reservieren(){}
	private void pruefen(){}
	private boolean reinigen(){return false;}
	

}
