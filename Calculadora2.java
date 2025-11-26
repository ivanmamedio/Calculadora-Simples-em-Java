// Estava pesquisando e vi que posso fazer de formas diferentes a caluldadora
// Vou criar esse novo arquivo para testa de outra forma
// Este código eu achei na internet e vou testa-lo aqui
// Lembrando que usei IA também para me ajudar a entender o código
// Deepseek

import java.util.Scanner;

public class Calculadora2 {
    // Métodos para cada operação
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");          
        }
        return a / b;
    }

    public static void mains(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== CALCULADORA 2 ===");

        while (continuar) {
            try {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite a operação (+, -, *, /) ");
                char operacao = scanner.next().charAt(0);

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                
            }
        }
    }
