package PatronSingleton.MiniProyecto_LuigiRetailSAS;

public class ConfiguracionUsuario {


    private static ConfiguracionUsuario configuracion;
    private Usuario usuario;

    private ConfiguracionUsuario(){}


    public static ConfiguracionUsuario getInstance(){

        if(configuracion == null){
            configuracion = new ConfiguracionUsuario();
        }
        return configuracion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void informacion(){
        System.out.println("[ID]: Id: "+usuario.getIdUsuario());
        System.out.println("[DOCUMENT]: Cedula Ciudadania: "+usuario.getCedula());
        System.out.println("[USER]: Usuario: "+usuario.getNombres() +" "+ usuario.getApellidos() );
        System.out.println("[EMAIL]: Correo: "+ usuario.getCorreo());
        System.out.println("[WORK]: Cargo: "+ usuario.getCargo());
    }







}
