
import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */
public class CalebeExerc04 {
    public static void main(String[] args) {
        
        LocalDateTime agora = LocalDateTime.of(2010, 5, 15, 10, 0, 0);//1273928400000L

        System.out.println(agora);
        // 2019-07-15T00:02:16.076

        LocalDateTime passado = agora.plusHours(13).plusYears(4).plusMonths(6);

        System.out.println(passado);
        // 2019-07-17T01:02:28.076

    }
}

