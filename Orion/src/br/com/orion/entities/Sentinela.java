package br.com.orion.entities;

public class Sentinela {
    private int idSentinela;
    private String local;
    private int limiteAtencao;
    private int limiteAlerta;
    private String status;

    public Sentinela() {
    }

    public Sentinela(int idSentinela, String local, int limiteAtencao, int limiteAlerta, String status) {
        if (limiteAlerta <= limiteAtencao) {
            throw new IllegalArgumentException(
                    "RN03: limitealerta precisa ser maior que limiteAtencao.");
        }
        this.idSentinela = idSentinela;
        this.local = local;
        this.limiteAtencao = limiteAtencao;
        this.limiteAlerta = limiteAlerta;
        this.status = status;
    }

    public String classificarNivel(int valor) {
        if (valor < limiteAtencao) {
            return "NORMAL";
        } else if (valor < limiteAlerta) {
            return "ATENCAO";
        } else {
            return "ALERTA";
        }
    }

    public int getIdSentinela() {
        return idSentinela;
    }

    public void setIdSentinela(int idSentinela) {
        this.idSentinela = idSentinela;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLimiteAtencao() {
        return limiteAtencao;
    }

    public void setLimiteAtencao(int limiteAtencao) {
        this.limiteAtencao = limiteAtencao;
    }

    public int getLimiteAlerta() {
        return limiteAlerta;
    }

    public void setLimiteAlerta(int limiteAlerta) {
        this.limiteAlerta = limiteAlerta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sentinela #" + idSentinela + " - " + local
                + " | limites: atenção " + limiteAtencao + ", alerta " + limiteAlerta
                + " | status: " + status;
    }
}
