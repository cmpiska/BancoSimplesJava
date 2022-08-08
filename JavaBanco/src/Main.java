public class Main {

    public static void main(String[] args) {
        Cliente claudio = new Cliente();
        claudio.setNome("Claudio");

        Conta cc = new ContaCorrente(claudio);
        Conta poupanca = new ContaPoupanca(claudio);

        cc.depositar(1000);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
