
import java.util.Scanner;

public class ex6_Dobro{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe numero para receber o dobro: ");
        int num = scanner.nextInt();
        int dobro = (num * 2);
        System.out.println("dobro: "+dobro);
    }
}