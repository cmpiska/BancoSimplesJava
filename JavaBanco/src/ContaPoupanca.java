
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("______________Extrato Conta Poupança______________");
        super.imprimirInfosComuns();
    }
}
