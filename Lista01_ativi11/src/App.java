import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        //o produto do dobro do primeiro com metade do segundo .
        //a soma do triplo do primeiro com o terceiro.
        //o terceiro elevado ao cubo.
        double real;
        int int1, int2;
        
        System.out.println("1°numero inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int1 = teclado.nextInt();

         System.out.println("2°numero inteiro: ");
        int2 = teclado.nextInt();

         System.out.println("Digite o numero real: ");
        real = teclado.nextDouble();

            System.out.println("o produto do dobro do primeiro com metade do segundo é " + (int1 * 2) * (int2 / 2));  

        System.out.println("a soma do triplo do primeiro com o terceiro é " + ((int1 * 3) + real));

         System.out.println("o terceiro elevado ao cubo é " + Math.pow(real, 3) );
         teclado.close();

    }
}
