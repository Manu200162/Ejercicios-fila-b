package ejercicio4B;

public abstract class BuilderPlatoParrillero {
    protected PlatoParrillero platoParrillero;

    public PlatoParrillero getPlatoParrillero(){
        return platoParrillero;
    }
    public void createPlatoParrillero(){
        platoParrillero=new PlatoParrillero();
    }

    public abstract void buildTipoDeCarne();
    public abstract  void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
