package ejercicio3B;

public class CreatorPelotaFutbol extends CreatorProductoDeportivo{
    @Override
    public PelotaFutbol create() {
        PelotaFutbol pelota = new PelotaFutbol();
        pelota.setColor("Blanco");
        pelota.setGarantia("2 años");
        pelota.setTamanio("Mediano");
        pelota.setPrecio("0000Bs");
        return pelota;
    }
}
