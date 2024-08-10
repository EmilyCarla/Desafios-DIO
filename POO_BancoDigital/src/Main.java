public class Main {
    public static void main(String[] args) throws Exception {

        Cliente ana = new Cliente();
        ana.setNome("Ana");
        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Conta cc = new ContaCorrente(ana);
        Conta cp = new ContaPoupanca(joao);

        cc.depositar(500);
        cc.imprimirExtrato();
        cc.sacar(600);
        cc.imprimirExtrato();

        cp.depositar(200);
        cp.imprimirExtrato();
        cp.sacar(50);
        cp.imprimirExtrato();

        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
