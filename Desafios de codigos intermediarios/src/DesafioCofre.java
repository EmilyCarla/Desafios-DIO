//Descrição do problema:
//Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: 
//um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class DesafioCofre {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
        CofreDigital senhaDigital = new CofreDigital(scanner.nextInt());
        if(senhaDigital.validarSenha(scanner.nextInt())){
          senhaDigital.imprimirInformacoes();
          System.out.println("Cofre aberto!");
        }else{
          senhaDigital.imprimirInformacoes();
          System.out.println("Senha incorreta!");
        } 
  }else{
    CofreFisico fisico = new CofreFisico();
    fisico.imprimirInformacoes();
  }
  scanner.close();
  }
}
