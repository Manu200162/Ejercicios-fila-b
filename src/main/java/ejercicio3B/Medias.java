package ejercicio3B;

public class Medias implements IProductoDeportivo{

    private String largo;
    private String material;
    private String grosor;
    private String marca;
    private String precio;

    public Medias() { }

    @Override
    public void crear() {
        System.out.println("********Medias*********");
        System.out.println("Largo: "+largo);
        System.out.println("Material: "+material);
        System.out.println("Grosor: "+grosor);
        System.out.println("Marca: "+marca);
        System.out.println("Precio: "+precio);
        System.out.println("***********************");
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGrosor() {
        return grosor;
    }

    public void setGrosor(String grosor) {
        this.grosor = grosor;
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
