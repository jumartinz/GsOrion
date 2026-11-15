package br.com.orion.main;

import br.com.orion.entities.*;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "TESTE ORION");

      try {

        Guardiao guardiao1 = new Guardiao(
                "Carlos Souza",
                "(11) 91111-1111",
                "Rua das Flores",
                120,
                1,
                "100200300",
                true
        );

        Guardiao guardiao2 = new Guardiao(
                "Ana Lima",
                "(11) 92222-2222",
                "Rua das Flores",
                98,
                2,
                "100200301",
                true
        );

        Morador morador1 = new Morador(
                1,
                "Dona Lurdes",
                "(11) 94444-4444",
                "Rua das Flores",
                110,
                "ACAMADO",
                true,
                guardiao1,
                guardiao2
        );

        Abrigo abrigo1 = new Abrigo(
                1,
                "EMEF Jardim Esperança",
                "Av. Central",
                500,
                120,
                "(11) 3333-0000"
        );

        Sentinela sentinela1 = new Sentinela(
                1,
                "Córrego do Jardim - Rua das Flores",
                300,
                600,
                "ATIVA"
        );

        String nivelLeitura = sentinela1.classificarNivel(720);

        // 5. Instanciando Leitura[cite: 12]
       Leitura leitura1 = new Leitura(
                1,
                720,
                nivelLeitura,
                "15/11/2026 20:00"
        );

        Alerta alerta1 = new Alerta(
                1,
                true,
                "ABERTO"
        );

        Confirmacao confirmacao1 = new Confirmacao(
                1,
                "15/11/2026 20:10",
                "PENDENTE"
        );
        confirmacao1.setMorador(morador1);
        confirmacao1.setGuardiao(guardiao1);


        System.out.println("ELATÓRIO DO SISTEMA ORION");


        System.out.println(guardiao1);
        System.out.println("\n----------------------------------------\n");

        System.out.println(morador1);
        System.out.println("\n----------------------------------------\n");

        System.out.println(abrigo1);
        System.out.println("\n----------------------------------------\n");

        System.out.println(sentinela1);
        System.out.println("-> Resultado da Classificação (Valor 720): " + nivelLeitura);
        System.out.println("\n----------------------------------------\n");

        System.out.println(leitura1);
        System.out.println("\n----------------------------------------\n");

        System.out.println(alerta1);
        System.out.println("\n----------------------------------------\n");

        System.out.println(confirmacao1);
        System.out.println("\n========================================");

    } catch (IllegalArgumentException e) {
        // Captura as exceções lançadas pelas regras de negócio (RN01, RN02, RN03)
        JOptionPane.showMessageDialog(null, "Erro de Validação: " + e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
    }
}
}

