package ejercicio3B;

public class Client {

    public static void main(String[] args){

        Medias medias =  new CreatorMedias().create();
        medias.setPrecio("40 Bs");
        medias.crear();

        Shorts shorts =  new CreatorShorts().create();
        shorts.setPrecio("150 Bs");
        shorts.crear();

        PelotaFutbol pelota =  new CreatorPelotaFutbol().create();
        pelota.setPrecio("500 Bs");
        pelota.crear();

        Camiseta camiseta =  new CreatorCamiseta().create();
        camiseta.setPrecio("350 Bs");
        camiseta.crear();

        Tenis tenis = (Tenis) new CreatorTenis().create();
        tenis.setPrecio("700 Bs");
        tenis.crear();

    }
}
