import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = entrada.nextInt();

        System.out.println("\nEm ordem decrescente fica: ");
        if(numero > numero2){
            System.out.println(numero + " " + numero2);
        } else System.out.println(numero2 + " " + numero);
    }
}
