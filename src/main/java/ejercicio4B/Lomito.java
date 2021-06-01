package ejercicio4B;

public class Lomito extends BuilderPlatoParrillero{
    @Override
    public void buildTipoDeCarne() {
        platoParrillero.setTipoDeCarne("lomo");
    }

    @Override
    public void buildSaborRefresco() {
        platoParrillero.setSaborDeRefresco("pepsi");
    }

    @Override
    public void buildGuarniciones() {
        platoParrillero.setGuarniciones("arroz");

    }
}
