package jdbc.dao;

import factory.ConnectionFactory;
import jdbc.models.Reserva;

import java.sql.Connection;

public class HospedeDAO {

    private Connection connection;

    public HospedeDAO(Connection connection) {
        this.connection = connection;
    }

}
