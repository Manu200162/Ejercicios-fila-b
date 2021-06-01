package ejercicio2B;

public class Celular implements ICelular{
    private String  modelo;
    private String  tamanio;
    private int     peso ;
    private Camara  camara;
    private String  origen;
    private int     imei ;

    public Celular(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    @Override
    public Object clone() {
        Celular objClone= new Celular();
        objClone.setModelo(this.modelo);
        objClone.setPeso(this.peso);
        objClone.setTamanio(this.tamanio);
        objClone.setImei(this.imei);
        objClone.setCamara(this.camara);
        objClone.setOrigen(this.origen);

        return objClone;
    }

    public void showInfo(){
        System.out.println("**********************************");
        System.out.println("Modelo: "+modelo);
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Peso: "+peso);
        System.out.println("Camara foco: "+camara.getFoco()+" camara lente: "+camara.getLente());
        System.out.println("Origen: "+origen);
        System.out.println("Imei: "+imei);
        System.out.println("**********************************");
    }
}
