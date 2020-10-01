/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orario.docenti;

/**
 *
 * @author molli_flavio
 */
import java.util.ArrayList;

/**
 *
 * @author molli_flavio
 */

public class DatiCondivisi {
//Getter
    public String getClasse() {
        return Classe;
    }

    public String[] OrarioDocenti() {
        return OrarioDocenti;
    }

      public int getCountOreTrovate() {
        return countOreTrovate;
    }

    public String[] getGiornoOra() {
        return GiornoOra;
    }

    //Mettodo per incrementare il contatore dei corsi trovati
    public synchronized void  incCountOreTrovate(){
        countOreTrovate++;
    }
    public synchronized void push(String s){
        if(numEl<GiornoOra.length){
            GiornoOra[numEl]=s;
            numEl++;
        }
    }
    //reset array 
    private void ResetArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]="";
        }
    }

    //Costruttore
    public DatiCondivisi(String Classe, String[] OrarioDocenti) {
        this.Classe=Classe;
     
        this.OrarioDocenti=OrarioDocenti;
     
        countOreTrovate = 0;
        GiornoOra = new String[OrarioDocenti.length * 5];
        ResetArray(GiornoOra);
        numEl=0;

    }
    //Dati
    private String Classe;

    private String[] OrarioDocenti;
   

  

    private int countOreTrovate;
    private String[] GiornoOra;
    private int numEl;

}
