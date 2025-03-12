package br.com.projetos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double valor1;
        double valor2;
        String operacao;
        boolean continuar;

        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextDouble();

                System.out.println("Digite qual o operador (+, -, * ou /): ");
                operacao = scanner.next();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextDouble();

                double resultado = fazOperacao(valor1, operacao, valor2);
                System.out.println("Resultado: " + resultado);

                continuar = continuarOperacao();

            } while (continuar);

        } catch (InputMismatchException e) {
            System.out.println("O valor deve ser numérico! ;) ");
        }



    }

    public static boolean continuarOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar nova operação? (S / N)");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static double fazOperacao(double valor1, String operacao, double valor2) {
        double respostaConta = 0.0;

        switch (operacao) {
            case "+":
                respostaConta = valor1 + valor2;
                break;

            case "-":
                respostaConta = valor1 - valor2;
                break;
            case "*":
                respostaConta = valor1 * valor2;
                break;
            case "/":
                respostaConta = valor1 / valor2;
                break;

            default:
                System.out.println("Operação inválida! -_-");
        }
        return respostaConta;
    }
}
