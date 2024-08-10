public interface IConta {

    void sacar(double valorSacado);
    void depositar(double valorDepositado);
    void transferir(double valorTransferido, IConta contaDestino);
    void imprimirExtrato();

    
} 
