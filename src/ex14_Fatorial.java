
import java.util.Scanner;

public class ex14_Fatorial {
    public static long calcFatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * calcFatorial(num - 1);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe num para ver fatorial: ");
        int numero = scanner.nextInt();
        System.out.println("fatorial de "+numero+" : "+calcFatorial(numero));
    } 
}
