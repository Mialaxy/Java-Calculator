package poo;

import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();
        boolean continuar = true;
        Scanner scan = new Scanner(System.in);

        while (continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("Digite a operação que deseja realizar: "
                    + " \n 1 para soma "
                    + " \n 2 para subtração "
                    + " \n 3 para multiplicação "
                    + " \n 4 para divisão "
                    + " \n ou 0 para finalizar o programa ");

            operacao = scan.nextInt();

            if (operacao == 0) {
                continuar = false;  
                break; 
            }

            System.out.println("Informe o valor do primeiro número: ");
            x = scan.nextDouble();

            System.out.println("Informe o valor do segundo número: ");
            y = scan.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case 1:
                    resultado = n.soma(x, y);
                    break;

                case 2:
                    resultado = n.subtracao(x, y);
                    break;

                case 3:
                    resultado = n.multiplicacao(x, y);
                    break;

                case 4:
                    resultado = n.divisao(x, y);
                    break;

                default:
                    System.out.println("Operação inválida!");
                    continue; 
            }

            imprimeCalculadora(operacao, resultado, x, y);
        }

        scan.close(); 
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        switch (operacao) {
            case 1:
                System.out.println(x + " + " + y + " = " + resultado);
                break;

            case 2:
                System.out.println(x + " - " + y + " = " + resultado);
                break;

            case 3:
                System.out.println(x + " * " + y + " = " + resultado);
                break;

            case 4:
                System.out.println(x + " / " + y + " = " + resultado);
                break;

            default:
                break;
        }
    }
}
