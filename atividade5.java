import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite um número decimal: ");
        double decimal = scanner.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + ((double) num1 / num2));
        System.out.println("Resto da divisão inteira: " + (num1 % num2));
        System.out.println("Decimal ao quadrado: " + (decimal * decimal));

        // Exercício 2
        System.out.print("Digite mais um número inteiro: ");
        int num3 = scanner.nextInt();
        System.out.println("O primeiro é maior que o segundo? " + (num1 > num2));
        System.out.println("O terceiro é igual à soma dos dois primeiros? " + (num3 == (num1 + num2)));

        // Exercício 3
        System.out.println("O primeiro é maior que o segundo E o terceiro é igual à soma dos dois? " + ((num1 > num2) && (num3 == (num1 + num2))));
        System.out.println("O primeiro é maior que o segundo OU o terceiro é igual à soma dos dois? " + ((num1 > num2) || (num3 == (num1 + num2))));

        // Exercício 4
        int inteiro = 10;
        double decimal2 = 5.5;
        String texto = "Teste";

        inteiro = 20; // Atribuição simples
        decimal2 += inteiro; // Atribuição mista
        texto += " atualizado"; // Concatenação

        System.out.println("Inteiro: " + inteiro);
        System.out.println("Decimal: " + decimal2);
        System.out.println("Texto: " + texto);

        scanner.close();
    }
}
