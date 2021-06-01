package ejercicio3B;

public class Tenis implements IProductoDeportivo {
    private String talla;
    private String proovedor;
    private String marca;
    private String material;
    private String precio;

    public Tenis(){}


    @Override
    public void crear() {
        System.out.println("********Tenis********");
        System.out.println("Talla: "+talla);
        System.out.println("Proovedor: "+proovedor);
        System.out.println("Marca: "+marca);
        System.out.println("Material: "+material);
        System.out.println("Precio: "+precio);
        System.out.println("**********************");
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
