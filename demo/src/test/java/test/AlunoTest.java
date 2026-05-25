package test;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlunoTest {

    Aluno aluno = new Aluno();

    @Test
    public void testCalcularMedia() {
        // Média de 8 e 6 = 7
        assertEquals(7.0, aluno.calcularMedia(8.0, 6.0), 0.001);
    }

    @Test
    public void testCalcularMediaOutrosValores() {
        // Média de 10 e 5 = 7.5
        assertEquals(7.5, aluno.calcularMedia(10.0, 5.0), 0.001);
    }

    @Test
    public void testAlunoAprovadoMediaExata() {
        // Média igual a 7 deve aprovar
        assertTrue(aluno.isAprovado(7.0, 7.0));
    }

    @Test
    public void testAlunoAprovadoMediaAlta() {
        // Média de 9 deve aprovar
        assertTrue(aluno.isAprovado(9.0, 9.0));
    }

    @Test
    public void testAlunoReprovado() {
        // Média de 4 e 5 = 4.5 — reprovado
        assertFalse(aluno.isAprovado(4.0, 5.0));
    }

    @Test
    public void testAlunoReprovadoMediaAbaixo7() {
        // Média de 6.9 — reprovado
        assertFalse(aluno.isAprovado(6.0, 7.8));
    }
}