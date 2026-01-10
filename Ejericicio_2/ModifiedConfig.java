package PatronSingleton.Ejericicio_2;

//Ejercicio 2 ExtensionFuncionalidad
import PatronSingleton.Ejericicio_2.Interface.Rename;
import PatronSingleton.Ejericicio_2.Interface.Updates;

public class ModifiedConfig implements Rename, Updates {

    private ConfiguracionAppSingleton setting;

    public ModifiedConfig(ConfiguracionAppSingleton setting){
        this.setting = setting;
    }


    @Override
    public void renameName(String nameApp) {

        System.out.println("Se realizó el cambio de nombre con exito, nueva version: "+ nameApp);


    }

    @Override
    public void updateVersion(String versionApp) {

        System.out.println("Se realizó la actualizacion con exito, nueva version: "+ versionApp);


    }


}



/* Bodega de Reciclaje para reformular ideas:

   if(ConfiguracionAppSingleton.getInstance().isDebug()){
            System.out.println("[ERROR], Error, Ya se realizó el cambio, vuelve dentro de 1 hora ^_^");
        }
*/