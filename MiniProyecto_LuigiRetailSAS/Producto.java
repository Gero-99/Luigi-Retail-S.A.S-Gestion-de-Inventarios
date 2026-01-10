package PatronSingleton.MiniProyecto_LuigiRetailSAS;

import java.time.LocalDate;
import java.util.Date;

public class Producto {

    private int sku;
    private String nombre;
    private double precio;
    private String codigoBarra;
    private LocalDate fechaExpedicion;
    private LocalDate fechaExpiracion;

    public Producto(int sku, String nombre, String codigoBarra, double precio, LocalDate fechaExpedicion, LocalDate fechaExpiracion) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoBarra = codigoBarra;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaExpiracion = fechaExpiracion;
    }



    public int getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }




    public void setSku(int sku) {
        this.sku = sku;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }




    @Override
    public String toString() {
        return "Sku: "+sku+
                " Nombre: "+nombre+
                " Precio: "+precio+
                " Codigo de Barra: "+codigoBarra+
                " Fecha de Expedicion: "+fechaExpedicion+
                " Fecha de Expiracion: "+fechaExpiracion;
    }

}
