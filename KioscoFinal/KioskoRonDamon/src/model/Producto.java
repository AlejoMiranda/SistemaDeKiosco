package model;

public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private String descripcion;
    private int precioVenta;
    private int precioCompra;
    private int tipoProductoFK;
    private int proveedorFK;

    public Producto() {
    }

    public Producto(String nombre, int precioVenta) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }
    
    

    public Producto(String nombre, int stock, String descripcion, int precioVenta, int precioCompra, int tipoProductoFK, int proveedorFK) {
        this.nombre = nombre;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.tipoProductoFK = tipoProductoFK;
        this.proveedorFK = proveedorFK;
    }
    
    
    

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getTipoProductoFK() {
        return tipoProductoFK;
    }

    public void setTipoProductoFK(int tipoProductoFK) {
        this.tipoProductoFK = tipoProductoFK;
    }

    public int getProveedorFK() {
        return proveedorFK;
    }

    public void setProveedorFK(int proveedorFK) {
        this.proveedorFK = proveedorFK;
    }
    
    
}
