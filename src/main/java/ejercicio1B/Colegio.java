package ejercicio1B;

public class Colegio {

    private String nombre;
    public Colegio(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void pagarMatricula(int monto, Estudiante estudiante){
        Ventanilla.getInstancia().cobroMatricula(monto,estudiante);
    }
}
