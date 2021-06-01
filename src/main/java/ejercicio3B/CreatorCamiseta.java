package ejercicio3B;

public class CreatorCamiseta extends CreatorProductoDeportivo {
    @Override
    public Camiseta create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("Celeste");
        camiseta.setMarca("Puma");
        camiseta.setTalla("L");
        camiseta.setPrecio("0000Bs");
        return camiseta;
    }
}
