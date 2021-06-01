package ejercicio4B;

public class Tira extends BuilderPlatoParrillero{
    @Override
    public void buildTipoDeCarne() {
        platoParrillero.setTipoDeCarne("Tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        platoParrillero.setSaborDeRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        platoParrillero.setGuarniciones("fideo");

    }
}
