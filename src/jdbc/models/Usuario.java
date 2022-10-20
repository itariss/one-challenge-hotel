package jdbc.models;

public class Usuario {
    private int id;
    private String nomeUsuario;
    private String senha;

    public Usuario(String nomeUsuario, char[] senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = String.valueOf(senha);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }
}
