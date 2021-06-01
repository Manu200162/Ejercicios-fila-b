package ejercicio5B;

public class Client {
    public static void main (String [] args){

        String interpretar1="I II III IV V VI VII VIII IX X";
        NoTerminalExpresion parser= new NoTerminalExpresion(interpretar1);
        String interpretado = parser.interpretar();
        System.out.println("************************************************");
        System.out.println("Interpretacion: "+ interpretar1);
        System.out.println("Interpretado: "+ interpretado);
        System.out.println("************************************************");


    }
}
