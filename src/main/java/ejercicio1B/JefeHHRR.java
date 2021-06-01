package ejercicio1B;

import java.util.HashMap;

public class JefeHHRR {
    private String name;
    private String codigo;

    public JefeHHRR(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void consultarSaldoVentanilla(){
        int saldo = Ventanilla.getInstancia().getSaldo();
        System.out.println("El saldo disponible en ventanilla es: "+saldo);
    }
    public void getListaEstudiantes(){
        HashMap<String,Estudiante> registroEstudiantes = Ventanilla.getInstancia().getEstudiantes();
        System.out.println("La lista de estudiantes matriculados es: ");
        for(String ci: registroEstudiantes.keySet()){
            registroEstudiantes.get(ci).showEstudiante();
        }
    }

    public void getNumEstudiantes(){
        int numEstudiantes = Ventanilla.getInstancia().getNumEstudiantes();
        System.out.println("El numero de estudiantes que se matricularon es: "+numEstudiantes);
    }
}
