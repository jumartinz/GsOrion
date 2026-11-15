package br.com.orion.entities;

public class Abrigo {
    private int idAbrigo;
    private String nome;
    private String rua;
    private int numero;
    private int capacidade;
    private String telefone;

    public Abrigo() {
    }

    public Abrigo(int idAbrigo, String nome, String rua, int numero, int capacidade, String telefone) {
        this.idAbrigo = idAbrigo;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.capacidade = capacidade;
        this.telefone = telefone;
    }

    public int getIdAbrigo() {
        return idAbrigo;
    }

    public void setIdAbrigo(int idAbrigo) {
        this.idAbrigo = idAbrigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Abrigo{" +
                "\nidAbrigo=" + idAbrigo +
                "\nnome='" + nome +
                "\nrua='" + rua +
                "\nnumero=" + numero +
                "\ncapacidade=" + capacidade +
                "\ntelefone='" + telefone;
    }
}
