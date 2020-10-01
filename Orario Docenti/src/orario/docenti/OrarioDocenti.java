/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orario.docenti;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author molli_flavio
 * 
 * - Gradi di parallelismo 6 (5 thread)
 * - Il main interagisce con l'utente
 * - chiedere di inserire il nome del comune da cui vuole partire e quello a cui vuole arrivare
 * - inserire orario di partenza e arrivo 
 * - cercare all'interno dei 5 thread se c'è una corsa che soddisfa i requisiti richiesti
 * - Dati condivisi: 
 *  coppieOrari = elenco ore da visualizzare
 *  corseTrovate = num corse trovate
 *  elencoCorse = Ogni corsa è un elenco di orari
 *  
 * - mutua esclusione: 
 */
public class OrarioDocenti {

   public static void main(String[] args) throws InterruptedException {
       // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
   System.out.println("Inserisci le fermate:(ogni fermata deve essere diviso da una ,)");
        String Ore = "ORA,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,tot ore\n" +
"AGOSTONI G.,2BI,2CI LFS,1AI LFS,.,.,.,2CI,1AI,1BI LFS,2AI,.,.,-,-,-,-,-,-,1BI,2BI LFS,1CI LFS,.,2AI,.,1CI,2CI,1AI,.,2AI LFS,.,1CI,1BI,2BI,.,.,18\n" +
"ALI' M.,3AL,4BS,.,4AL,5AS,.,5AL,5BL,.,4BL,3AS,.,-,-,-,-,-,-,4BS,3BS,3AL,4BL,.,.,.,.,4AL,3BS,4AS,.,3AS,5BL,5AL,5AS,4AS,20\n" +
"ALIPRANDI S.,4AM LI5,4AM LI5,4BE,.,3EE,.,.,.,5AM LSM,5AM LSM,3EE LSM,3EE LSM,-,-,-,-,-,-,.,.,.,4BE LSM,4BE LSM,4AM,4AM,5AM LSM,.,4BE,5BM LSM,.,.,.,5BM LSM,5BM LSM,3EE,18\n" +
"ANDREACCHI S.,5AI LI6,1CI LI4,4BI LI7,5BI LI7,.,.,3BI LI7,3BI LI7,5BI LI7,4CI LI7,4CI LI7,.,5AI LI6,5AI LI6,.,4BI LI7,4BI LI7,.,.,5BI LI7,5BI LI7,.,.,.,.,.,1CI LI4,3BI LI7,4CI LI7,.,-,-,-,-,-,18\n" +
"ASTA L.,-,-,-,-,-,-,.,.,.,4AM,2AM,2AM,3EE,3EE,.,4AM,2AM,.,2AM,4AM,4AM,.,.,.,3EE,3EE,2AM,4AM,.,.,4AM,3EE,3EE,.,2AM,18\n" +
"BALLABIO M.L.,5D,2B,1D,.,5AI,.,.,.,2B,5AI,2C,5D,.,.,1D,5D,2C,.,,,,,,,.,5AI,1D,2C,2B,.,-,-,-,-,-,15\n" +
"BARDI P.,.,.,1BM LI4,5AI LI6,1CM LI4,.,-,-,-,-,-,-,1AM LI4,.,1CM LI4,.,.,.,5AI LI6,5AI LI6,1BM LI4,.,1AM LI4,.,1AC LI2,1AC LI2,1BC LI2,1BC LI2,.,.,5AI LI6,5AI LI6,4AI LI6,4AI LI6,3AI LI6,18";
      
        String[] OrarioDocenti = Ore.split(",");
     
        String Classe = "";
        System.out.println("Inserisci la classe");
        Classe = scanner.nextLine();
      ;
        //Thread
        DatiCondivisi datiCon = new DatiCondivisi(Classe, OrarioDocenti);
        ThCerca th1 = new ThCerca(datiCon, 0);
       
        th1.start();
        
        th1.join();
        
 
//        if (datiCon.getCountCorseTrovate() > 0) {
//            System.out.println("Corse trovate:" + datiCon.getCountCorseTrovate());
//            visualizza(datiCon.getOrePartArr());
//        } else {
//            System.out.println("Corse non trovate");
//        }
//    }
    private static String[] OrariDiPartenza = new String[5];

 //Metodo per mettere gli orari delle corse negli array
    private static String[] AddCorsa(int i) {
        Scanner scanner = new Scanner(System.in);
        String[] Corsa;
        String orari = "";
        System.out.println("Inserisci gli orari della corsa " + i + "(:ogni orario deve essere diviso da una ,)");
        orari = scanner.nextLine();
        orari+=", ";
        Corsa = orari.split(",");
        return Corsa;
    }
//Visualizza l'array

    private static void visualizza(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!(array[i].equals(""))) {
                System.out.println(array[i]);
            }
        }
    }
}
