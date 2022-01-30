package bancodevinhouse;

import java.util.Scanner;

public class ContaPoupanca extends Conta {

    Scanner scan = new Scanner(System.in);

    public ContaPoupanca(String nome, String CPF, double renda, int numConta, Agencia agencia) {
        this.nome = nome;
        this.CPF = CPF;
        this.renda = renda;
        this.numConta = numConta;
        this.saldo = 0;
        this.agencia = agencia;
    }

    
    @Override
    public void rendimento(int meses) {
        double saldoRendeu;
        if (meses <= 3 && meses >= 0) {
            saldoRendeu = (saldo * 0.01) * meses;
            System.out.println("Seu dinheiro ira render: " + saldoRendeu + "reais");
        } else if (meses <= 6 && meses > 4) {
            saldoRendeu = (saldo * 0.02) * meses;
            System.out.println("Seu dinheiro ira render: " + saldoRendeu + "reais");
        } else if (meses <= 7 && meses >= 11) {
            saldoRendeu = (saldo * 0.03) * meses;
            System.out.println("Seu dinheiro ira render: " + saldoRendeu + "reais");
        } else if (meses >= 12) {
            saldoRendeu = (saldo * 0.05) * meses;
            System.out.println("Seu dinheiro ira render: " + saldoRendeu + "reais");
        }
    }

}
