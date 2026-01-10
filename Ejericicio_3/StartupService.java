package PatronSingleton.Ejericicio_3;

import PatronSingleton.Ejericicio_3.Interface.Services;

public class StartupService implements Services {

    private AppInfoSingleton appInfo;

    public StartupService(AppInfoSingleton appInfo){
        this.appInfo = appInfo;
    }

    @Override
    public void informacion() {
        System.out.println("Informacion de la App:");

        System.out.println(appInfo.getFecha());
        System.out.println(appInfo.getAutor());
        System.out.println(appInfo.getVersion());
    }
}
