package bancodevinhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    Scanner scan = new Scanner(System.in);
    List<Conta> listaContas = new ArrayList<>();

    public void criaContaC() {
        System.out.println("Digite seu nome:");
        String nome = scan.next();
        System.out.println("Digite seu CPF:");
        String cpf = scan.next();
        while (cpf.length() < 11) {
            System.out.println("Seu CPF e invalido! Por favor digite sem pontos e traços. \n");
            cpf = scan.next();
        }
        System.out.println("Digite sua renda Mensal:");
        double renda = scan.nextDouble();
        System.out.println("Escolha qual agencia fica mais proxima de voce");
        System.out.println("1 para Florianopolis");
        System.out.println("2 para Sao Jose");
        int numAgencia = scan.nextInt();
        if (numAgencia == 1) {
            ContaCorrente conta1 = new ContaCorrente(nome, cpf, renda, listaContas.size() + 1, Agencia.A_001);
            listaContas.add(conta1);
            System.out.println("Sua conta foi criada no Banco DevinMoney");
            System.out.println("O numero da sua conta e:" + conta1.getNumConta());
            System.out.println("Seja muito bem vindo \n");
        } else {
            ContaCorrente conta1 = new ContaCorrente(nome, cpf, renda, listaContas.size() + 1, Agencia.A_002);
            listaContas.add(conta1);
            System.out.println("Sua conta foi criada no Banco DevinMoney");
            System.out.println("O numero da sua conta e:" + conta1.getNumConta());
            System.out.println("Seja muito bem vindo \n");
        }

    }

    public void criaContaP() {
        System.out.println("Digite seu nome:");
        String nome = scan.next();
        System.out.println("Digite seu CPF:");
        String cpf = scan.next();
        while (cpf.length() < 11) {
            System.out.println("Seu CPF e invalido! Por favor digite sem pontos e tracos. \n");
            cpf = scan.next();
        }
        System.out.println("Digite sua renda Mensal:");
        double renda = scan.nextDouble();
        System.out.println("Escolha qual agencia fica mais proxima de voce");
        System.out.println("1 para Florianopolis");
        System.out.println("2 para Sao Jose");
        int numAgencia = scan.nextInt();
        if (numAgencia == 1) {
            ContaPoupanca conta1 = new ContaPoupanca(nome, cpf, renda, listaContas.size() + 1, Agencia.A_001);
            listaContas.add(conta1);
            System.out.println("Sua conta foi criada no Banco DevinMoney");
            System.out.println("O numero da sua conta e:" + conta1.getNumConta());
            System.out.println("Seja muito bem vindo \n");
        } else {
            ContaPoupanca conta1 = new ContaPoupanca(nome, cpf, renda, listaContas.size() + 1, Agencia.A_002);
            listaContas.add(conta1);
            System.out.println("Sua conta foi criada no Banco DevinMoney");
            System.out.println("O numero da sua conta e:" + conta1.getNumConta());
            System.out.println("Seja muito bem vindo \n");
        }

    }

    public void criaContaI() {
        System.out.println("Digite seu nome:");
        String nome = scan.next();
        System.out.println("Digite seu CPF:");
        String cpf = scan.next();
        while (cpf.length() < 11) {
            System.out.println("Seu CPF e invalido! Por favor digite sem pontos e tracos. \n");
            cpf = scan.next();
        }
        System.out.println("Digite sua renda Mensal:");
        double renda = scan.nextDouble();
        System.out.println("Escolha qual agencia fica mais proxima de voce");
        System.out.println("1 para Florianopolis");
        System.out.println("2 para Sao Jose");
        int numAgencia = scan.nextInt();
        if (numAgencia == 1) {
            ContaInvestimento conta1 = new ContaInvestimento(nome, cpf, renda, listaContas.size() + 1, Agencia.A_001);
            listaContas.add(conta1);
            System.out.println("Sua conta foi criada no Banco DevinMoney");
            System.out.println("O numero da sua conta e:" + conta1.getNumConta());
            System.out.println("Seja muito bem vindo \n");
        } else {
            ContaInvestimento conta1 = new ContaInvestimento(nome, cpf, renda, listaContas.size() + 1, Agencia.A_002);
            listaContas.add(conta1);
            System.out.println("Sua conta foi criada no Banco DevinMoney");
            System.out.println("O numero da sua conta e:" + conta1.getNumConta());
            System.out.println("Seja muito bem vindo \n");
        }

    }

    public void deposito(double valor, int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.depositar(valor);
                System.out.println("Saldo atual :" + c.getSaldo());
                break;
            }
        }
    }

    public void saldo(int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.tirarSaldo();
                break;
            }
        }
    }

    public void saque(double valor, int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.sacar(valor);
                System.out.println("Saldo atual :" + c.getSaldo());
                break;
            }
        }
    }

    public void dInveste(int numConta, double valorInvestido, int tipo) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.depositaInvestimento(valorInvestido, tipo);
                System.out.println("Seu investimento foi realizado com sucesso!!s");
            }
        }
    }

    public void sInveste(int numConta, double valorInvestido, int tipo) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.sacarInvestimento(valorInvestido, tipo);
                System.out.println("Seu saque foi realizado com sucesso!!");
            }
        }
    }

    public void extrato(int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.tirarExtrato();
                System.out.println("Seu saldo atual e: " + c.getSaldo());
                break;
            }
        }
    }

    public void extratoInvestimento(int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.tirarExtratoInvestimento();
                break;
            }
        }
    }

    public void listarContas() {
        for (Conta c : this.listaContas) {
            System.out.println("Conta: " + c.getNumConta() + " Nome: " + c.getNome());
        }
    }

    public void contasNegativas() {
        for (Conta c : this.listaContas) {
            if (c.saldo < 0) {
                System.out.println("Conta: " + c.getNumConta() + " Nome: " + c.getNome() + " Saldo: " + c.getSaldo());
            }
        }
    }

    public void extratoCliente(int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.tirarExtrato();
                break;
            }
        }
    }

    public void trasferir(int numOrigem, int numDestino, double valorTrasferido) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numOrigem) {
                for (Conta d : this.listaContas) {
                    if (d.getNumConta() == numDestino && c.getNumConta() != numDestino) {
                        c.transferir(c, d, valorTrasferido);
                    }
                }
            }
        }
    }

    public void alterarDados(String nome, double renda, int numConta, int numAgencia) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                c.mudarCadastro(nome, renda, numConta, numAgencia);
            }
            System.out.println("Dados atualizados com sucesso!!");
            break;
        }
    }

    public String verConta(int numConta) {
        for (Conta c : this.listaContas) {
            if (c.getNumConta() == numConta) {
                String tipoConta;
                tipoConta = c.getClass().getSimpleName();
                return tipoConta;
            }

        }
        return null;

    }

    public void somarInvertimentos() {
        double totalBanco = 0;
        for (Conta c : this.listaContas) {
            String tipoConta;
            tipoConta = c.getClass().getSimpleName();
            if ("ContaInvestimento".equals(tipoConta)) {
                totalBanco += c.totalInvestido();
            }
        }
        System.out.println("O banco possui: " + totalBanco + "de investidores");
    }

    public void menuC(int menuC, int conta) {
        switch (menuC) {
            case 1:
                System.out.println("Digite o valor a ser sacado");
                double valorC = scan.nextDouble();
                saque(valorC, conta);
                break;
            case 2:
                System.out.println("Digite o valor a ser depositado");
                double valorB = scan.nextDouble();
                deposito(valorB, conta);
                menuC = -1;
                break;
            case 3:
                saldo(conta);
                break;
            case 4:
                extrato(conta);
                break;
            case 5:
                System.out.println("Digite seu nome:");
                String nomeA = scan.next();
                System.out.println("Digite sua renda mensal:");
                double rendaA = scan.nextDouble();
                System.out.println("Escolha qual agencia fica mais proxima de voce");
                System.out.println("1 para Florianopolis");
                System.out.println("2 para Sao Jose");
                int agenciaA = scan.nextInt();
                alterarDados(nomeA, rendaA, conta, agenciaA);
                break;
            case 6:
                System.out.println("Digite a conta que ira receber a transferencia:");
                int contaDestino = scan.nextInt();                              
                System.out.println("Digite o valor que deseja transferir");
                double valorTrasferido = scan.nextDouble();
                trasferir(conta, contaDestino, valorTrasferido);
                break;
            case 0:
                break;
            default:
                System.out.println("Opcao invalida.");
                System.out.println("-----------------------------------------------------  \n");
        }
    }

    public void menuP(int menuP, int conta) {
        switch (menuP) {
            case 1:
                System.out.println("Digite o valor a ser sacado");
                double valorC = scan.nextDouble();
                saque(valorC, conta);
                break;
            case 2:
                System.out.println("Digite o valor a ser depositado");
                double valorB = scan.nextDouble();
                deposito(valorB, conta);
                break;
            case 3:
                saldo(conta);
                break;
            case 4:
                extrato(conta);
                break;
            case 5:
                System.out.println("Digite seu nome:");
                String nomeA = scan.next();
                System.out.println("Digite sua renda mensal:");
                double rendaA = scan.nextDouble();
                System.out.println("Escolha qual agencia fica mais proxima de voce");
                System.out.println("1 para Florianopolis");
                System.out.println("2 para Sao Jose");
                int agenciaA = scan.nextInt();
                alterarDados(nomeA, rendaA, conta, agenciaA);
                break;
            case 6:
                System.out.println("Digite a conta que ira receber a transferencia:");
                int contaDestino = scan.nextInt();
                System.out.println("Digite o valor que deseja transferir");
                double valorTrasferido = scan.nextDouble();
                trasferir(conta, contaDestino, valorTrasferido);
                break;
            case 7:
                System.out.println("Digite quantos meses dejesa simular:");
                int meses = scan.nextInt();
                for (Conta p : this.listaContas) {
                    if (p.getNumConta() == conta) {
                        p.rendimento(meses);
                    }
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Opcao invalida.");
                System.out.println("-----------------------------------------------------  \n");
                ;

        }

    }

    public void menuI(int menuI, int conta) {

        switch (menuI) {
            case 1:
                System.out.println("Digite o valor a ser sacado");
                double valorC = scan.nextDouble();
                saque(valorC, conta);
                break;
            case 2:
                System.out.println("Digite o valor a ser depositado");
                double valorB = scan.nextDouble();
                deposito(valorB, conta);
                break;
            case 3:
                saldo(conta);
                break;
            case 4:
                extrato(conta);
                break;
            case 5:
                System.out.println("Digite seu nome:");
                String nomeA = scan.next();
                System.out.println("Digite sua renda mensal:");
                double rendaA = scan.nextDouble();
                System.out.println("Escolha qual agencia fica mais proxima de voce");
                System.out.println("1 para Florianopolis");
                System.out.println("2 para Sao Jose");
                int agenciaA = scan.nextInt();
                alterarDados(nomeA, rendaA, conta, agenciaA);
                break;
            case 6:
                System.out.println("Digite a conta que ira receber a transferencia:");
                int contaDestino = scan.nextInt();
                System.out.println("Digite o valor que deseja transferir");
                double valorTrasferido = scan.nextDouble();
                trasferir(conta, contaDestino, valorTrasferido);
                break;
            case 7:
                System.out.println("-----------------------------------------------------");
                System.out.println("INVESTIMENTOS \n");
                System.out.println("-Digite 1 para investir:");
                System.out.println("-Digite 2 para sacar um investimento");
                System.out.println("-Digite 3 para simular");
                System.out.println("-Digite 4 para verificar o extrato dos seus investimentos:");
                System.out.println("-Ou digite 0 para voltar");
                int invest = scan.nextInt();
                switch (invest) {
                    case 1:
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Os investimentos comecam em R$ 100,00 reais \n");
                        System.out.println("-Digite o dipo de investimento que voce deseja:");
                        System.out.println("-1 para Alto risco");
                        System.out.println("-2 para Medio risco");
                        System.out.println("-3 para Baixo risco");
                        int tipoInvestimento = scan.nextInt();
                        System.out.println("Digite o valor que vc deseja investir:");
                        double valorInvestimento = scan.nextDouble();
                        dInveste(conta, valorInvestimento, tipoInvestimento);
                        break;
                    case 2:
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Digite o dipo de investimento que voce deseja sacar:");
                        System.out.println("1 para Alto risco");
                        System.out.println("2 para Medio risco");
                        System.out.println("3 para Baixo risco");
                        tipoInvestimento = scan.nextInt();
                        System.out.println("Digite o valor que vc deseja sacar:");
                        valorInvestimento = scan.nextDouble();
                        sInveste(conta, valorInvestimento, tipoInvestimento);
                        break;
                    case 3:
                        break;
                    case 4:
                        extratoInvestimento(conta);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                        System.out.println("-----------------------------------------------------  \n");
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Opcao invalida.");
                System.out.println("-----------------------------------------------------  \n");
        }
    }

}
