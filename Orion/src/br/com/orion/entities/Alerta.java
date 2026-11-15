package br.com.orion.entities;

public class Alerta {
    private int idAlerta;
    private boolean enviadoTelegram;
    private String status;

    public Alerta() {
    }

    public Alerta(int idAlerta, boolean enviadoTelegram, String status) {
        this.idAlerta = idAlerta;
        this.enviadoTelegram = enviadoTelegram;
        this.status = status;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public boolean isEnviadoTelegram() {
        return enviadoTelegram;
    }

    public void setEnviadoTelegram(boolean enviadoTelegram) {
        this.enviadoTelegram = enviadoTelegram;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String enviado = "N";
        if (enviadoTelegram) {
            enviado = "S";
        }
        return "Alerta #" + idAlerta + " | status: " + status
                + " | enviado ao Telegram: " + enviado;
    }
}

