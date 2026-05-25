package test;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    Login login = new Login();

    @Test
    public void testLoginCorreto() {
        // Usuário e senha corretos devem autenticar
        assertTrue(login.autenticar("admin", "123"));
    }

    @Test
    public void testLoginSenhaErrada() {
        // Senha incorreta não deve autenticar
        assertFalse(login.autenticar("admin", "456"));
    }

    @Test
    public void testLoginUsuarioErrado() {
        // Usuário incorreto não deve autenticar
        assertFalse(login.autenticar("user", "123"));
    }

    @Test
    public void testLoginAmbosErrados() {
        // Usuário e senha incorretos não devem autenticar
        assertFalse(login.autenticar("user", "000"));
    }

    @Test
    public void testLoginCamposVazios() {
        // Campos vazios não devem autenticar
        assertFalse(login.autenticar("", ""));
    }
}