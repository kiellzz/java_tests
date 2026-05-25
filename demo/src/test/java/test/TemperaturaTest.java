package test;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperaturaTest {

    Temperatura temperatura = new Temperatura();

    @Test
    public void testConversaoZeroGraus() {
        // 0°C = 32°F
        assertEquals(32.0, temperatura.celsiusParaFahrenheit(0), 0.001);
    }

    @Test
    public void testConversao100Graus() {
        // 100°C = 212°F
        assertEquals(212.0, temperatura.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    public void testConversao37Graus() {
        // 37°C = 98.6°F (temperatura corporal)
        assertEquals(98.6, temperatura.celsiusParaFahrenheit(37), 0.001);
    }

    @Test
    public void testTemperaturaAltaAcimaDe30() {
        // 35°C é considerada alta
        assertTrue(temperatura.isTemperaturaAlta(35));
    }

    @Test
    public void testTemperaturaNaoAltaAbaixoDe30() {
        // 25°C não é considerada alta
        assertFalse(temperatura.isTemperaturaAlta(25));
    }

    @Test
    public void testTemperaturaExatamente30NaoEAlta() {
        // Exatamente 30°C não é alta (precisa ser ACIMA de 30)
        assertFalse(temperatura.isTemperaturaAlta(30));
    }
}