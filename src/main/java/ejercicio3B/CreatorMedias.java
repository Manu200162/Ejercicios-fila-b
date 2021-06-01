package ejercicio3B;

import javax.print.attribute.standard.Media;

public class CreatorMedias extends CreatorProductoDeportivo{
    @Override
    public Medias create() {
        Medias medias = new Medias();
        medias.setLargo("corto");
        medias.setGrosor("Delgado");
        medias.setMaterial("Algodon y fibra");
        medias.setMarca("Adidas");
        medias.setPrecio("0000Bs");
        return medias;

    }
}
