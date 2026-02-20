package br.edu.unicesumar.PA1B.models;


import jakarta.persistence.*;

@Entity
@Table(name = "TBL_ALUNO")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera id automático
    private long id;
    private String nome;
    private String cpf;
    private String email;

    public AlunoModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
