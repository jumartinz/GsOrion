package br.com.orion.entities;

public class Leitura {
    private int idLeitura;
    private int valor;
    private String nivel;
    private String dataHora;

    public Leitura() {
    }

    public Leitura(int idLeitura, int valor, String nivel, String dataHora) {
        this.idLeitura = idLeitura;
        this.valor = valor;
        this.nivel = nivel;
        this.dataHora = dataHora;
    }

    public int getIdLeitura() {
        return idLeitura;
    }

    public void setIdLeitura(int idLeitura) {
        this.idLeitura = idLeitura;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Leitura{" +
                "\nidLeitura=" + idLeitura +
                "\nvalor=" + valor +
                "\nnivel='" + nivel +
                "\ndataHora='" + dataHora;
    }
}
