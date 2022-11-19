package jdbc.dao;

import com.mysql.cj.result.SqlDateValueFactory;
import jdbc.models.Reserva;

import java.sql.*;

public class ReservaDAO {

    private Connection connection;

    public ReservaDAO(Connection connection) {
        this.connection = connection;
    }


    public void salvar(Reserva reserva) {
        String sql = "INSERT INTO RESERVAS (dataEntrada, dataSaida, valor, formaPagamento) VALUES (?, ?, ?, ?)";
        System.out.println(reserva.getFormaPagamento());

        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setDate(1, new Date(reserva.getDataEntrada().getTime()));
            pstm.setDate(2, new Date(reserva.getDataSaida().getTime()));
            pstm.setFloat(3,reserva.getValor());
            pstm.setString(4, reserva.getFormaPagamento());

            pstm.executeUpdate();

            try (ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()) {
                    reserva.setId(rst.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
