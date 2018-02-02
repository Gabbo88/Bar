package bar;
import java.util.*;


/**
 *
 * @author gabri
 */
public class Coda {
    private ArrayList ar;
    
    public Coda(){
        ar = new ArrayList();
    }
    
    public void aggiungi(Object obj){
        ar.add(obj);
    }
    
    public Object togli(){
        Object obj = null;
        int size = ar.size();
        
        if(size > 0){
            obj = ar.get(0);
            ar.remove(obj);
        }
        
        return obj;
    }
    
    public boolean vuota(){
        if(ar.size() > 0){
            return false;
        }else{
            return true;
        }
    }
    
    public int size(){
        return ar.size();
    }
    
}
