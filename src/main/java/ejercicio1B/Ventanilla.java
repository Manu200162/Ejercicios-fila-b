package ejercicio1B;

import java.util.HashMap;

public class Ventanilla {

    private static Ventanilla instancia = null;
    private int saldo;
    private int numEstudiantes;
    private HashMap<String,Estudiante> estudiantes;

    private Ventanilla(){
        this.saldo = 0;
        estudiantes = new HashMap<>();
        numEstudiantes=0;
        System.out.println("******Instanciando Ventanilla*********");
    }

    public static synchronized void makeInstance(){
        if(instancia==null){
            instancia = new Ventanilla();
        }
    }
    public static synchronized Ventanilla getInstancia(){
        if(instancia== null){
            makeInstance();
        }
        return instancia;
    }

    public synchronized void cobroMatricula(int monto, Estudiante estudiante){
        if(!estudiantes.containsKey(estudiante.getCi())) {
            saldo = saldo + monto;
            ++numEstudiantes;
            estudiantes.put(estudiante.getCi(), estudiante);
            System.out.println("Se realizo la matriculacion con el monto de : " + monto +
                    " del estudiante con los siguientes datos: ");
            estudiante.showEstudiante();
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public HashMap<String, Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
