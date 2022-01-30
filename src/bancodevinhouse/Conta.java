package bancodevinhouse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Ferrari
 */
public class Conta {

    protected String nome;
    protected String CPF;
    protected double renda;
    protected int numConta;
    protected double saldo;
    protected Agencia agencia;
    protected List<Operacao> operacoes = new ArrayList<>();
    protected List<OperacaoInvestimento> investimentos = new ArrayList<>();

    public void sacar(double valorSaque) {
        if (this.saldo <= 0) {
            System.out.println("Saldo Insuficiente.");
            System.out.println("-----------------------------------------------------  \n");
        } else {
            this.saldo -= valorSaque;
            String dataAtual;
            dataAtual = pegaData();
            this.operacoes.add(new Operacao("Saque", valorSaque, dataAtual));
            System.out.println("Saque realizado com sucesso!! \n");
        }
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor invalido.");
            System.out.println("-----------------------------------------------------  \n");
        } else {
            this.saldo += valorDeposito;
            String dataAtual;
            dataAtual = pegaData();
            this.operacoes.add(new Operacao("Deposito", valorDeposito, dataAtual));
            System.out.println("Deposito realizado com sucesso!! \n");
        }

    }

    public void tirarSaldo() {
        System.out.println(" \n Seu saldo e:" + saldo + "\n");
    }

    public void tirarExtrato() {
        for (Operacao op : this.operacoes) {
            if ("Transferencia".equals(op.getTipo())) {
                System.out.println(" \n Tipo operacao: " + op.getTipo() + "| Valor: " + op.getValor() + " Da conta: " + op.getContaAtual() + " Para conta: " + op.getContaDestino() + "  -  " + op.getData());
            } else {
                System.out.println(" \n Tipo operacao: " + op.getTipo() + "| Valor: " + op.getValor() + "  -  " + op.getData());
            }
        }
    }

    public void transferir(Conta atual, Conta destino, double valor) {
        if (this.saldo <= 0) {
            System.out.println("Saldo Insuficiente.");
            System.out.println("-----------------------------------------------------  \n");
        } else if (atual.equals(destino)) {
            System.out.println("Transferencia invalida.");
            System.out.println("-----------------------------------------------------  \n");
        } else {
            this.saldo -= valor;
            destino.saldo += valor;
            String dataAtual;
            dataAtual = pegaData();
            this.operacoes.add(new Operacao("Transferencia", valor, dataAtual, atual.getNumConta(), destino.getNumConta()));
            System.out.println("Transferencia realizada com sucesso!! \n");
        }
    }

    public void mudarCadastro(String nomeA, double rendaA, int numConta, int numAgenciaA) {
        if (!nomeA.equals("") && !this.getNome().equals(nomeA)) {
            setNome(nomeA);
        }
        if (this.getRenda() != rendaA && rendaA < 0) {
            this.setRenda(rendaA);
        }
        switch (numAgenciaA) {
            case 1:
                this.setAgencia(Agencia.A_001);
                break;
            case 2:
                this.setAgencia(Agencia.A_002);
        }

    }

    public String pegaData() {
        DateTimeFormatter data = DateTimeFormatter.ofPattern("HH:mm:ss   dd/MM/yyyy");
        return data.format(LocalDateTime.now());
    }

    public void investimento(double valorInvestido) {

    }

    public void depositaInvestimento(double valorInvestito, int tipoInvestimento) {

    }

    public void sacarInvestimento(double valorInvestito, int tipoInvestimento) {
    }

    public void tirarExtratoInvestimento() {
        for (OperacaoInvestimento in : this.investimentos) {
            System.out.println(" \n Tipo de Investimento: " + in.getTipo() + "| Valor: " + in.getValor() + "  -  " + in.getData());
            // public ContaInvestimento(String nome, String CPF, double renda, int numConta, Agencia agencia)
        }
    }

    public double totalInvestido() {
        return 0;
    }

    public void rendimento(int meses) {
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public double getRenda() {
        return renda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

}
