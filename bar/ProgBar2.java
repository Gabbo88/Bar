package bar;
import java.util.*;
import input.Input;

//FUNZIONA COME PILA

/**
 *
 * @author gabri
 */
public class ProgBar {
    
    public static void main(String[] args) {
        int risp;
        boolean esci = false;
        String tavolo, ordine;
        Ordine ordinazione, ord;
        Pila ordini = new Pila();
        
        do{ 
            risp = Input.insInt("Che vuoi fare?\n1. Prendi ordine;\n2. Evadi ordine;\n3. Esci", 0, 3, "Fai una scelta valida! (1-3)"); 
            switch(risp){
                case 1:
                    tavolo = Input.insStringa("Inserisci numero del tavolo: ");
                    ordine = Input.insStringa("Qual è l'ordine?");
                    ordinazione = new Ordine(tavolo, ordine);
                    ordini.push(ordinazione);
                    break;
                case 2:
                    ord = (Ordine) ordini.pop();
                    System.out.println("Soddisfatto ordine: ");
                    System.out.println(ord);
                    break;
                case 3:
                    esci = true;
                    break;
                default:
                    System.err.println("ERRORE! FAI UNA SCELTA VALIDA");
            }
        }while(!esci);
        
        System.out.println("Grazie per essere venuto nel nostro bar!");
 
    }
    
}