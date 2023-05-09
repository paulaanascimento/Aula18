import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista:");
        int tamanho = entrada.nextInt();
        List<Integer> listaNumeros = retornaListaNumeros(tamanho);

        adicionarValoresLista(listaNumeros, tamanho);

        System.out.println("\nA média dos numeros armazenados é :" + mediaAritmeticaNumerosLista(listaNumeros));
    }

    public static List<Integer> retornaListaNumeros(int tamanhoLista){
        List<Integer> lista = new ArrayList<>(tamanhoLista);

        return lista;
    }

    public static Boolean adicionarValoresLista(List<Integer> lista, int tamanho){
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o " + (i+1) + " valor:");
            lista.add(entrada.nextInt());
        }

        return true;
    }

    public static double mediaAritmeticaNumerosLista(List<Integer> lista){
        double media = 0;

        for(int i = 0; i < lista.size(); i++){
            media = media + lista.get(i);
        }

        media = media/lista.size();

        return media;
    }
}
