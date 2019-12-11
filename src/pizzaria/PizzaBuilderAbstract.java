package pizzaria;

public abstract class PizzaBuilderAbstract {
    
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void criarNovaPizza() {
        pizza = new Pizza();
    }

    public abstract void buildMassa();

    public abstract void buildMolho();

    public abstract void buildIngrediente();
    
    public abstract void printValorPizza();
    
    public boolean  isValid(){
        return true;
    }
}
