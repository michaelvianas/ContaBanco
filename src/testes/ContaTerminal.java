package testes;

import classes.Conta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta conta = new Conta();

        String numeroConta = JOptionPane.showInputDialog("Qual o número da conta?");
        conta.setNumeroConta(Integer.parseInt(numeroConta));
        conta.setNomeCliente(JOptionPane.showInputDialog("Qual o nome do cliente?"));
        conta.setAgencia(JOptionPane.showInputDialog("Qual o nome da agência?"));
        String saldo = JOptionPane.showInputDialog("Digite algum saldo a depositar usando ponto antes dos decimais:");
        conta.setSaldo(Double.parseDouble(saldo));

        System.out.println("Olá " + conta.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() +
                ", conta " + conta.getNumero() + " e seu saldo de " + conta.getSaldo()
                + " reais já está disponível para saque.");

    }
}
