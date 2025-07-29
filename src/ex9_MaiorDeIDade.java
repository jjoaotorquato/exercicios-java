
import java.util.Scanner;

public class ex9_MaiorDeIDade {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.print("informe idade: ");
        idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("maior de idade");
        }else if(idade < 18){
            System.out.println("menor de idade");
        }
    }
}
