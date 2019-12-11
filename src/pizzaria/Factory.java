package pizzaria;

public class Factory {
    public  PizzaBuilderAbstract calculaValorPizza(String pizzaDesejada) throws PizzaInvalidaException {
        if (pizzaDesejada.equalsIgnoreCase("moda")) {
            return new PizzaModa_builderConcrete();
        } else if (pizzaDesejada.equalsIgnoreCase("calabresa")) {
            return new PizzaCalabresa_builderConcrete();
        }
        throw new PizzaInvalidaException();
    }
}
