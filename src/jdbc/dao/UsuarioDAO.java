package jdbc.dao;

import jdbc.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean autentica(Usuario usuario) {

        String sql = "SELECT usuario, senha FROM USUARIOS WHERE usuario = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.setString(1, usuario.getNomeUsuario());
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                rst.next();
                if(usuario.getSenha().equals(rst.getString(2)))
                    return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
            return false;
    }


}
