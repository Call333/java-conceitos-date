import java.util.Calendar;


public class CalebeExeer02 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

    
        int nDias = 10; 
        agora.add(Calendar.DATE, nDias);
        // System.out.println("A data corrente é : " + agora.getTime());
       
        if(agora.get(Calendar.DAY_OF_WEEK) == 6){
            agora.add(Calendar.DATE, 3);
            System.out.println("Data acrescida de 10 dias úteis: " + agora.getTime());
        }
        if(agora.get(Calendar.DAY_OF_WEEK) == 7){
            // System.out.println("Data acrescida de 10 dias uteis: " + agora.getTime());
            agora.add(Calendar.DATE, 2);
            System.out.println( "Data acrecida de 10 dias: " + agora.getTime());
        }
        if(agora.get(Calendar.DAY_OF_WEEK) == 1){
            // System.out.println("Data acrecida de 10 dias uteis: " + agora.getTime());
            agora.add(Calendar.DATE, 1);
            System.out.println( "Data acrecida de 10 dias: " + agora.getTime());
        }
        
        //"Data acrecida de 10 dias: " + agora.getTime()
        }
    }
    
