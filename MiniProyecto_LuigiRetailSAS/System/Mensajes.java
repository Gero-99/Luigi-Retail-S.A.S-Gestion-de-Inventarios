package PatronSingleton.MiniProyecto_LuigiRetailSAS.System;

import java.sql.Time;


public class Mensajes {

    //Pantallas de Cargas
    public static void cargando(){
        System.out.println("Cargando informacion...");
    }

    public static void revisandoLogin(){
        System.out.println("Revisando los datos...");
    }

    public static void revisarndo(){
        System.out.println("Revisando los datos...");
    }












//Validar Login
    public static void datosCorrectos(){
        System.out.println("---|| Has Iniciado Seccion ||---");
    }
    public static void datosIncorrectos(){
        System.out.println("---|| Sus datos son incorrectos, vuelvelo a intentar ||---");
    }



// UX GUI principal
    public static void mensajeDeBienvenida(){
        System.out.println("---|| Bienvenido a la aplicacion de inventarios LuigiRetail S.A.S ||---");
    }


    public static void seccionOpciones(){
        System.out.println("|--|||||--| Que deseas hacer |--|||||--|");
        System.out.println("---|| [1]: Editar ||---");
        System.out.println("---|| [2]: Listar Stock del Producto ||---");
        System.out.println("---|| [3]: Cerrar Seccion ||---");
        System.out.println("---|| [4] ||---");
        System.out.println("---|| [5] ||---");
    }



    public static void decisionSalirSeccion(){
        System.out.println("---|| Estas seguro que deseas salir ||---");
        System.out.println("---|| [1]: Si");
        System.out.println("---|| [2]: No");
    }
  public static void salida(){
        System.out.println("---|| [1]: Salir");
    }

    public static void botonIncorrecto(){
        System.out.println("[ERROR] Error, has introducido una opcion no valida");
    }






}
