package test;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    Produto produto = new Produto();

    @Test
    public void testCalcularDesconto() {
        // 10% de desconto sobre 200 = 180
        assertEquals(180.0, produto.calcularDesconto(200.0), 0.001);
    }

    @Test
    public void testCalcularDescontoValorBaixo() {
        // 10% de desconto sobre 50 = 45
        assertEquals(45.0, produto.calcularDesconto(50.0), 0.001);
    }

    @Test
    public void testFreteGratisAcimaDe100() {
        // Compra de R$150 deve ter frete grátis
        assertTrue(produto.freteGratis(150.0));
    }

    @Test
    public void testFreteGratisAbaixoDe100() {
        // Compra de R$80 NÃO deve ter frete grátis
        assertFalse(produto.freteGratis(80.0));
    }

    @Test
    public void testFreteGratisExatamente100() {
        // Compra de exatamente R$100 NÃO deve ter frete grátis (precisa ser ACIMA)
        assertFalse(produto.freteGratis(100.0));
    }
}