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
}