
import java.util.Scanner;

public class ex15_Tabuada {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe num para ver sua atbuada: ");
        int num = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int multiplicacao = num * i;
            System.out.println(multiplicacao);
        }
    
        scanner.close();
    }
}
