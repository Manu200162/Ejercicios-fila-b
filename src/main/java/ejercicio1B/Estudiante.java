package ejercicio1B;

public class Estudiante {
    private String nombre;
    private String ci;

    public Estudiante(){}

    public Estudiante(String nombre, String ci){
        this.nombre=nombre;
        this.ci=ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void showEstudiante(){
        System.out.println("************************");
        System.out.println("Nombre: "+nombre);
        System.out.println("Ci: "+ci);
        System.out.println("************************");
    }
}
