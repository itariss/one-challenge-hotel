package jdbc.controllers;

import factory.ConnectionFactory;
import jdbc.dao.ReservaDAO;
import jdbc.models.Reserva;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Date;

public class ReservaController {



    private ReservaDAO reservaDAO;

    public ReservaController() throws SQLException {
        Connection connection = new ConnectionFactory().conexaoPadrao();
        this.reservaDAO = new ReservaDAO(connection);
    }

    public void salvar(Reserva reserva) {
        this.reservaDAO.salvar(reserva);
    }

    public float calculaValorReserva(Date dataEntrada, Date dataSaida) {
        if(dataSaida != null && dataEntrada != null) {
            float valorReserva = Duration.between(dataEntrada.toInstant(), dataSaida.toInstant()).toDays() * 120;
            return valorReserva;
        }
        return 0.00f;
    }
}
