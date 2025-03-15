// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class DesafioSaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:

        String primeiraTransacao = scanner.next();
        String segundaTransacao = scanner.next();
        String terceiraTransacao = scanner.next();

        double primeiraTransacaoDouble = Double.parseDouble(primeiraTransacao);
        double segundaTransacaoDouble = Double.parseDouble(segundaTransacao);
        double terceiraTransacaoDouble = Double.parseDouble(terceiraTransacao);

        // TODO: Na linha abaixo, realize o cálculo do saldo final:


        // Saldo final

        double saldoFinal = saldoInicial + (primeiraTransacaoDouble + segundaTransacaoDouble + terceiraTransacaoDouble);

        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}