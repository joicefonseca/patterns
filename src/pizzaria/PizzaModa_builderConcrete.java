package pizzaria;

public class PizzaModa_builderConcrete extends PizzaBuilderAbstract {
    @Override
    public void buildMassa() {
        pizza.setMassa("crocante");
        System.out.println("Massa: Crocante");
    }

    @Override
    public void buildMolho() {
        pizza.setMolho("barbecue");
        System.out.println("Molho: Barbecue");
    }

    @Override
    public void buildIngrediente() {
        pizza.setIngrediente("presunto + mussarela + bacon");
        System.out.println("Ingredientes: Presunto + Mussarela + Bacon");
    }
    
    @Override
    public void printValorPizza() {
        System.out.println("TOTAL: O valor da pizza moda é R$ 50,00.");
    }
}
