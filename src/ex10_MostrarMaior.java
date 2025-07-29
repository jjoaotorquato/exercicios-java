
import java.util.Scanner;

public class ex10_MostrarMaior {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1; int num2;
        System.out.print("informe num1: ");
        num1 = scanner.nextInt();
        System.out.print("informe num2: ");
        num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.println("maior: "+num1);
        }else{
            System.out.println("maior: "+num2);
        }
    }
}
