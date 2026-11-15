package br.com.orion.entities;

public class Confirmacao {
    private int idConfirmacao;
    private Morador morador;
    private Guardiao guardiao;
    private String dataHora;
    private String status;

    public Confirmacao() {
    }

    public Confirmacao(int idConfirmacao, String dataHora, String status) {
        this.idConfirmacao = idConfirmacao;
        this.dataHora = dataHora;
        this.status = status;
    }

    public int getIdConfirmacao() {
        return idConfirmacao;
    }

    public void setIdConfirmacao(int idConfirmacao) {
        this.idConfirmacao = idConfirmacao;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Guardiao getGuardiao() {
        return guardiao;
    }

    public void setGuardiao(Guardiao guardiao) {
        this.guardiao = guardiao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String quem = "-";
        if (guardiao != null) {
            quem = guardiao.getNome();
        }
        return "Confirmação #" + idConfirmacao + " | morador: " + morador.getNome()
                + " | status: " + status + " | retirado por: " + quem;
    }
}
