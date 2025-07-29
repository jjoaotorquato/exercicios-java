
import java.util.Scanner;

public class ex11_PositivoNegativo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("informe num para verificar se e positivo, negtivo ou zero: ");
        num = scanner.nextInt();
        if(num > 0){
            System.out.println("positivo");
        }else if (num < 0){
            System.out.println("negativo");
        }else{
            System.out.println("zero");
        }
    }
}
