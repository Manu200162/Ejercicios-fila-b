package ejercicio3B;

public class Camiseta implements IProductoDeportivo {
    private String marca;
    private String talla;
    private String color;
    private String precio;

    public Camiseta(){}


    @Override
    public void crear() {
        System.out.println("******** Camiseta********");
        System.out.println("Marca: "+marca);
        System.out.println("Talla: "+talla);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
        System.out.println("**************************");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
