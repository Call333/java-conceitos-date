import java.util.Date;

public class CalebeExer01 {
    public static void main(String[] args) {
        Date caNasci = new Date(1064609040000L);

        Date dataAtual = new Date();

        String formatTexto = "A Data do Nascimento é: " + caNasci +
            "\nA Data atual é: " + dataAtual;

        boolean isAfter = caNasci.after(dataAtual);
        System.out.println(isAfter);

        boolean isBefore = caNasci.before(dataAtual);
        System.out.println(isBefore);

        System.out.println(formatTexto);
    }   
}
