package model.bd;

public class Producto {
    private int id;
    private String nombre;
    private int costeDeCompra;
    private int costeDeVenta;
    private int cantidad;
    private int idTipoProductoFK;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosteDeCompra() {
        return costeDeCompra;
    }

    public void setCosteDeCompra(int costeDeCompra) {
        this.costeDeCompra = costeDeCompra;
    }

    public int getCosteDeVenta() {
        return costeDeVenta;
    }

    public void setCosteDeVenta(int costeDeVenta) {
        this.costeDeVenta = costeDeVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdTipoProductoFK() {
        return idTipoProductoFK;
    }

    public void setIdTipoProductoFK(int idTipoProductoFK) {
        this.idTipoProductoFK = idTipoProductoFK;
    }
    
}
