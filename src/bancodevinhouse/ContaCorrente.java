package bancodevinhouse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class ContaCorrente extends Conta {

    double chequeEspecial;

    public ContaCorrente(String nome, String CPF, double renda, int numConta, Agencia agencia) {
        super.nome = nome;
        this.CPF = CPF;
        this.renda = renda;
        this.numConta = numConta;
        this.saldo = 0;
        this.agencia = agencia;
        this.limiteCheque();
    }

    public void limiteCheque() {
        this.chequeEspecial = this.renda * 0.1;
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > this.saldo - (0 - this.chequeEspecial)) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo -= valorSaque;
            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
            String dataAtual = data.format(LocalDateTime.now());
            this.operacoes.add(new Operacao("Saque", valorSaque, dataAtual));
            System.out.println("Saque realizado com sucesso!! \n");
        }
    }
    
    @Override
     public void transferir(Conta atual, Conta destino, double valor) {
        if (valor < this.saldo - (0 - this.chequeEspecial)) {
            System.out.println("Saldo Insuficiente.");
            System.out.println("-----------------------------------------------------  \n");
        } else if (atual.getNumConta() == destino.getNumConta()) {
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

}
