package jdbc.models;


import java.util.Date;

public class Reserva {

    private int id;
    private Date dataEntrada;
    private Date dataSaida;
    private float valor;
    private EnumFormaPagamento formaPagamento;


    public Reserva (Date dataEntrada, Date dataSaida, float valor, String formaPagamento) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = EnumFormaPagamento.valueOf(formaPagamento.toUpperCase().replace("\s", "_"));
    }

    public Reserva (Integer id, Date dataEntrada, Date dataSaida, float valor, String formaPagamento) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = EnumFormaPagamento.valueOf(formaPagamento.toUpperCase().replace("\s", "_"));
    }

    public int getId() {
        return id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public float getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        if(formaPagamento.ordinal() == 0) {

        return "Cartão de crédito";
        }
        if (formaPagamento.ordinal() == 1) {
            return "Cartão de débito";
        }

        return "Dinheiro";

    }



    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", valor=" + valor +
                ", formaPagamento=" + formaPagamento +
                '}';
    }
}
