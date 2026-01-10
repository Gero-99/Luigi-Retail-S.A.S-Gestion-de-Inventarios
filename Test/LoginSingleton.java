package PatronSingleton.Test;
//SIngleto perezoso
public class LoginSingleton {
    private String musica;
    private static LoginSingleton login;

    private LoginSingleton(){
        System.out.println("Iniciado");
    }

    public static LoginSingleton getInstance(){
        if(login == null){
            login = new LoginSingleton();
        }
        return login;
    }


    public void reproducir(String musica){
        System.out.println("Reproduciendo:"+musica);
    }


    }




