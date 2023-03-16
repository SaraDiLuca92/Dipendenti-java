package Dipendente;
import esercizio1Giorno4.Dipendente;
import esercizio1Giorno4.Dipendente.Dipartimento;
import esercizio1Giorno4.Dipendente.Livello;

public class Dipendente {
	private static double stipendioBase=1000; //valore statico
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello; //sono enum ossia quasi come degli oggetti
	private Dipartimento dipartimento; //sono enum ossia quasi come degli oggetti


	public enum Livello{ OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE} //definisco gli enum

	public enum Dipartimento{ PRODUZIONE, AMMINISTRAZIONE, VENDITE} //definisco gli enum


	//questo è un costruttore che accetta solo due parametri:

	public Dipendente(String matricola, Dipartimento dipartimento) {
	    this.matricola = matricola;
	    this.dipartimento = dipartimento;
	    this.stipendio = stipendioBase;
	    this.importoOrarioStraordinario = 30;
	    this.livello = Livello.OPERAIO;
	}

	//questo è un costruttore che accetta tutti i parametri:

	public Dipendente(String matricola,double stipendio,double importoOrarioStraordinario,Livello livello,Dipartimento dipartimento) {
		
	this.matricola=matricola;
	this.stipendio=stipendio;
	this.importoOrarioStraordinario=importoOrarioStraordinario;
	this.livello=livello;
	this.dipartimento=dipartimento;
	}

	//metodi per prendere i dati :

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	//metodi per cambiare i dati:

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	//metodi:

	//metodo per stampare i dati del dipendente
	public void stampaDatiDipendente() {
		
		System.out.println("matricola:"+matricola);
		System.out.println("dipartimento:"+dipartimento);
		System.out.println("stipendio:"+stipendio);
		System.out.println("ore di straordinario:"+importoOrarioStraordinario);
		System.out.println("livello:"+livello);
		
	}

	//metodo promozione

	public Livello promuovi() {
		switch(livello) 
		{
		case OPERAIO:
			livello=livello.IMPIEGATO;
			stipendio=stipendioBase*1.2;
			break;
		case IMPIEGATO:
			livello=livello.QUADRO;
			stipendio=stipendioBase*1.5;
			break;
		case QUADRO:
			livello=livello.DIRIGENTE;
			stipendio=stipendioBase*2;
			break;
		case DIRIGENTE:
			System.out.println("Errore:Hai raggiunto il livello massimo, non puoi essere promosso!");
			stipendio=stipendioBase*2;
			break;
		
		}
		return livello;
		
	}

	//metodi statici:

	public static double calcolaPaga(Dipendente dipendente) {return dipendente.stipendio;}

	public static double calcolaPaga(Dipendente dipendente,int oreStraordinario ) {return dipendente.stipendio+(oreStraordinario*dipendente.importoOrarioStraordinario); }


}
