package ejercicio3B;

public class Shorts implements IProductoDeportivo{
    private String talla;
    private String tamanio;
    private String marca;
    private String precio;

    public Shorts(){}


    @Override
    public void crear() {
        System.out.println("********Shorts********");
        System.out.println("Talla: "+talla);
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Marca: "+marca);
        System.out.println("Precio: "+precio);
        System.out.println("***********************");

    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
