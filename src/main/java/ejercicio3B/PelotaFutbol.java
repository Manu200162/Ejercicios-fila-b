package ejercicio3B;

public class PelotaFutbol implements IProductoDeportivo {
    private String tamanio;
    private String color;
    private String garantia;
    private String precio;

    public PelotaFutbol(){}

    @Override
    public void crear() {
        System.out.println("********Pelota de futbol********");
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Color: "+color);
        System.out.println("Garantia: "+garantia);
        System.out.println("Precio: "+precio);
        System.out.println("********************************");
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
