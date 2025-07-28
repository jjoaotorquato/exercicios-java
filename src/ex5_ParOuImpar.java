
import java.util.Scanner;

public class ex5_ParOuImpar {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe numero: ");

        int num = scanner.nextInt();
        
        if(num %2 == 0){
            System.out.println(num+" é par");
        }else{
            System.out.println(num+" é impar");
        }
    }
}
