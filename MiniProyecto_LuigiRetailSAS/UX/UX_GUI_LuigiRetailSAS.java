package PatronSingleton.MiniProyecto_LuigiRetailSAS.UX;

import PatronSingleton.MiniProyecto_LuigiRetailSAS.Producto;
import PatronSingleton.MiniProyecto_LuigiRetailSAS.System.AutenticacionLogin;
import PatronSingleton.MiniProyecto_LuigiRetailSAS.System.Mensajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UX_GUI_LuigiRetailSAS {

    public static Scanner teclado = new Scanner(System.in);
    static int opcion;




    public static void login(){
       int id;
       String contrasena;

        System.out.println("-------------------------------");
        System.out.println("--|| Login  LuigiRetailSAS ||--");
        System.out.println("Id del Usuario: ");
        id= teclado.nextInt();
        System.out.println("Contraseña: ");
        teclado.nextLine();
        contrasena= teclado.nextLine();

        AutenticacionLogin.autenticar(id,contrasena);

    }


    public static void pantallaPrincipal(){
        Mensajes.mensajeDeBienvenida();
        Mensajes.seccionOpciones();
        opcion = teclado.nextInt();


    }


    public static void pantallaEditar(){}


    public static void pantallaListaProductos(){
        System.out.println("Productos y Stocks disponibles");

        List<Producto> stocks = new ArrayList<>();
        for (Producto producto: stocks ){

        }




    }

    public static void pantalla(){}


    public static void pantallaCerrarApp(){
        Mensajes.decisionSalirSeccion();
    }


}
