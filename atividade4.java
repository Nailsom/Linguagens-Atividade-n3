import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1: Classificação por idade e nota
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        System.out.print("Digite sua nota: ");
        float nota = scanner.nextFloat();
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Exercício 2: Tabuada
        int num;
        do {
            System.out.print("Digite um número positivo: ");
            num = scanner.nextInt();
        } while (num <= 0);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Exercício 3: Ler números até que o usuário digite 0
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }
            System.out.println("Você digitou: " + numero);
        }

        // Exercício 4: Divisão segura
        try {
            System.out.print("Digite o primeiro número: ");
            float num1 = scanner.nextFloat();
            System.out.print("Digite o segundo número: ");
            float num2 = scanner.nextFloat();
            if (num2 == 0) {
                throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
            }
            float resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números.");
        }

        scanner.close();
    }
}
