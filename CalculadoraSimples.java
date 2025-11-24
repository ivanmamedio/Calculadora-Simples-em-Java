import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA SIMPLES ===");
        System.out.println("Operações disponíveis:");
        System.out.println("+ : Adição");
        System.out.println("- : Subtração");
        System.out.println("* : Multiplicação");
        System.out.println("/ : Divisão");

        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Entrada da operação
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        // Entrada do segundo número
        System.out.print("Digite o segundo número? ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;
    }
}