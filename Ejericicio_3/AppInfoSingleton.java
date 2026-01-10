package PatronSingleton.Ejericicio_3;

import java.util.Date;

public class AppInfoSingleton {

    private String version;
    private Date fecha;
    private String autor;



    private static AppInfoSingleton info = new AppInfoSingleton();


    private AppInfoSingleton(){
        this.version = "V0.1a";
        this.fecha = new Date("06/02/2015") ;
        this.autor = "Guillermo";
    }



    public static AppInfoSingleton getInstance(){
        return info;
    }

    public String getVersion() {
        return version;
    }

    public String getAutor() {
        return autor;
    }

    public Date getFecha() {
        return fecha;
    }


}
