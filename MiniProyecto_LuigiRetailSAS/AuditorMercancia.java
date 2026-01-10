package PatronSingleton.MiniProyecto_LuigiRetailSAS;

public class AuditorMercancia extends Usuario {


    public AuditorMercancia(int idUsuario, int cedula, String nombres, String apellidos, String correo, String cargo){
        super(idUsuario, cedula, nombres, apellidos, correo, cargo);
    }

    @Override
    public void registrarProductos(Producto producto) {
        BasesDeDatos.getInstance().agregarProducto(producto); //tengo que corregirlo porque depende de los parametros, asi que acá tambien me toca agregarselo a este metodo
        System.out.println("Enviando solicitud a RegistroProductos...");
    }

    @Override
    public void mostrarListas() {
        BasesDeDatos.getInstance().listarProductos();
    }

    @Override
    public void editar() {
        System.out.println("Comunicandose con BasesDeDatos...");
    }

    @Override
    public void borrarProducto(int sku) {
        BasesDeDatos.getInstance().eliminarProducto(sku); //tengo que corregirlo porque depende de los parametros, solo es cambiar el metodo a uno de argumentos.
        System.out.println("Enviando instruccion a BasesDeDatos...");
    }

    @Override
    public void borrarTodo() {
        BasesDeDatos.getInstance().eliminarTodo();
    }
}
