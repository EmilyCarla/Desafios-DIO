public class SanduicheHamburguer extends Lanche {

    @Override
    protected void adicionarIngredientesPrincipais() {
        System.out.println("Adicionando hamburguer, queijo e alface");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando maionese e ketchup");
    }
 
}
