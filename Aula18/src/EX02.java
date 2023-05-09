import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {

        List<String> listaJogos = new ArrayList<>();

        listaJogos.add("Valorant");
        listaJogos.add("Call of Duty");
        listaJogos.add("Dead by Daylight");

        System.out.println("------Lista Atual------");
        for(int i = 0; i < listaJogos.size(); i++){
            System.out.println(i + " - " + listaJogos.get(i));
        }

        adicionarElemento(listaJogos);

        System.out.println("------Lista Após a Adição------");
        for(int i = 0; i < listaJogos.size(); i++){
            System.out.println(i + " - " + listaJogos.get(i));
        }
    }

    public static void adicionarElemento(List<String> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o elemento que deseja adicionar:");
        String elemento = entrada.nextLine();

        System.out.println("Digite a posicao que deseja coloca-lo:");
        int posicao = entrada.nextInt();

        lista.add(posicao, elemento);
    }
}
