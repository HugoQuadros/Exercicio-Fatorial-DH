import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        System.out.println("Digite um valor inteiro positivo: ");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int e = 0;

        for(int i = 1; i <= n; i++){
            e += 1 + fatorial(i);
        }
        System.out.println("O valor de E é: " + e);
    }

    public static int fatorial(int numero) {
        int cont = numero - 1;

        while (cont > 1) {
            numero *= cont;
            cont--;
        }
        return numero;
    }
}
