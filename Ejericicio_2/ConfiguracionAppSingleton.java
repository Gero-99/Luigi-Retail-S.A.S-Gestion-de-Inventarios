//Ejercicio 2
package PatronSingleton.Ejericicio_2;

public class ConfiguracionAppSingleton {

    private String nombreApp;
    private String version;
    private boolean debug;

    private static ConfiguracionAppSingleton setting = new ConfiguracionAppSingleton();


    private ConfiguracionAppSingleton(){
        this.nombreApp = "WhatsApp";
        this.debug = false;
        this.version = "V1.0b";
    }


    public static ConfiguracionAppSingleton getInstance(){
        return setting;
    }

    public String getNombreApp() {
        return nombreApp;
    }

    public String getVersion() {
        return version;
    }

    public boolean isDebug() {
        return debug;
    }





}
