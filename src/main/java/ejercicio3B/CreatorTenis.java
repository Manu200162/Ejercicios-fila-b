package ejercicio3B;

public class CreatorTenis extends CreatorProductoDeportivo{
    @Override
    public IProductoDeportivo create() {
        Tenis tenis = new Tenis();
        tenis.setMarca("Nike");
        tenis.setMaterial("Sintetico");
        tenis.setProovedor("Fair play");
        tenis.setTalla("42 US");
        tenis.setPrecio("00000Bs");
        return tenis;

    }
}
