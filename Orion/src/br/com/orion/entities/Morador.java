package br.com.orion.entities;

import br.com.orion.entities.Guardiao;
import br.com.orion.entities.Pessoa;

public class Morador extends Pessoa {
    private int idMorador;
    private String tipoNecessidade;
    private boolean consentimentoLgpd;
    private Guardiao guardiaoPrioridade1;
    private Guardiao guardiaoPrioridade2;

    public Morador() {
    }

    public Morador(int idMorador, String nome, String telefone, String rua, int numero,
                   String tipoNecessidade, boolean consentimentoLgpd,
                   Guardiao guardiaoPrioridade1, Guardiao guardiaoPrioridade2) {
        super(nome, telefone, rua, numero);

        if (!consentimentoLgpd) {
            throw new IllegalArgumentException(
                    "RN02: morador sem consentimento LGPD não pode ser cadastrado.");
        }
        if (guardiaoPrioridade1 == null) {
            throw new IllegalArgumentException(
                    "RN01: o morador precisa de pelo menos 1 guardião.");
        }

        this.idMorador = idMorador;
        this.tipoNecessidade = tipoNecessidade;
        this.consentimentoLgpd = consentimentoLgpd;
        this.guardiaoPrioridade1 = guardiaoPrioridade1;
        this.guardiaoPrioridade2 = guardiaoPrioridade2;
    }

    public int getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

    public String getTipoNecessidade() {
        return tipoNecessidade;
    }

    public void setTipoNecessidade(String tipoNecessidade) {
        this.tipoNecessidade = tipoNecessidade;
    }

    public boolean isConsentimentoLgpd() {
        return consentimentoLgpd;
    }

    public void setConsentimentoLgpd(boolean consentimentoLgpd) {
        this.consentimentoLgpd = consentimentoLgpd;
    }

    public Guardiao getGuardiaoPrioridade1() {
        return guardiaoPrioridade1;
    }

    public void setGuardiaoPrioridade1(Guardiao guardiaoPrioridade1) {
        this.guardiaoPrioridade1 = guardiaoPrioridade1;
    }

    public Guardiao getGuardiaoPrioridade2() {
        return guardiaoPrioridade2;
    }

    public void setGuardiaoPrioridade2(Guardiao guardiaoPrioridade2) {
        this.guardiaoPrioridade2 = guardiaoPrioridade2;
    }

    @Override
    public String toString() {
        String segundo = "-";
        if (guardiaoPrioridade2 != null) {
            segundo = guardiaoPrioridade2.getNome();
        }
        return "Morador #" + idMorador + " - " + super.toString()
                + " | necessidade: " + tipoNecessidade
                + " | guardiões: " + guardiaoPrioridade1.getNome() + " (1), "
                + segundo + " (2)";
    }
}