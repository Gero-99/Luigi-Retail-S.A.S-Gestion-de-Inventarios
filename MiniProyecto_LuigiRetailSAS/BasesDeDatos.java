package PatronSingleton.MiniProyecto_LuigiRetailSAS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasesDeDatos {

private static BasesDeDatos db;
private static List<Producto> productos = new ArrayList<>();



private BasesDeDatos(){

    productos.add(new Producto(023452,"AguaDelMar","770231121232", 2500,(LocalDate.of(2025,12,02)), (LocalDate.of(2027,12,25)) ));
    productos.add(new Producto(839131,"Alcohol JGB","770239523942", 1000,(LocalDate.of(2025,11,29)), (LocalDate.of(2026,11,11)) ));

}

    public static BasesDeDatos getInstance(){
    if (db == null){
        db = new BasesDeDatos();
    }
    return db;
    }



    public void listarProductos(){
        System.out.println("Mercancias existentes:");
        for (Producto producto: productos) {
            System.out.println(producto);
        }
    }

    public List<Producto> agregarProducto(Producto producto){
        productos.add(producto);
        return productos;
    }

    public List<Producto> eliminarProducto(int sku){
        productos.removeIf(producto -> producto.getSku()==sku);
        return productos;
    }


    public List<Producto> eliminarTodo(){ //Faltan Ajustes, estoy en esos ajustes.
        productos.clear();
        System.out.println("Se ha borrado todo");
        return productos;
    }

    //en desarrollo, favor ten panciencia.




}
