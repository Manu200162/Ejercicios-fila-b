package ejercicio3B;

public class CreatorShorts extends CreatorProductoDeportivo {

    @Override
    public Shorts create() {
        Shorts shorts = new Shorts();
        shorts.setMarca("Puma");
        shorts.setTalla("L");
        shorts.setTamanio("Largo");
        shorts.setPrecio("0000Bs");
        return shorts;
    }
}
