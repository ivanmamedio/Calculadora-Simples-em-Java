import java.util.Scanner;

public class calculadora {
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

        // Calculo baseado na operação
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false; 
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                operacaoValida = false;
                }

        // Exibe o resultado se a operação foi válida
        if (operacaoValida) {
            System.out.println("Resultado: " + num1+" " + operacao + " " + num2 +
    " = " + resultado);
            }

            scanner.close();
        }
    }
