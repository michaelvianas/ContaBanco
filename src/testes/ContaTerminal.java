package testes;

import classes.Conta;

import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        String numeroConta = JOptionPane.showInputDialog("Qual o número da conta?");
        minhaConta.setNumeroConta(Integer.parseInt(numeroConta));
        minhaConta.setNomeCliente(JOptionPane.showInputDialog("Qual o nome do cliente?"));
        minhaConta.setAgencia(JOptionPane.showInputDialog("Qual o nome da agência?"));
        String saldo = JOptionPane.showInputDialog("Digite algum saldo a depositar usando ponto antes dos decimais:");
        minhaConta.setSaldo(Double.parseDouble(saldo));

        System.out.println("Olá " + minhaConta.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + minhaConta.getAgencia() +
                ", conta " + minhaConta.getNumero() + " e seu saldo de " + minhaConta.getSaldo()
                + " reais já está disponível para saque.");
    }
}
