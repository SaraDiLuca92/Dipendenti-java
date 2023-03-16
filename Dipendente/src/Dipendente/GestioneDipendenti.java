package Dipendente;
import esercizio1Giorno4.Dipendente;

public class GestioneDipendenti {

	public static void main(String[]args) {
		
		//istanzio(creo) 4 dipendenti:
		
		Dipendente d1=new Dipendente("001",1000,0,Dipendente.Livello.OPERAIO,Dipendente.Dipartimento.PRODUZIONE);
	    Dipendente d2=new Dipendente("002",Dipendente.Dipartimento.PRODUZIONE);
	    Dipendente d3=new Dipendente("003",1500,50,Dipendente.Livello.IMPIEGATO,Dipendente.Dipartimento.AMMINISTRAZIONE);
	    Dipendente d4=new Dipendente("004",3000,50,Dipendente.Livello.DIRIGENTE,Dipendente.Dipartimento.VENDITE);
	    
	    //promuovo un operaio ad impiegato e un impiegato a quadro:
	    
        d1.promuovi();
        d3.promuovi();
        
        //stampo lo stato di tutti i dipendenti:
        
        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
        d3.stampaDatiDipendente();
        d4.stampaDatiDipendente();
        
     // calcolo la somma di tutti gli stipendi con 5 ore di straordinario per ciascun dipendente:
        
        double sommaStipendi= Dipendente.calcolaPaga(d1,5)+Dipendente.calcolaPaga(d2, 5)+Dipendente.calcolaPaga(d3, 5)+Dipendente.calcolaPaga(d4,5);
       System.out.println("La somma degli stipendi con 5 ore di straordinario caduno è:"+sommaStipendi);
	}
	
}
