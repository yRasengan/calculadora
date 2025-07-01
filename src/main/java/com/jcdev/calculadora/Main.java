package com.jcdev.calculadora;

import com.jcdev.calculadora.controller.CalculadoraController;
import com.jcdev.calculadora.view.CalculadoraView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController();

        System.out.println("===== Calculadora =====");

        while (true) {
            view.exibirMenuPrincipal();
            int escolhaMenuPrincipal = view.pedirNumero("Escolha uma opção:");

            if(escolhaMenuPrincipal == 0) {
                System.out.println("Saindo...");
                break;
            } else if(escolhaMenuPrincipal == 1) {
                int num1 = view.pedirNumero("Digite o primeiro número:");
                int num2 = view.pedirNumero("Digite o segundo número:");
                view.exibirOperacoes();

                int operacao = view.pedirNumero("Agora, digite o número da operação desejada:");
                double resultado;
                switch(operacao) {
                    case 1:
                        resultado = controller.calcularSoma(num1, num2);
                        view.exibirResultados("soma: ", resultado);
                        break;

                    case 2:
                        resultado = controller.calcularSubtracao(num1, num2);
                        view.exibirResultados("subtração: ", resultado);
                        break;

                    case 3:
                        resultado = controller.calcularMultiplicacao(num1, num2);
                        view.exibirResultados("multiplicação: ", resultado);
                        break;

                    case 4:
                        try {
                            resultado = controller.calcularDivisao(num1, num2);
                            view.exibirResultados("divisão: ", resultado);
                        } catch (IllegalArgumentException e) {
                            view.exibirMensagem("Erro:" + e.getMessage());
                        }
                }
            } else {
                view.exibirMensagem("Opção inválida! Digite 1 para prosseguir ou 0 para sair.");
            }
        }

        view.fecharScanner();
    }
}