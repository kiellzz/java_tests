package test;

public class Produto {

    public double calcularDesconto(double valor) {
        return valor - (valor * 0.10);
    }

    public boolean freteGratis(double valor) {
        return valor > 100;
    }
}