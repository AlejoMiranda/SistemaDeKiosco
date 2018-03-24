package model.bd;

/**
 *
 * @author dumbo
 */
public class HistoricoVenta {

    private int id;
    private int venta;
    private String fecha;
    private int cantidad;
    private int idProductoFK;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProductoFK() {
        return idProductoFK;
    }

    public void setIdProductoFK(int idProductoFK) {
        this.idProductoFK = idProductoFK;
    }
    
    
}
