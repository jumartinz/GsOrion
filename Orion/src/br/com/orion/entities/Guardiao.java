package br.com.orion.entities;

public class Guardiao extends Pessoa {
    private int idGuardiao;
    private String chatIdTelegram;
    private boolean ativo;

    public Guardiao() {
    }

    public Guardiao(String nome, String telefone, String rua, int numero, int idGuardiao, String chatIdTelegram, boolean ativo) {
        super(nome, telefone, rua, numero);
        this.idGuardiao = idGuardiao;
        this.chatIdTelegram = chatIdTelegram;
        this.ativo = ativo;
    }

    public int getIdGuardiao() {
        return idGuardiao;
    }

    public void setIdGuardiao(int idGuardiao) {
        this.idGuardiao = idGuardiao;
    }

    public String getChatIdTelegram() {
        return chatIdTelegram;
    }

    public void setChatIdTelegram(String chatIdTelegram) {
        this.chatIdTelegram = chatIdTelegram;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    @Override
    public String toString() {
        return "Guardiao{" +
                "\nidGuardiao=" +
                "\nchatIdTelegram='" + chatIdTelegram +
                "\nativo=" + ativo +
                "\n " + super.toString();
    }
}
