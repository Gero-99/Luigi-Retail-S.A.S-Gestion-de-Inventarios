package PatronSingleton.MiniProyecto_LuigiRetailSAS.System;

public class AutenticacionLogin {

    public static boolean autenticar(int id, String contrasena){
        return (id == 12345) && (contrasena.equals("luigi99"));
    }



}
