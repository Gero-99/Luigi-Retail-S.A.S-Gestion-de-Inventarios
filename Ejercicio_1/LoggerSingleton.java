//Ejercicio 1, Singeton ansioso
package PatronSingleton.Ejercicio_1;

public class LoggerSingleton {

    private static LoggerSingleton log = new LoggerSingleton();

    private LoggerSingleton(){

    }


    public static LoggerSingleton getInstance(){
        return log;
    }

    public void Login(){
        System.out.println("Inicio de seccion exitoso");
    }

    public void refuseLogin(){
        System.out.println("Error, Intentelo de nuevo");
    }






}
