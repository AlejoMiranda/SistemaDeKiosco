package model.bd;

public class Proveedor {
    
    private int id;
    private String nombre;
    private int idProductoFK;

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

    public int getIdProductoFK() {
        return idProductoFK;
    }

    public void setIdProductoFK(int idProductoFK) {
        this.idProductoFK = idProductoFK;
    }
  
    
}
