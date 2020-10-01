/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orario.docenti;

import java.util.ArrayList;

/**
 *
 * @author molli_flavio
 */
public class ThCerca extends Thread {

    //Dati Condivisi
    DatiCondivisi datiCon;
    //Numero Thread
    int numeroTh;

    //Costruttore
    public ThCerca(DatiCondivisi datiCon, int numeroTh) {
        this.datiCon = datiCon;
        this.numeroTh = numeroTh;
    }


    @Override
    public void run() {
        //Dati
        String ComunePartenza = datiCon.getClasse();
        
//        String[] Corsa = elencoCorse.get(numeroTh);
//        int indexComunePartenza = Controllo(ComunePartenza);
//        int indexComuneArrivo = Controllo(ComuneArrivo);
        //facendo utilizzo di thread ricercare se la linea permette di arrivare a destinazione 
//        if (indexComunePartenza != -1 && indexComuneArrivo != -1) {
//            if (indexComunePartenza < indexComuneArrivo) {
//                if (!("".equals(Corsa[indexComunePartenza]) || "".equals(Corsa[indexComuneArrivo]))) {
//                        String OraPartArr = "Ora Partenza:" + Corsa[indexComunePartenza] + " Arrivo:" + Corsa[indexComuneArrivo];
//                        datiCon.incCountCorseTrovate();
//                        datiCon.push(OraPartArr);
//                    
//                }
//            }
//        }
    }
//
//    private int Controllo(String trovare) {
//        int index = -1;
//        int i = 0;
//        String[] fermateBus = datiCon.getFermateBus();
//
//        while (i < fermateBus.length && index == -1) {
//            if (fermateBus[i].equals(trovare)) {
//                index = i;
//            }
//            i++;
//        }
//        return index;
//    }
}
