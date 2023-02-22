import java.util.Date;
import java.text.SimpleDateFormat;

public class CalebeExer03 {

    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss:mm");

        String dataFormatada = formato.format(agora);

        System.out.println(dataFormatada);
    }
    
}
