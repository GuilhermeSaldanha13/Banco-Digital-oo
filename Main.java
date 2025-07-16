import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital do Guilherme", new ArrayList<>());

        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme Saldanha");

        Conta cc = new ContaCorrente(guilherme);
        Conta poupanca = new ContaPoupanca(guilherme);

        banco.getContas().add(cc);
        banco.getContas().add(poupanca);

        cc.depositar(1000);
        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
