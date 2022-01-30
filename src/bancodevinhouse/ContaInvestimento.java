package bancodevinhouse;

import java.util.ArrayList;
import java.util.List;

public class ContaInvestimento extends Conta {

    protected double valorInvestidoA;
    protected double valorInvestidoM;
    protected double valorInvestidoB;

    public ContaInvestimento(String nome, String CPF, double renda, int numConta, Agencia agencia) {
        this.nome = nome;
        this.CPF = CPF;
        this.renda = renda;
        this.numConta = numConta;
        this.saldo = 0;
        this.agencia = agencia;
    }

    @Override
    public void depositaInvestimento(double valorInvestito, int tipoInvestimento) {
        switch (tipoInvestimento) {
            case 1:
                investeA(valorInvestito);
                break;
            case 2:
                investeM(valorInvestito);
                break;
            case 3:
                investeB(valorInvestito);
                break;
            default:
                System.out.println("Opcao invalida!!");
                break;
        }
    }

    public void investeA(double valorInvestido) {
        if (valorInvestido < 10000) {
            System.out.println("Valor Insuficiente");
        } else {
            this.saldo -= valorInvestido;
            this.valorInvestidoA = valorInvestido;
            String dataAtual;
            dataAtual = pegaData();
            this.investimentos.add(new OperacaoInvestimento("Alto Risco", "Foi investido:", valorInvestido, dataAtual));

        }
    }

    public void investeM(double valorInvestido) {
        if (valorInvestido < 1000) {
            System.out.println("Valor Insuficiente");
        } else {
            this.saldo -= valorInvestido;
            this.valorInvestidoA = valorInvestido;
            String dataAtual;
            dataAtual = pegaData();
            this.investimentos.add(new OperacaoInvestimento("Medio Risco", "Foi investido:", valorInvestido, dataAtual));

        }
    }

    public void investeB(double valorInvestido) {
        if (valorInvestido < 10000) {
            System.out.println("Valor Insuficiente");
        } else {
            this.saldo -= valorInvestido;
            this.valorInvestidoA = valorInvestido;
            String dataAtual;
            dataAtual = pegaData();
            this.investimentos.add(new OperacaoInvestimento("Baixo Risco", "Foi investido:", valorInvestido, dataAtual));

        }
    }

    @Override
    public void sacarInvestimento(double valorInvestito, int tipoInvestimento) {
        switch (tipoInvestimento) {
            case 1:
                sacarInvestimentoA(valorInvestito);
                break;
            case 2:
                sacarInvestimentoM(valorInvestito);
                break;
            case 3:
                sacarInvestimentoB(valorInvestito);
                break;
            default:
                System.out.println("Opcao invalida!!");
                break;
        }
    }

    public void sacarInvestimentoA(double valorSaque) {
        if (valorSaque > this.valorInvestidoA) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo += valorSaque;
            this.valorInvestidoA -= valorSaque;
            String dataAtual;
            dataAtual = pegaData();
            this.investimentos.add(new OperacaoInvestimento("Investido Alto Risco", "Foi sacado:", valorInvestidoA, dataAtual));

        }
    }

    public void sacarInvestimentoB(double valorSaque) {
         if (valorSaque > this.valorInvestidoB) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo += valorSaque;
            this.valorInvestidoB -= valorSaque;
            String dataAtual;
            dataAtual = pegaData();
            this.investimentos.add(new OperacaoInvestimento("Saque investido Medio Risco", "Foi sacado:", valorInvestidoM, dataAtual));

        }
    }

    public void sacarInvestimentoM(double valorSaque) {
        if (valorSaque > this.valorInvestidoB) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo += valorSaque;
            this.valorInvestidoB -= valorSaque;
            String dataAtual;
            dataAtual = pegaData();
            this.investimentos.add(new OperacaoInvestimento("Saque investido Baixo Risco", "Foi sacado:", valorInvestidoB, dataAtual));

        }
    }
    
    @Override
    public double totalInvestido(){
       double total= this.valorInvestidoA+ this.valorInvestidoM+ this.valorInvestidoB;
       return total;
    }
    
    public void simulaAlto() {

    }

    public void simulaMedio() {

    }

    public void simulaBaixo() {

    }
    
    @Override
    public void tirarExtrato() { 
        System.out.println("Conta: \n");
        for (Operacao op : this.operacoes) {
            if ("Transferencia".equals(op.getTipo())) {
                System.out.println(" \n Tipo operacao: " + op.getTipo() + "| Valor: " + op.getValor() + " Da conta: " + op.getContaAtual() + " Para conta: " + op.getContaDestino() + "  -  " + op.getData());
            } else {
                System.out.println(" \n Tipo operacao: " + op.getTipo() + "| Valor: " + op.getValor() + "  -  " + op.getData());
            }
        }
        for (OperacaoInvestimento in : this.investimentos){
            System.out.println(" \n Tipo de Investimento: " + in.getTipo() + "| Valor: " + in.getValor() + "  -  " + in.getData());
        }
    }
}
