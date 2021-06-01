package ejercicio4B;

public class Client {

    public static void main (String[] args){
        Parrillero juan = new Parrillero();
        Bife bife= new Bife();
        Lomito lomito= new Lomito();
        Tira tira= new Tira();

        juan.setBuilderPlatoParrillero(bife);
        juan.cocinar();
        PlatoParrillero pBife = juan.getPlatoParrillero();
        pBife.showInfo();

        juan.setBuilderPlatoParrillero(lomito);
        juan.cocinar();
        PlatoParrillero pLomito = juan.getPlatoParrillero();
        pLomito.showInfo();

        juan.setBuilderPlatoParrillero(tira);
        juan.cocinar();
        PlatoParrillero pTira = juan.getPlatoParrillero();
        pTira.showInfo();
    }




}
