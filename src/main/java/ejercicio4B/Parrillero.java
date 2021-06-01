package ejercicio4B;

public class Parrillero {
    private BuilderPlatoParrillero builderPlatoParrillero;

    public PlatoParrillero getPlatoParrillero() {
        return builderPlatoParrillero.getPlatoParrillero();
    }

    public void setBuilderPlatoParrillero(BuilderPlatoParrillero builderPlatoParrillero) {
        this.builderPlatoParrillero = builderPlatoParrillero;
    }
    public void cocinar(){
        this.builderPlatoParrillero.createPlatoParrillero();
        this.builderPlatoParrillero.buildTipoDeCarne();
        this.builderPlatoParrillero.buildSaborRefresco();
        this.builderPlatoParrillero.buildGuarniciones();
    }
}
