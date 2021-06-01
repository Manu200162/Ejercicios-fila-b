package ejercicio2B;

public class Client {

    public static void main (String[] args){
        //modelo = A1
        //tamanio = pequeño
        //peso = 60
        //camara(foco,lente) = (foco=10,lente=5mp)
        //origen = Bolivia
        //imei = 10001

        Celular base = new Celular();
        base.setModelo("A1");
        base.setTamanio("pequeño");
        base.setPeso(60);
        base.setCamara(new Camara(10,"5mp"));
        base.setOrigen("Bolivia");
        base.setImei(10001);

        Celular celu1 = (Celular) base.clone();
        celu1.setImei(10002);

        Celular celu2 = (Celular) base.clone();
        celu2.setImei(10003);

        Celular celu3 = (Celular) base.clone();
        celu3.setImei(10004);

        Celular celu4 = (Celular) base.clone();
        celu4.setImei(10005);

        Celular celu5 = (Celular) base.clone();
        celu5.setImei(10006);

        celu1.showInfo();
        celu2.showInfo();
        celu3.showInfo();
        celu4.showInfo();
        celu5.showInfo();

    }
}
