
import java.util.Scanner;

public class ex8_ConverteTemperatura {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        int escolha;
        double tempe_convertida;
        System.out.println("1- converter C para F");
        System.out.println("2- converter F para C");
        System.out.print("temperatura: ");
        temperatura = scanner.nextDouble();
        System.out.print("escolha: ");
        escolha = scanner.nextInt();
        switch(escolha){
            case 1 -> {
                tempe_convertida = (temperatura * 9.0 / 5.0) + 32;
                System.out.println("Convertido: " + tempe_convertida + " °F");
            }
            case 2 -> {
                tempe_convertida = (temperatura - 32) * 5.0 / 9.0;
                System.out.println("Convertido: " + tempe_convertida + " °C");
            }
        }
    }
}
