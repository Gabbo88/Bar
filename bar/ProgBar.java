package bar;
import java.util.*;
import input.Input;

/**
 *
 * @author gabri
 */
public class ProgBar {

    public static void takeOrder(ArrayList<Ordine> ar){
        String tavolo, ordine;
        Ordine ordinazione;
        
        tavolo = Input.insStringa("Inserisci numero del tavolo: ");
        ordine = Input.insStringa("Qual è l'ordine?");
        
        ordinazione = new Ordine(tavolo, ordine);
        ar.add(ordinazione);
    }
    
    public static void main(String[] args) {
        int risp;
        boolean esci = false;
        ArrayList<Ordine> ordine = new ArrayList();
        
        do{ 
            risp = Input.insInt("Che vuoi fare?\n1. Prendi ordine;\n2. Evadi ordine;\n3. Stampa ordini presi;\n4. Esci", 0, 4, "Fai una scelta valida! (1-4)"); 
            switch(risp){
                case 1:
                    takeOrder(ordine);
                    break;
                case 2:
                    int cont=1;
                    System.out.println("Ordini da evadere: ");
                    System.out.println("***ORDINE N. "+cont+"***");
                    Iterator i = ordine.iterator();
                    while(i.hasNext()){
                        System.out.println(i.next());
                        cont++;
                    }
                    cont--;
                    risp = Input.insInt("Che ordine vuoi evadere?", 1, cont, "Fai una scelta valida! (1-"+cont+")");
                    risp--;
                    System.out.println("Soddisfatto ordine: ");
                    System.out.println(ordine.get(risp));
                    ordine.remove(risp);
                    break;
                case 3:
                    cont=1;
                    Iterator a = ordine.iterator();
                    while(a.hasNext()){
                        System.out.println("***ORDINE N. "+cont+"***");
                        System.out.println(a.next());
                        cont++;
                    }
                    break;
                case 4:
                    esci = true;
                    break;
                default:
                    System.err.println("ERRORE! FAI UNA SCELTA VALIDA");
            }
        }while(!esci);
        
        System.out.println("Grazie per essere venuto nel nostro bar!");
 
    }
    
}