public class LanchoneteMain {
    public static void main(String[] args) throws Exception {
        
        Lanche hamburguer = new SanduicheHamburguer();
        hamburguer.prepararLanche();

        Lanche frango = new SanduicheFrango();
        frango.prepararLanche();;

        Lanche vegetariano = new SanduicheVegetariano();
        vegetariano.prepararLanche();
    }
}
