/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancodevinhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael Ferrari
 */
public class BancoDevinHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco devBanco = new Banco();
        int menuPrincipal = -1;
        while (menuPrincipal != 0) {
            System.out.println("--Seja Bem vindo ao DevinMoney--");
            System.out.println("-----------------------------------------------------");
            System.out.println("-Digite uma opcao:");
            System.out.println("-Digite 1 para cadastrar.");
            System.out.println("-Digite 2 caso ja seja cliente.");
            System.out.println("-Digite 3 caso seja um colaborador.");
            System.out.println("-Digite 0 para sair.");
            System.out.println("-----------------------------------------------------");
            menuPrincipal = scan.nextInt();
            switch (menuPrincipal) {
                case 1:
                    int menuContas = -1;
                    System.out.println("Escolha o seu tipo de conta: \n");
                    System.out.println("Digite 1 para Conta Corrente.");
                    System.out.println("Digite 2 para Conta Poupanca.");
                    System.out.println("Digite 3 para Conta Investimento.");
                    System.out.println("Ou digite 0 para voltar ao menu anterior.");
                    menuContas = scan.nextInt();
                    switch (menuContas) {
                        case 1:
                            devBanco.criaContaC();
                            break;
                        case 2:
                            devBanco.criaContaP();
                            break;
                        case 3:
                            devBanco.criaContaI();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opcao invalida.");
                            System.out.println("-----------------------------------------------------  \n");
                    }

                    break;
                case 2:
                    int menuCliente = -1;
                    System.out.println("Digite o numero da sua conta: \n");
                    int conta = scan.nextInt();
                    String tipoConta;
                    tipoConta = devBanco.verConta(conta);
                    while (menuCliente != 0) {
                        if ("ContaPoupanca".equals(tipoConta)) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("--Painel do Cliente!-- \n");
                            System.out.println("-Digite 1 para Sacar.");
                            System.out.println("-Digite 2 para Depositar.");
                            System.out.println("-Digite 3 para tirar um Saldo.");
                            System.out.println("-Digite 4 para tirar um Extrato.");
                            System.out.println("-Digite 5 para alterar os dados Cadastrais.");
                            System.out.println("-Digite 6 para realizar uma transferencia.");
                            System.out.println("-Digite 7 para simular o rendimento da sua aplicacao.");
                            System.out.println("-Ou digite 0 para voltar ao menu anterior.");
                            System.out.println("-----------------------------------------------------");
                            menuCliente = scan.nextInt();
                            devBanco.menuP(menuCliente, conta);
                        } else if ("ContaCorrente".equals(tipoConta)) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("--Painel do Cliente!-- \n");
                            System.out.println("-Digite 1 para Sacar");
                            System.out.println("-Digite 2 para Depositar");
                            System.out.println("-Digite 3 para tirar um Saldo");
                            System.out.println("-Digite 4 para tirar um Extrato");
                            System.out.println("-Digite 5 para alterar os dados Cadastrais");
                            System.out.println("-Digite 6 para realizar uma transferencia");
                            System.out.println("-Ou digite 0 para voltar ao menu anterior.");
                            System.out.println("-----------------------------------------------------");
                            menuCliente = scan.nextInt();
                            devBanco.menuP(menuCliente, conta);
                        } else if ("ContaInvestimento".equals(tipoConta)) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("--Painel do Cliente!--\n");
                            System.out.println("-Digite 1 para Sacar");
                            System.out.println("-Digite 2 para Depositar");
                            System.out.println("-Digite 3 para tirar um Saldo");
                            System.out.println("-Digite 4 para tirar um Extrato");
                            System.out.println("-Digite 5 para alterar os dados Cadastrais");
                            System.out.println("-Digite 6 para realizar uma transferencia");
                            System.out.println("-Digite 7 para investimentos");
                            System.out.println("-Ou digite 0 para voltar ao menu anterior.");
                            System.out.println("-----------------------------------------------------");
                            menuCliente = scan.nextInt();
                            devBanco.menuI(menuCliente, conta);
                        } else {
                            System.out.println("Conta nao encontrada.");
                            System.out.println("-----------------------------------------------------  \n");
                            break;
                        }
                    }
                    break;
                case 3:
                    int menuColaborador = -1;
                    while (menuColaborador != 0) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("--Painel do Colaborador!--\n");
                        System.out.println("-Digite 1 para Listar todas as contas");
                        System.out.println("-Digite 2 para Listar todas as contas negativadas");
                        System.out.println("-Digite 3 para listar todo valor investido");
                        System.out.println("-Digite 4 para consultar todas as transacoes de um cliente");
                        System.out.println("-Ou digite 0 para voltar ao menu anterior.");
                        menuColaborador = scan.nextInt();
                        switch (menuColaborador) {
                            case 1:
                                devBanco.listarContas();
                                break;
                            case 2:
                                devBanco.contasNegativas();
                                break;
                            case 3:
                                devBanco.somarInvertimentos();
                                break;
                            case 4:
                                System.out.println("Digite a conta que sera consultada:");
                                int numConta = scan.nextInt();
                                devBanco.extratoCliente(numConta);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcao invalida.");
                                System.out.println("-----------------------------------------------------  \n");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opcao invalida.");
                    System.out.println("-----------------------------------------------------  \n");

            }
        }
    }

}
