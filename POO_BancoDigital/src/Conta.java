public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
       
    }

    @Override
    public void sacar(double valorSacado){
        if(this.saldo > valorSacado){
            saldo -= valorSacado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Erro: Valor inválido para concluir saque.");
        }
    }
    

    @Override
    public void depositar(double valorDepositado){
        if(valorDepositado > 0){
            saldo += valorDepositado;
        }else{
            System.out.println("Erro: Valor inválido para concluir depósito.");
        }
    }

    @Override
    public void transferir(double valorTransferido, IConta contaDestino){
        if(valorTransferido <= this.saldo && valorTransferido > 0){
        this.sacar(valorTransferido);
        contaDestino.depositar(valorTransferido);
        }else{
            System.out.println("Erro: Valor inválido para concluir transferência.");
        }

    }

    protected void imprimirInfosComus(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.err.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }



    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }


    public double getSaldo() {
        return this.saldo;
    }

}
