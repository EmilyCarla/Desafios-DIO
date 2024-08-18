 abstract class Lanche{

    public final void prepararLanche(){
        abrirPao();
        adicionarIngredientesPrincipais();
        adicionarCondimentos();
        fecharPao();
        embrulharLanche();
        adicionarBebida();
    }

        private void abrirPao(){
            System.out.println("Abrindo o pão");
        }

        private void fecharPao(
        ){
            System.out.println("Fechando o pão");
        }

        private void embrulharLanche(){
            System.out.println("Embrulhando o lanche");
        }

        private void adicionarBebida(){
            System.out.println("Adicionando bebida de preferencia\n");
        }

        protected abstract void adicionarIngredientesPrincipais();
        protected abstract void adicionarCondimentos();

    
}

