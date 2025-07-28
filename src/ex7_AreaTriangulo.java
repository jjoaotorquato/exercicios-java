
import java.util.Scanner;

public class ex7_AreaTriangulo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int altura;
        System.out.print("informe base: ");
        base = scanner.nextInt();
        System.out.print("informe altura: ");
        altura = scanner.nextInt();
        int area = (base * altura)/2;
        System.out.println("area: "+area);
    }
}
