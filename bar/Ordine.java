package bar;

/**
 *
 * @author gabri
 */
public class Ordine {
    private String tavolo, ordine;
    
    public Ordine(String tavolo, String ordine){
        this.tavolo = tavolo;
        this.ordine = ordine;
    }
    
    public String toString(){
        return "Tavolo: " + tavolo + "\nOrdine: " + ordine;
    }
    
}
