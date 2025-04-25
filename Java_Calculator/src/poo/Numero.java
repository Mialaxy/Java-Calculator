package poo;

public class Numero {

    public double soma(double x, double y) {
        return x + y;
    }

    public double subtracao(double x, double y) {
        return x - y;
    }

    public double multiplicacao(double x, double y) {
        return x * y;
    }

    public double divisao(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;  // Retorna 'Not a Number' em caso de divisão por zero
        }
    }
}

