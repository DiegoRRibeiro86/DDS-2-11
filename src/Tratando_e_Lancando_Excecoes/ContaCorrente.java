package Tratando_e_Lancando_Excecoes;


public class ContaCorrente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    public void depositar (double deposito) {
        if (deposito <= 0) {
            throw new IllegalArgumentException("O valor não pode ser menor que zero.");
        }
        this.saldo += deposito;    // pega o que está em saldo, soma com depósito e reatribui o resultado em saldo.
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException {
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0) {
            throw new SaldoInsuficienteException("Você não possui saldo suficiente.");
        }
        this.saldo -= quantidade;
    }

}
