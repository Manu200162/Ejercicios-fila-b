package ejercicio4B;

public class PlatoParrillero {
    private String tipoDeCarne;
    private String saborDeRefresco;
    private String Guarniciones;

    public PlatoParrillero(){}

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborDeRefresco() {
        return saborDeRefresco;
    }

    public void setSaborDeRefresco(String saborDeRefresco) {
        this.saborDeRefresco = saborDeRefresco;
    }

    public String getGuarniciones() {
        return Guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        Guarniciones = guarniciones;
    }
    public void showInfo(){
        System.out.println("**************************************");
        System.out.println("Tipo de carne: "+tipoDeCarne);
        System.out.println("Sabor Refresco: "+saborDeRefresco);
        System.out.println("Guarniciones: "+Guarniciones);
        System.out.println("**************************************");
    }
}
