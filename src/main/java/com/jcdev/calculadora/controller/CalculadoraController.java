package com.jcdev.calculadora.controller;

public class CalculadoraController {

    // Metodo para calcular soma
    public int calcularSoma(int num1, int num2) {
        return num1 + num2;
    }

    // Metodo para calcular subtração
    public int calcularSubtracao(int num1, int num2) {
        return num1 - num2;
    }

    // Metodo para calcular multiplicação
    public int calcularMultiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    // Metodo para calcular divisão
    public double calcularDivisao(int num1, int num2) {

        // Se tentar dividir por zero, lança uma excessão, pois não é permitido
        if(num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        } else {
            // Senão, retorna a divisão
            return (double) num1 / num2;
        }
    }
}

