package ejercicio1B;

public class Client {

    public static void main (String[] args){

        Colegio colegio1 = new Colegio();
        colegio1.setNombre("Colegio 1");
        colegio1.pagarMatricula(800,new Estudiante("Juan Lopez","89458245LP"));
        colegio1.pagarMatricula(700,new Estudiante("Lucia Mendez","45632658LP"));
        colegio1.pagarMatricula(900,new Estudiante("Jose Perez","63200125LP"));
        colegio1.pagarMatricula(800,new Estudiante("Juan Lopez","89458245LP"));


        JefeHHRR jrh = new JefeHHRR();
        jrh.setCodigo("45789");
        jrh.setName("Pablo Sanchez");
        jrh.getListaEstudiantes();
        jrh.getNumEstudiantes();
        jrh.consultarSaldoVentanilla();







    }
}
