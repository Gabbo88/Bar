package input;
import java.io.*;
/**
 *
 * @author gabri
 */
public class Input {
    
    static InputStreamReader i = new InputStreamReader(System.in);
    static BufferedReader tastiera = new BufferedReader(i);
    
    public static String insStringa(String string){
        String stringa=null;
        
        System.out.println(string);
        
        try{
             stringa = tastiera.readLine();   
        }catch(Exception e) {}
        
        return stringa;
    }
 
    public static String insStringa(String string, int n1, int n2, String msgErr){
        String stringa=null;
        
        System.out.println(string);
        
        do{
            try{
                 stringa = tastiera.readLine();  
                 if(stringa.length()<n1 || stringa.length()>n2)
                     throw new IOException();
           }catch(Exception e) {System.err.println(msgErr);}
        }while(stringa.length() < n1 || stringa.length() > n2);
        
        return stringa;
    }
    
    public static String insStringa(String string, int n1, String msgErr){
        String stringa=null;
        
        System.out.println(string);
        
        do{
            try{
                 stringa = tastiera.readLine();  
                 if(stringa.length()>n1)
                     throw new IOException();
           }catch(IOException e) {System.err.println(msgErr);}
        }while(stringa.length() > n1);
        
        return stringa;
    }
    
    public static int insInt(String string){
        int intero=0;
        
        System.out.println(string);
        
        try{
            intero = Integer.valueOf(tastiera.readLine());
        }catch(Exception e){}
        
        return intero;
    }
    
    public static int insInt(String string, int minore, int maggiore, String msgErr){
        int intero=0;
  
        System.out.println(string);
        
        do{
            try{
                intero = Integer.valueOf(tastiera.readLine()); 
                if(intero < minore || intero > maggiore)
                    throw new IOException();
            }catch(IOException e) {System.err.println(msgErr);}
        }while(intero < minore || intero > maggiore);
        
        return intero;
   }
 
   public static double insDouble(String string){
       double d=0;
  
       System.out.println(string);
       try{
           d = Double.valueOf(tastiera.readLine());
       }catch(Exception e) {}
    
       return d;
   }
   
   public static float insFloat(String string){
       float f=0;
       
       System.out.println(string);
       try{
           f = Float.valueOf(tastiera.readLine());
       }catch(Exception e) {}
    
       return f;
   }
   
   public static boolean insBoolean(String string){
       String risp=null;
       boolean done=false, ok;
       
       System.out.println(string);
       do {
           try{
               
               risp = tastiera.readLine();
               if("Si".equals(risp) || "si".equals(risp) || "sI".equals(risp) || "SI".equals(risp)){
                   done=true;
                   ok=true;
               }else if("No".equals(risp) || "no".equals(risp) || "nO".equals(risp) || "NO".equals(risp)){
                   done=false;
                   ok=true;
               }else{
                   throw new IOException();
               }
           }catch(IOException e) {
               System.err.println("Inserisci una risposta valida! (Si/No): ");
               ok=false;
           } 
       }while(!ok);
       
     return done;
   }
    
}
