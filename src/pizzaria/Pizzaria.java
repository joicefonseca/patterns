package pizzaria;

public class Pizzaria {
    public static void main(String[] args) {
       Pedido pedido = new Pedido();
       //PizzaBuilderAbstract pizzaModa_buiderConcrete = new PizzaModa_builderConcrete();
       PizzaBuilderAbstract pizzaCalabresa_buiderConcrete = new PizzaCalabresa_builderConcrete();
       //pedido.setPizzaBuilder(pizzaModa_buiderConcrete);
       pedido.setPizzaBuilder(pizzaCalabresa_buiderConcrete);
       System.out.println("-------------------PEDIDO------------------");
       pedido.getPizza();
       pedido.criarPizza();
       
       ModoDeComer modoGarfoEFaca = new GarfoEFaca();
       //ModoDeComer modoMao = new Mao();
       Cliente c = new Cliente();
        c.setModo(modoGarfoEFaca);
        //c.setModo(modoMao);
        c.come();
       
       Factory factory = new Factory();
        PizzaBuilderAbstract pizza;
        try {
            pizza = factory.calculaValorPizza("calabresa");
            if (pizza.isValid()) {
                pizza.printValorPizza();
            }
        } catch (PizzaInvalidaException ex) {
            System.err.println("Nao consigo calcular o valor dessa pizza");
        }
    }
}
