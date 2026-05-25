package test;
import org.junit.Test;
import static org.junit.Assert.*;

public class VerificadorTest {

    Verificador verificador = new Verificador();

    @Test
    public void testNumeroPar() {
        assertTrue(verificador.isPar(4));
    }

    @Test
    public void testNumeroImpar() {
        assertFalse(verificador.isPar(7));
    }

    @Test
    public void testZeroEPar() {
        // Zero é considerado par
        assertTrue(verificador.isPar(0));
    }

    @Test
    public void testNumeroNegativoPar() {
        // -6 é par
        assertTrue(verificador.isPar(-6));
    }

    @Test
    public void testNumeroPositivo() {
        assertTrue(verificador.isPositivo(10));
    }

    @Test
    public void testNumeroNegativo() {
        assertFalse(verificador.isPositivo(-3));
    }

    @Test
    public void testZeroNaoEPositivo() {
        // Zero não é positivo
        assertFalse(verificador.isPositivo(0));
    }
}