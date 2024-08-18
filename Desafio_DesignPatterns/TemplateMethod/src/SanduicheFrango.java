public class SanduicheFrango extends Lanche {

    @Override
    protected void adicionarIngredientesPrincipais() {
        System.out.println("Adicionando peito de frango grelhado, queijo e alface");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando molho e cheddar");
    }
}
