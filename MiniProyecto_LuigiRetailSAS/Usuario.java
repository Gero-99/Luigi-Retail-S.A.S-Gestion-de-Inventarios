package PatronSingleton.MiniProyecto_LuigiRetailSAS;

public abstract class Usuario {

    private int idUsuario;
    private int cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String cargo;

    public Usuario(int idUsuario, int cedula, String nombres, String apellidos, String correo, String cargo){
        this.idUsuario = idUsuario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.cargo = cargo;
    }



    public int getIdUsuario() {
        return idUsuario;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCargo() {
        return cargo;
    }



    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void registrarProductos(Producto producto);
    public abstract void mostrarListas();
    public abstract void borrarProducto(int sku);
    public abstract void borrarTodo();
    public abstract void editar();






}
