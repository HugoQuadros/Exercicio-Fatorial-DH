import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        System.out.println("Digite um valor inteiro positivo: ");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int fatorial = 1;
        int e = 0;

        for(int i = 1; i <= n; i++){
            fatorial *= i;
            e = e + 1 + fatorial;
        }
        System.out.println("O valor de E é: " + e);
    }

}
