package ejercicio4B;

public class Bife extends BuilderPlatoParrillero{
    @Override
    public void buildTipoDeCarne() {
        platoParrillero.setTipoDeCarne("bife");
    }

    @Override
    public void buildSaborRefresco() {
        platoParrillero.setSaborDeRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        platoParrillero.setGuarniciones("papas fritas");

    }
}
