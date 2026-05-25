package test;

public class Aluno {

    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado(double nota1, double nota2) {
        return calcularMedia(nota1, nota2) >= 7;
    }
}