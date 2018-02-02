package bar;
import java.util.*;

/**
 *
 * @author gabri
 */
public class Pila {
    private ArrayList ar;
    
    public Pila(){
        ar = new ArrayList();
    }
    
    public void push(Object obj){
        ar.add(obj);
    }
    
    public Object pop(){
        Object obj = null;
        int size = ar.size();
        
        if(size > 0){
            obj = ar.get(size-1);
            ar.remove(size-1);
        }
        
        return obj;
    }
    
    public Object top(){
        Object obj = null;
        int size = ar.size();
        
        if(size > 0){
            obj = ar.get(size-1);
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
