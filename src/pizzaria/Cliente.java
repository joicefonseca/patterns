package pizzaria;

public class Cliente {
    private ModoDeComer modo = new GarfoEFaca();
    
    public void setModo(ModoDeComer novoModo){
        this.modo = novoModo;
    }
    
    public void come(){
       modo.comer();
    }
    
}
