package com.jcdev.calculadora.view;

import java.util.Scanner;

public class CalculadoraView {
    private Scanner scanner;

    public CalculadoraView() {
        this.scanner = new Scanner(System.in);
    }

    // Exibir o menu principal
    public void exibirMenuPrincipal() {
        System.out.println("Digite 1 para continuar, ou 0 para sair:");

    }

    // Capturar os números
    public int pedirNumero(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro:");
            scanner.next();
            System.out.print(mensagem);
        }
        return scanner.nextInt();
    }

    // Exibir opções de cálculo
    public void exibirOperacoes() {
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("--------------------------");
    }

    // Exibir mensagem genérica ao usuário
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Exibir os resultados
    public void exibirResultados(String operacao, double resultado) {
        System.out.printf("Resultado da %s: %.2f%n", operacao, resultado); // Formata para 2 casas decimais
        System.out.println("===========================");
    }

    // Fechar o scanner
    public void fecharScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}