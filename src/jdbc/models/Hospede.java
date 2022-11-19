package jdbc.models;

import java.sql.Date;

public class Hospede {

    public Hospede(String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone, int idReserva){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this. dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this. telefone = telefone;
        this.idReserva = idReserva;
    }

    public Hospede(int idHospede, String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone, int idReserva){
        this.id = idHospede;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this. dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this. telefone = telefone;
        this.idReserva = idReserva;
    }

    private int id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private String telefone;
    private int idReserva;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdReserva() {
        return idReserva;
    }
}
