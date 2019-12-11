package pizzaria;

public class PizzaCalabresa_builderConcrete extends PizzaBuilderAbstract {
   @Override
    public void buildMassa() {
        pizza.setMassa("fina");
        System.out.println("Massa: Fina");
    }

    @Override
    public void buildMolho() {
        pizza.setMolho("vermelho");
        System.out.println("Molho: Vermelho");
    }

    @Override
    public void buildIngrediente() {
        pizza.setIngrediente("calabresa + mussarela");
        System.out.println("Ingredientes: Calabresa + Mussarela");
    }
    
    @Override
    public void printValorPizza() {
        System.out.println("TOTAL: O valor da pizza calabresa é R$ 55,00.");
    }
}
