import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<String> listaJogos = new ArrayList<>();

        listaJogos.add("Valorant");
        listaJogos.add("Call of Duty");
        listaJogos.add("Dead by Daylight");

        System.out.println("------Lista Atual------");
        for(int i = 0; i < listaJogos.size(); i++){
            System.out.println(i + " - " + listaJogos.get(i));
        }

        System.out.println("\nComo deseja fazer a remoção? ");
        System.out.println("    1 - Pelo Indice");
        System.out.println("    2 - Pelo Nome");
        int opcao = entrada.nextInt();

        switch(opcao){
            case 1:
                listaJogos.remove(removerElementoPeloIndice());
                break;
            case 2:
                listaJogos.remove(removerElementoPeloNome());
                break;
            default:
                System.out.println("Opção Inválida!");
                System.exit(0);
        }

        System.out.println("------Lista Após a Remoção------");
        for(int i = 0; i < listaJogos.size(); i++){
            System.out.println(i + " - " + listaJogos.get(i));
        }
    }

    public static String removerElementoPeloNome(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o nome do elemento que deseja remover:");

        return entrada.nextLine();
    }

    public static int removerElementoPeloIndice(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o indice do elemento que deseja remover:");

        return entrada.nextInt();
    }
}
