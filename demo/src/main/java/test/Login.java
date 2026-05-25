package test;

public class Login {

    public boolean autenticar(String usuario, String senha) {
        return "admin".equals(usuario) && "123".equals(senha);
    }
}