package test;

public class Temperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public boolean isTemperaturaAlta(double celsius) {
        return celsius > 30;
    }
}