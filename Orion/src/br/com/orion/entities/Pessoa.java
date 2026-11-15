package br.com.orion.entities;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String rua;
    protected int numero;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String rua, int numero) {
        this.nome = nome;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "\nnome='" + nome +
                "\ntelefone='" + telefone +
                "\nrua='" + rua +
                "\nnumero=" + numero;
    }
}