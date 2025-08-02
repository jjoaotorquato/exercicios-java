
import java.util.Scanner;

public class ex16_Media10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        double soma = 0;
        double media;
        for (int i = 1; i < 11; i++) {
            System.out.print("infomre "+ i + "º num: ");
            num = scanner.nextDouble();
            soma += num;
        }
        System.out.println("soma: "+soma);
        media = soma / 10;
        System.out.println("media: "+media);

    }
}
