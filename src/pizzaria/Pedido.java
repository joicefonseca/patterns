package pizzaria;

public class Pedido {
    private PizzaBuilderAbstract pizzaBuilderAbstract;

    public void setPizzaBuilder(PizzaBuilderAbstract pb) {
        pizzaBuilderAbstract = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilderAbstract.getPizza();
    }

    public void criarPizza() {
        pizzaBuilderAbstract.criarNovaPizza();
        pizzaBuilderAbstract.buildMassa();
        pizzaBuilderAbstract.buildMolho();
        pizzaBuilderAbstract.buildIngrediente();
    }

    public void criarPizzaSemMolho()
    {
        pizzaBuilderAbstract.criarNovaPizza();
        pizzaBuilderAbstract.buildMassa();
        pizzaBuilderAbstract.buildIngrediente();
    }
}
