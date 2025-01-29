public class  atividade6{

    // Função que retorna o quadrado de um número
    public static int quadrado(int numero) {
        int resultado = numero * numero; // Variável local
        return resultado;
    }

    // Passagem por valor
    public static int dobroValor(int n) {
        return n * 2;
    }

    // Passagem por referência (simulada com array)
    public static void dobroReferencia(int[] nLista) {
        nLista[0] *= 2;
    }

    // Sobrecarga de funções (simulada com métodos diferentes)
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double somaFloat(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Exemplo de quadrado
        System.out.println("Quadrado de 5: " + quadrado(5));

        // Passagem por valor
        int num = 10;
        System.out.println("Dobro por valor: " + dobroValor(num));
        System.out.println("Valor original após chamada: " + num);

        // Passagem por referência
        int[] numLista = {10};
        dobroReferencia(numLista);
        System.out.println("Dobro por referência: " + numLista[0]);

        // Sobrecarga de funções
        System.out.println("Soma de dois inteiros: " + soma(3, 4));
        System.out.println("Soma de três inteiros: " + soma(3, 4, 5));
        System.out.println("Soma de dois floats: " + somaFloat(3.5, 2.5));
    }
}
