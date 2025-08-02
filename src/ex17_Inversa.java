
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex17_Inversa {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("informe nomes digite 'sair' para sair");

        while (true) { 
            System.out.print("nome: ");
            String nome = scanner.nextLine();

             if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            nomes.add(nome);
        }
        System.out.println("nomes: "+nomes);
        Collections.reverse(nomes);
        System.out.println("inversa: "+nomes);
        scanner.close();
    }
}
